import { Component, OnDestroy, AfterViewInit, Output, EventEmitter, Input } from '@angular/core';
import { Subject } from 'rxjs';
import { debounceTime, distinctUntilChanged } from 'rxjs/operators';
import { SearchService } from '../search.service';
import { PopupComponent } from 'src/app/popup/popup.component';

@Component({
  selector: 'app-search-header',
  templateUrl: './search-header.component.html',
  styleUrls: ['./search-header.component.scss']
})
export class SearchHeaderComponent implements AfterViewInit, OnDestroy {

  @Input() public noDataText: string;
  @Input() public searchPlaceholderText: string;
  @Output() itemsSelected = new EventEmitter<{ resource: string, text: string }[]>();

  public searchValue = '';
  public debouncedInputValue = this.searchValue;
  private searchDecouncer$: Subject<string> = new Subject();

  public busy: boolean;
  public selectedRows: Array<{ selected: boolean, item: any }> = [];
  public searchResult$: Subject<any> = new Subject();

  constructor(public searchService: SearchService) {
  }

  ngAfterViewInit() {
    this.setupSearchDebouncer();
  }

  ngOnDestroy() {
    console.log(`Destroying HeaderComponent`);
  }

  public onSearchInputChange(term: string): void {
    this.searchDecouncer$.next(term);
  }

  public onSearch(): void {
    this.selectedRows = [];
    this.search();
  }

  public onItemSelected(item, index) {
    this.selectedRows[index] = {
      selected: !this.selectedRows[index]?.selected,
      item
    };

    const labelFieldName = this.searchService.fields[0]; // will get the first one as the main
    const result = this.selectedRows
      .filter(x => x.selected === true)
      .map(x => ({ resource: x.item.resource, text: x.item[labelFieldName] }));
    this.itemsSelected.emit(result);
  }

  public renderPreviewIframe(popup: any, resourceUrl) {
    this.searchService.getPreviewIframe(resourceUrl).subscribe((result) => {
      popup.Content = result;
    });
  }

  private setupSearchDebouncer(): void {
    this.searchDecouncer$.pipe(
      debounceTime(500),
      distinctUntilChanged(),
    ).subscribe((term: string) => {
      this.debouncedInputValue = term;
      this.search();
    });
  }

  private search(): void {

    this.busy = true;

    // Clear results
    this.searchResult$.next(null);

    // Make API call
    this.searchService.search(this.debouncedInputValue)
      .subscribe((result) => {
        if (result.length === 0) {
          result = null;
        }
        this.searchResult$.next(result);
        this.busy = false;
      });
  }
}
