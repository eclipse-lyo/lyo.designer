import { Component, OnInit, Input } from '@angular/core';
import { Preview, RepresentationType, PropertyDefintion, PropertyValue, Property } from './models';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-preview',
  templateUrl: './preview.component.html',
  styleUrls: ['./preview.component.scss']
})
export class PreviewComponent implements OnInit {

  @Input() public inputData: string;
  public data: Preview;

  constructor() { }

  ngOnInit(): void {
    if (this.inputData) {
      this.data = JSON.parse(this.inputData) as Preview;
    }

    if (environment.production === false) {
      this.data = {
        multiple: true,
        properties: [
          {
            propertyDefintion: {
              representationType: RepresentationType.Link,
              data: {
                link: 'http://rdf.scania.com/ns/scania_nam#factor',
                title: "Factor asd as djhas as d'sd"
              }
            } as PropertyDefintion,
            propertyValue: {
              representationType: RepresentationType.Text,
              data: '1.0'
            } as PropertyValue
          } as Property, {
            propertyDefintion: {
              representationType: RepresentationType.Link,
              data: {
                link: 'http://rdf.scania.com/ns/scania_nam#factor',
                title: 'Factor'
              }
            } as PropertyDefintion,
            propertyValue: {
              representationType: RepresentationType.Text,
              representAsList: true,
              data: '1.0'
            } as PropertyValue
          } as Property, {
            propertyDefintion: {
              representationType: RepresentationType.Link,
              data: {
                link: 'http://rdf.scania.com/ns/scania_nam#factor',
                title: 'Factor'
              }
            } as PropertyDefintion,
            propertyValue: {
              representationType: RepresentationType.Text,
              data: ['1.0']
            } as PropertyValue
          } as Property, {
            propertyDefintion: {
              representationType: RepresentationType.Link,
              data: {
                link: 'http://rdf.scania.com/ns/scania_nam#factor',
                title: 'Factor'
              }
            } as PropertyDefintion,
            propertyValue: {
              representationType: RepresentationType.Text,
              data: null
            } as PropertyValue
          } as Property, {
            propertyDefintion: {
              representationType: RepresentationType.Link,
              data: {
                link: 'http://rdf.scania.com/ns/scania_nam#factor',
                title: 'Factor'
              }
            } as PropertyDefintion,
            propertyValue: {
              representationType: RepresentationType.Text,
              representAsList: true,
              data: ['1.0', '2.0', '3.0']
            } as PropertyValue
          } as Property, {
            propertyDefintion: {
              representationType: RepresentationType.Link,
              data: {
                link: 'http://rdf.scania.com/ns/scania_nam#factor',
                title: 'Factor'
              }
            } as PropertyDefintion,
            propertyValue: {
              representationType: RepresentationType.Link,
              representAsList: true,
              data: [
                {
                  link: 'http://rdf.scania.com/ns/scania_nam#factor',
                  title: 'Factor 1'
                },
                {
                  link: 'http://rdf.scania.com/ns/scania_nam#factor',
                  title: 'Factor 2'
                }, {
                  link: 'http://rdf.scania.com/ns/scania_nam#factor',
                  title: 'Factor 3'
                }
              ]
            } as PropertyValue
          }
        ]
      } as Preview;
    }

    this.data.properties = this.data.properties.map(x => {
      if (x.propertyValue.representAsList === true) {
        x.propertyValue.data = this.getArrayValueSafe(x.propertyValue.data);
        return x;
      }
      return x;
    });
  }

  private getArrayValueSafe(data: any | any[]): any[] {
    if (data == null) {
      return [];
    }

    if (Array.isArray(data) === false) {
      return [data];
    }

    return data;
  }
}
