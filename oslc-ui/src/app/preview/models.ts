export interface Preview {
    properties: Property[];
}

export interface Property {
    propertyDefintion: PropertyDefintion;
    propertyValue: PropertyValue;
}

export interface PropertyDefintion {
    representationType: RepresentationType;
    data: string | Link;
}

export interface PropertyValue {
    representationType: RepresentationType;
    representAsList?: boolean;
    data: string | string[] | Link | Link[];
}

export interface Link {
    link: string;
    title: string;
}

export enum RepresentationType {
    Text = 'Text',
    Link = 'Link'
}

