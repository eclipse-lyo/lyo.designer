import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { tap, map, catchError } from 'rxjs/operators';
import { Observable, of } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class SearchService {
  public baseUrl: string;
  public fields: Array<string>;

  constructor(private http: HttpClient) { }

  search(term: string) {
    const url = `${this.baseUrl}?terms=${term.toLowerCase().trim()}`;
    return this.http.get(url)
      .pipe(
        tap(x => {
          console.log('Get data: ', x);
        }),
        map(result => {
          const items = result['oslc:results'] as [];
          const searchResult = items.map((x, i) => {
            const item = {
              id: i + 1,
              resource: x['rdf:resource']
            };
            this.fields.map(f => {
              item[f] = x[f];
            });
            return item;
          });

          return searchResult;
        })
      );
  }

  // Perform an asynch GET request to obtain the resource's UI-Preview information (an OSLC Compact resource).
  // callbackFunction is then called once the request response is obtained.
  // The caller should supply this callbackFunction, with any desired paramters under "callbackParamter"
  // callbackFunction will be called with the following paramters (a) iframeTitle, (b) iframeHtml, (c) compactStructure, (d) callbackParamter
  // where compactStructure represents more detailed about the OSLC Compact resource.
  getPreviewIframe(url: string): Observable<string> {
    const headerDict = {
      Accept: 'application/x-oslc-compact+xml',
    };

    return this.http.get(url, { headers: headerDict, responseType: 'text' })
      .pipe(
        tap(x => {
          console.log('Get preview iframe data: ', x);
        }),
        map(result => {

          const parser = new DOMParser();
          const xmlDoc = parser.parseFromString(result, 'text/xml');
          const compactStructure = parseOslcCompactXmlDocument(xmlDoc);
          const w = compactStructure.width ? compactStructure.width : '45em';
          const h = compactStructure.height ? compactStructure.height : '11em';
          let iframeHtml = '<iframe src=\'' + compactStructure.uri + '\' ';
          iframeHtml += ' style=\'border:0px; height:' + h + '; width:' + w + '\'';
          iframeHtml += '></iframe>';

          return iframeHtml;
        }),
        catchError((err: HttpErrorResponse) => {
          if (err.error instanceof Error) {
            // A client-side or network error occurred. Handle it accordingly.
            console.error('An error occurred:', err.error.message);
            return of(`<b>Error loading the preview dialog</b>, Status: ${err.status}`);
          } else {
            // The backend returned an unsuccessful response code.
            // The response body may contain clues as to what went wrong,
            console.error(`Backend returned code ${err.status}, body was: ${err.error}`);
          }

          return of('<b>Error loading the preview dialog</b>');
        })
      );
  }
}

// returns a JSON struct representing a large or small UI-Preview info (uri, title, height and width) based on an OSLC Compact RDF resource.
function parseOslcCompactXmlDocument(oslcCompactXmlDocument: Document) {
  const compactStructure = {} as any;
  const compact = findFirstChildNode(findFirstChildNode(oslcCompactXmlDocument));

  const titleChild = findFirstChildNodeNamed(compact, 'dcterms:title');
  compactStructure.title = titleChild.textContent;

  const smallPrev = findFirstChildNodeNamed(compact, 'oslc:smallPreview');
  const largePrev = findFirstChildNodeNamed(compact, 'oslc:largePreview');
  let preview;
  if (smallPrev !== null) {
    preview = findFirstChildNode(smallPrev);
  } else {
    preview = findFirstChildNode(largePrev);
  }
  if (preview) {
    const document = findFirstChildNodeNamed(preview, 'oslc:document');
    if (document) { compactStructure.uri = document.getAttribute('rdf:resource'); }
    const height = findFirstChildNodeNamed(preview, 'oslc:hintHeight');
    compactStructure.height = height.textContent;
    const width = findFirstChildNodeNamed(preview, 'oslc:hintWidth');
    compactStructure.width = width.textContent;
  }
  return compactStructure;
}

function findFirstChildNode(e) {
  for (const child of e.childNodes) {
    if (child.nodeType === Node.ELEMENT_NODE) {
      return child;
    }
  }
}

function findFirstChildNodeNamed(e, nodeName) {
  for (const child of e.childNodes) {
    if (child.nodeType === Node.ELEMENT_NODE && child.nodeName === nodeName) {
      return child;
    }
  }
}
