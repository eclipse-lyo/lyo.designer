import { Component, OnInit, Input } from '@angular/core';
import { SearchService } from './search.service';

@Component({
  selector: 'app-selector',
  templateUrl: './selector.component.html',
  styleUrls: ['./selector.component.scss']
})
export class SelectorComponent implements OnInit {

  @Input() noDataText = 'No results to show...';
  @Input() searchPlaceholderText = 'Find a specific resource through a free-text search.';

  @Input() public selectionUri: string;
  @Input() public fields: string;
  private oslcResponse = '';

  constructor(private searchService: SearchService) {
  }

  public onItemsSelected(values: { resource: string, text: string }[]) {
    let result = 'oslc-response:{ "oslc:results": [';
    result += values
      .map(x => ('{"oslc:label": "' + x.text + '", "rdf:resource": "' + x.resource + '"}'))
      .join(', ');
    result += ']}';

    this.oslcResponse = result;
  }

  ngOnInit(): void {
    this.searchService.baseUrl = this.selectionUri;
    const fields = JSON.parse(this.fields);
    this.searchService.fields = fields;
  }

  public onOk() {
    const oslcResponse = this.oslcResponse;
    this.sendResponse(oslcResponse);
  }

  public onCancel() {
    const oslcResponse = 'oslc-response:{ "oslc:results": [ ]}';
    this.sendResponse(oslcResponse);
  }

  private sendResponse(oslcResponse: string) {
    console.log('oslcResponse: ', oslcResponse);
    if (window.location.hash === '#oslc-core-windowName-1.0') {
      // Window Name protocol in use
      this.respondWithWindowName(oslcResponse);
    } else if (window.location.hash === '#oslc-core-postMessage-1.0') {
      // Post Message protocol in use
      this.respondWithPostMessage(oslcResponse);
    }
  }

  private respondWithPostMessage(response: string) {
    if (window.parent != null) {
      window.parent.postMessage(response, '*');
    } else {
      window.postMessage(response, '*');
    }
  }

  private respondWithWindowName(response: string) {
    const returnURL = window.name;
    window.name = response;
    window.location.href = returnURL;
  }
}
