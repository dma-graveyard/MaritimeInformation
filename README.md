MaritimeInformation
===================

#### Java library for maritime information messages ####

### Introduction ###

The library has a Java class representation of the Maritime Information S-100
product specification.

The library are able to create XSD schema files and provides JAXB classes
that can marshall and unmarshall.


### Building ###

To build you will need

* JDK 1.6+ (http://java.sun.com/j2se/)
* Apache Ant 1.7+ (http://ant.apache.org)

To build everything
 
	ant
 
To run tests. All tests with filename *Test.java will be executed. 

	ant test

Make a distributable JAR file in project root

	ant jar
	
### Schemas ###

To create XSD files

	ant schemas  
 
### License ###

This library is provided under the LGPL, version 3.