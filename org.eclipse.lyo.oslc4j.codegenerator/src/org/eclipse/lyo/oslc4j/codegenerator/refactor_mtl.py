import os
import re
from pathlib import Path

BASE_DIR = "/Users/petr/School/bakalarka/lyo.designer/org.eclipse.lyo.oslc4j.codegenerator/src/org/eclipse/lyo/oslc4j/codegenerator"
PYTHON_DIR = os.path.join(BASE_DIR, "python")
JAVA_DIR = os.path.join(BASE_DIR, "java")
COMMON_DIR = os.path.join(BASE_DIR, "common")

def parse_mtl_blocks(content):
    blocks = []
    i = 0
    n = len(content)
    
    current_block_type = 'text'
    current_content = ""
    start_idx = 0
    
    in_string = False
    string_char = ''
    
    while i < n:
        char = content[i]
        
        if in_string:
            current_content += char
            if char == string_char:
                if i > 0 and content[i-1] != '\\':
                    in_string = False
            i += 1
            continue
            
        if char == "'" or char == "\"":
            if current_block_type not in ['text', 'comment']:
                in_string = True
                string_char = char
            current_content += char
            i += 1
            continue
            
        if char == '[':
            match_word = re.match(r'^\[([a-zA-Z]+)', content[i:])
            if match_word:
                word = match_word.group(1)
                if current_block_type == 'text' and current_content:
                    blocks.append({'type': 'text', 'content': current_content, 'start': start_idx, 'end': i})
                    current_content = ""
                    start_idx = i
                
                if word in ['query', 'template', 'comment', 'module', 'import']:
                    current_block_type = word
                    current_content = ""
        
        if current_block_type in ['module', 'import']:
            current_content += char
            if char == ']':
                blocks.append({'type': current_block_type, 'content': current_content, 'start': start_idx, 'end': i + 1})
                current_block_type = 'text'
                current_content = ""
                start_idx = i + 1
            i += 1
            continue
            
        if current_block_type == 'query':
            current_content += char
            if char == ']' and i > 0 and content[i-1] == '/':
                blocks.append({'type': current_block_type, 'content': current_content, 'start': start_idx, 'end': i + 1})
                current_block_type = 'text'
                current_content = ""
                start_idx = i + 1
            i += 1
            continue

        if current_block_type == 'comment':
            current_content += char
            if char == ']' and i > 0 and content[i-1] == '/':
                blocks.append({'type': current_block_type, 'content': current_content, 'start': start_idx, 'end': i + 1})
                current_block_type = 'text'
                current_content = ""
                start_idx = i + 1
            elif char == ']' and content[i-len('[/comment]')+1:i+1] == '[/comment]':
                blocks.append({'type': current_block_type, 'content': current_content, 'start': start_idx, 'end': i + 1})
                current_block_type = 'text'
                current_content = ""
                start_idx = i + 1
            i += 1
            continue
            
        if current_block_type == 'template':
            current_content += char
            if char == ']' and content[i-len('[/template]')+1:i+1] == '[/template]':
                blocks.append({'type': current_block_type, 'content': current_content, 'start': start_idx, 'end': i + 1})
                current_block_type = 'text'
                current_content = ""
                start_idx = i + 1
            i += 1
            continue
            
        current_content += char
        i += 1
        
    if current_content:
        blocks.append({'type': current_block_type, 'content': current_content, 'start': start_idx, 'end': i})
        
    return blocks

def extract_info(block):
    if block['type'] == 'query':
        m = re.search(r'\[query\s+(?:public|private|protected)?\s*([a-zA-Z0-9_]+)\s*\((.*?)\)', block['content'])
        if m:
            name = m.group(1)
            params = re.sub(r'\s+', '', m.group(2))
            return name, f"{name}({params})"
    elif block['type'] == 'template':
        m = re.search(r'\[template\s+(?:public|private|protected)?\s*([a-zA-Z0-9_]+)\s*\((.*?)\)', block['content'])
        if m:
            name = m.group(1)
            params = re.sub(r'\s+', '', m.group(2))
            return name, f"{name}({params})"
    return None, None

def extract_urls(content):
    m = re.search(r'\[module\s+[a-zA-Z0-9_]+\s*\((.*?)\)', content)
    if not m: return set()
    urls_str = m.group(1)
    return set([u.strip().strip("'").strip('"') for u in urls_str.split(',') if u.strip()])

def extract_module_name(content):
    m = re.search(r'\[module\s+([a-zA-Z0-9_]+)', content)
    if m: return m.group(1)
    return ""

def get_used_names(block_content, all_known_names):
    words = re.findall(r'[a-zA-Z0-9_]+', block_content)
    return set(words).intersection(all_known_names)

def attach_comments(blocks, pf):
    res = []
    last_comment = None
    for b in blocks:
        if b['type'] == 'comment':
            last_comment = b
        elif b['type'] in ['query', 'template']:
            name, sig = extract_info(b)
            if name:
                b['name'] = name
                b['signature'] = sig
                b['comment'] = last_comment
                b['pf'] = pf
                res.append(b)
            last_comment = None
        elif b['type'] == 'text' and not b['content'].strip():
            pass
        else:
            last_comment = None
    return res

def clean_file(path, comment_block, query_block):
    with open(path, 'r') as f:
        content = f.read()
    
    if comment_block:
        content = content.replace(comment_block['content'], '')
    if query_block:
        content = content.replace(query_block['content'], '')
        
    content = re.sub(r'\n{3,}', '\n\n', content)
    with open(path, 'w') as f:
        f.write(content)

def add_import_if_needed(path, common_pf, dep_name):
    if not os.path.exists(path):
        return
        
    normalized_path = os.path.normpath(path)
    normalized_common_path = os.path.normpath(os.path.join(COMMON_DIR, common_pf))
    if normalized_path == normalized_common_path:
        return

    with open(path, 'r') as f:
        content = f.read()
    
    words = set(re.findall(r'[a-zA-Z0-9_]+', content))
    if dep_name not in words:
        return
        
    import_path = common_pf.replace('.mtl', '').replace('/', '::')
    import_stmt = f"[import org::eclipse::lyo::oslc4j::codegenerator::common::{import_path}/]"
    
    if import_stmt in content:
        return
        
    blocks = parse_mtl_blocks(content)
    for b in blocks:
        if b['type'] == 'module':
            end_idx = b['end']
            new_content = content[:end_idx] + "\n" + import_stmt + content[end_idx:]
            with open(path, 'w') as f:
                f.write(new_content)
            return

def get_all_applicable_files():
    files = []
    for d in [PYTHON_DIR, JAVA_DIR, COMMON_DIR]:
        if not os.path.exists(d): continue
        for root, _, fs in os.walk(d):
            for f in fs:
                if f.endswith('.mtl'):
                    files.append(os.path.join(root, f))
    return files

def process_step():
    python_files = []
    for root, dirs, files in os.walk(PYTHON_DIR):
        for f in files:
            if f.endswith('.mtl'):
                python_files.append(os.path.relpath(os.path.join(root, f), PYTHON_DIR))
                
    all_blocks = []
    
    p_queries_dict = {}
    j_queries_dict = {}
    
    java_raw = {}
    python_raw = {}
    
    for d in [PYTHON_DIR, JAVA_DIR, COMMON_DIR]:
        if not os.path.exists(d): continue
        for root, dirs, files in os.walk(d):
            for f in files:
                if f.endswith('.mtl'):
                    pf = os.path.relpath(os.path.join(root, f), d)
                    with open(os.path.join(root, f)) as file:
                        content = file.read()
                        blocks = attach_comments(parse_mtl_blocks(content), pf)
                        all_blocks.extend(blocks)
                        
                        if d == PYTHON_DIR:
                            p_queries_dict[pf] = {b['signature']: b for b in blocks}
                            python_raw[pf] = content
                        elif d == JAVA_DIR:
                            j_queries_dict[pf] = {b['signature']: b for b in blocks}
                            java_raw[pf] = content
                            
    all_names = {b['name'] for b in all_blocks}
    
    candidate_identicals = []
    for pf in p_queries_dict:
        if pf in j_queries_dict:
            for sig, p_b in p_queries_dict[pf].items():
                if sig in j_queries_dict[pf]:
                    j_b = j_queries_dict[pf][sig]
                    if p_b['content'].strip() == j_b['content'].strip():
                        candidate_identicals.append((pf, sig, p_b, j_b))
                        
    matched_sigs = {(pf, sig) for pf, sig, p_b, j_b in candidate_identicals}
    
    changed = True
    while changed:
        changed = False
        bad_names = set()
        
        for b in all_blocks:
            is_in_pj = False
            pf = b['pf']
            
            if (pf in p_queries_dict and b['signature'] in p_queries_dict[pf]) or (pf in j_queries_dict and b['signature'] in j_queries_dict[pf]):
                is_in_pj = True
                
            if is_in_pj:
                if (pf, b['signature']) not in matched_sigs:
                    bad_names.add(b['name'])

        to_remove = []
        for cand in candidate_identicals:
            pf, sig, p_b, j_b = cand
            deps = get_used_names(p_b['content'], all_names)
            
            is_safe = True
            for dep in deps:
                if dep in bad_names:
                    is_safe = False
                    break
                    
            if not is_safe:
                to_remove.append(cand)
                
        for r in to_remove:
            candidate_identicals.remove(r)
            matched_sigs.remove((r[0], r[1]))
            changed = True
            
    if not candidate_identicals:
        return False
        
    pf, sig, p_b, j_b = candidate_identicals[0]
    name = p_b['name']
    
    print(f"Refactoring {name} ({sig}) from {pf} -> common")
    
    c_path = os.path.join(COMMON_DIR, pf)
    os.makedirs(os.path.dirname(c_path), exist_ok=True)
    
    if not os.path.exists(c_path):
        p_urls = extract_urls(python_raw[pf])
        j_urls = extract_urls(java_raw[pf])
        intersect_urls = p_urls.intersection(j_urls)
        urls_str = ", ".join(["'{}'".format(u) for u in sorted(intersect_urls)])
        mod_name = extract_module_name(python_raw[pf])
        with open(c_path, 'w') as f:
            f.write("[comment encoding = UTF-8 /]\n")
            f.write(f"[module {mod_name}({urls_str})/]\n\n")

    with open(c_path, 'a') as f:
        if j_b['comment']:
            f.write(j_b['comment']['content'] + "\n")
        f.write(j_b['content'] + "\n\n")
        
    clean_file(os.path.join(PYTHON_DIR, pf), p_b['comment'], p_b)
    clean_file(os.path.join(JAVA_DIR, pf), j_b['comment'], j_b)
    
    for mtl_file in get_all_applicable_files():
        add_import_if_needed(mtl_file, pf, name)
        
    return True

if __name__ == "__main__":
    count = 0
    while True:
        if not process_step():
            break
        count += 1
    print(f"Iteratively refactored {count} query/template signatures!")
