# OSLC UI

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 9.0.5.

## How to use 
1. After cloning this git repository, go the root folder of the repo.
2. run `npm run build:elements-prod` to build the project. This will produce a `dist` with artefacts
3. Copy the `dist` folder to under `/src/main/webapp/static/` of your web project. That is, you will have a number of js/css files under the folder `/src/main/webapp/static/dist/oslc-ui`
4. Use generated `/dist/oslc-ui/java-gen/*` classes for your Java app

# oslc-selector
`<oslc-selector no-data-text="No data..." search-placeholder-text="Type here..." selection-uri="" fields=""></oslc-selector>`   
Add the following code to your html page. 
   * Note that `<%= selectionUri %>` is jsp-code that points to the Selection DelegatedUI. You can use any other logic to define this URI.
   * Note also that `fields='["oslc:label"]'` can be any list of values from the json result returned.

```
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8"> 
        <link rel="stylesheet" href="<c:url value="/static/dist/oslc-ui/styles.css"/>"> 
    </head> 
    <body> 
        <oslc-selector selection-uri="<%= selectionUri %>" fields='["oslc:label"]'></oslc-selector> 
        
        <script src="<c:url value="/static/dist/oslc-ui/runtime-es2015.js"/>" type="module"></script> 
        <script src="<c:url value="/static/dist/oslc-ui/runtime-es5.js"/>" nomodule defer></script> 
        <script src="<c:url value="/static/dist/oslc-ui/polyfills-es5.js"/>" nomodule defer></script> 
        <script src="<c:url value="/static/dist/oslc-ui/polyfills-es2015.js"/>" type="module"></script> 
        <script src="<c:url value="/static/dist/oslc-ui/main-es2015.js"/>" type="module"></script> 
        <script src="<c:url value="/static/dist/oslc-ui/main-es5.js"/>" nomodule defer></script> 
    </body> 
</html>
```

# oslc-preview
`<oslc-preview input-data=""></oslc-preview>`   

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
