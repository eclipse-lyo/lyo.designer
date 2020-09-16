import { BrowserModule } from '@angular/platform-browser';
import { createCustomElement } from '@angular/elements';
import { NgModule, Injector, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { environment } from 'src/environments/environment';
import { SelectorComponent } from './selector/selector.component';
import { SearchHeaderComponent } from './selector/search-header/search-header.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { PreviewComponent } from './preview/preview.component';
import { PopupComponent } from './popup/popup.component';

import { A11yModule } from '@angular/cdk/a11y';
import { BidiModule } from '@angular/cdk/bidi';
import { ObserversModule } from '@angular/cdk/observers';
import { OverlayModule } from '@angular/cdk/overlay';
import { PlatformModule } from '@angular/cdk/platform';
import { PortalModule } from '@angular/cdk/portal';
import { ScrollingModule } from '@angular/cdk/scrolling';
import { CdkStepperModule } from '@angular/cdk/stepper';
import { CdkTableModule } from '@angular/cdk/table';

/**
 * NgModule that includes all Material modules that are required to serve
 * the Plunker.
 */
@NgModule({
  exports: [
    // CDK
    A11yModule,
    BidiModule,
    ObserversModule,
    OverlayModule,
    PlatformModule,
    PortalModule,
    ScrollingModule,
    CdkStepperModule,
    CdkTableModule,

    // Material
  ]
})
export class MaterialModule { }

@NgModule({
  declarations: [
    AppComponent,
    SelectorComponent,
    SearchHeaderComponent,
    PreviewComponent,
    PopupComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MaterialModule,
    FormsModule,
    NgbModule
  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  providers: [
  ],
  entryComponents: [SelectorComponent]
})
export class AppModule {
  constructor(injector: Injector) {
    // Register the custom elements with the browser.
    const selectorComponent = createCustomElement(SelectorComponent, { injector });
    customElements.define('oslc-selector', selectorComponent);

    const previewComponent = createCustomElement(PreviewComponent, { injector });
    customElements.define('oslc-preview', previewComponent);
  }

  ngDoBootstrap(app) {
    if (environment.production === false) {
      const rootElement = document.createElement('app-root');
      document.body.insertBefore(rootElement, document.body.firstChild);
      app.bootstrap(AppComponent);
    }
  }
}
