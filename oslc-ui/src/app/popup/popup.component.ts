import {
  ChangeDetectionStrategy, ChangeDetectorRef, Component, ElementRef, EventEmitter, Input, OnDestroy, OnInit, Output,
  ViewChild
} from '@angular/core';
import { CdkOverlayOrigin } from '@angular/cdk/overlay';
import { Subject, fromEvent } from 'rxjs';
import { filter, switchMap, startWith, debounceTime, share, takeUntil, switchMapTo, map } from 'rxjs/operators';
import { DomSanitizer, SafeHtml } from '@angular/platform-browser';

@Component({
  selector: 'app-popup',
  templateUrl: './popup.component.html',
  styleUrls: ['./popup.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class PopupComponent implements OnDestroy, OnInit {
  @Input() CdkOverlayOrigin: CdkOverlayOrigin;
  @Output() close = new EventEmitter<any>();
  @Output() open = new EventEmitter<any>();
  @ViewChild('dialog') dialog: ElementRef;

  private _content: SafeHtml;
  public get SafeContent(): SafeHtml {
    return this._content;
  }
  public set Content(value: string) {
    this._content = this.sanitizer.bypassSecurityTrustHtml(value);
    this.changeDetectorRef.markForCheck();
  }

  isOpened = false;
  destroy$ = new Subject<any>();

  constructor(private changeDetectorRef: ChangeDetectorRef, private sanitizer: DomSanitizer) {
  }

  ngOnInit(): void {
    const CdkOverlayOriginEl = this.CdkOverlayOrigin.elementRef.nativeElement;

    // open popup if mouse stopped in CdkOverlayOriginEl (for short time).
    // If user just quickly got over CdkOverlayOriginEl element - do not open
    const open$ = fromEvent(document, 'mousemove').pipe(
      filter(() => !this.isOpened),
      switchMap(enterEvent =>
        fromEvent(document, 'mousemove').pipe(
          startWith(enterEvent),
          debounceTime(300),
          filter(event => CdkOverlayOriginEl.contains(event.target))
        )
      ),
      share(),
      takeUntil(this.destroy$)
    );

    open$
      .subscribe(() => this.changeState(true));

    // close if mouse left the CdkOverlayOriginEl and dialog(after short delay)
    const close$ = fromEvent(document, 'mousemove').pipe(
      debounceTime(100),
      filter(() => this.isOpened),
      filter(event => this.isMovedOutside(CdkOverlayOriginEl, this.dialog, event))
    );

    open$.pipe(
      takeUntil(this.destroy$),
      switchMapTo(close$)
    ).subscribe(() => {
      this.changeState(false);
    });
  }

  ngOnDestroy(): void {
    this.destroy$.next();
  }

  connectedOverlayDetach() {
    this.changeState(false);
  }

  private changeState(isOpened: boolean) {
    if (this.isOpened === isOpened) {
      return;
    }

    this.isOpened = isOpened;
    isOpened ? this.open.emit() : this.close.emit();
    this.changeDetectorRef.markForCheck();
  }

  private isMovedOutside(CdkOverlayOriginEl, dialog, event): boolean {
    return !(CdkOverlayOriginEl.contains(event['target']) || dialog.nativeElement.contains(event['target']));
  }
}
