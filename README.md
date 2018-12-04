# Lyo Designer

[![](https://img.shields.io/jenkins/s/https/ci.eclipse.org/lyo/job/lyo-designer-master.svg)](https://ci.eclipse.org/lyo/job/lyo-designer-master/)


Lyo Designer is an Eclipse plugin that allows one to graphically model (1) the overall system architecture, (2) the information model of the RDF resources being shared, and (3) the individual services and operations of each Server in the system. 

Lyo Designer includes a integrated code generator that synthesizes the model into almost-complete OSLC4J-compliant running implementation.

A short [video demonstration of Lyo Designer](https://www.youtube.com/watch?v=tZxPzlSTdeM).

## Installation
The easiest way to install Lyo Designer is via the update-site
<http://download.eclipse.org/lyo/p2/stable/>. (This URL is intended to
be accessed via the Eclipse update functionality, and not via a web
browser.)

1.  Select ***Help \--\> Install New Software\...***
2.  Set ***Work With:*** to the update site
    <http://download.eclipse.org/lyo/p2/stable/>
3.  Select both features (1) ***Lyo Code Generator*** and (2) ***Lyo
    Toolchain Designer***.
4.  Proceed with the installation steps.


## Tutorials and Documentation

* How to [install Lyo Designer](https://github.com/eclipse/lyo.designer/wiki/Installing-Lyo-Designer)
* How to [use Lyo Designer](https://github.com/eclipse/lyo.designer/wiki/User-Manual-for-Toolchain-Modelling) to model a toolchain and generate an initial code base
* How to [use Lyo Designer](https://github.com/eclipse/lyo.designer/wiki/User-Manual-for-Domain-Specification-Modelling) to model domain specifications, and generate OSLC4J-annotated Java classes to reflect the defined OSLC Resources. 
* [Working with Lyo Designer from source code](https://github.com/eclipse/lyo.designer/wiki/Working-from-Source-Code)
