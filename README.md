## Tools and Technologies Used
The following tools and technologies used in this project
1. Java SE version (8)
3. Junit version (4.12)
5. Apache Maven version (3.5.0)
6. IntelliJ IDEA Community Edition version (2017.1.2)

## Solution Description

The solution contains the following Java classes.

### Matcher Class 
The is core class used to find the type of triangle. Matcher class contains a method called getTriangleType which takes the triangle's three sides as input and return the type of triangle after processing. 
#### Note
Further more some exeception has been done in the getTriangleType method. The method will throw exception if user try to pass any of the length either zero OR negative value.

### Enumerate Type
The following enumerate types used in project for comparison purpose.
1. EQUILATERAL
2. ISOSCELES
3. SCALENE

### Tradeshift Class 
The Tradeshift class contains the static method (main) used as strarting point to run the project. A object of Matcher class is created in main method to pass three different combinations of inputs to demonstartion the functionality of  getTriangleType method.

### Matcher Unit Tests 

MatcherTests class contains three unit tests which give 100% path coveraged to Matcher class.

### Import Project.

Please import project as a Maven project in IntelliJ IDEA OR use the IDE of your choice.

_________________________________________________________

## Environment Configuration
This section provides guidance to configure the development environment.

### Java Installation:

Step 1: Download Java SE Development Kit 8 using link (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html )and install it.

Step 2: Include JDK's "bin" Directory in the System PATH. In my case, I included C:\Program Files\Java\jre1.8.0_121\bin

Step 3: Set the JAVA_HOME Variable. In my case  JAVA_HOME=C:\Program Files\Java\jre1.8.0_121

### Maven Installation:

Step 1: Download Apache Maven using link https://maven.apache.org/download.cgi

Step 2: Unzip it to the folder you want to install Maven. Assume you unzip to this folder (C:\apache-maven-3.5.0)

Step 3: Set the MAVEN_HOME Variable, it could point to C:\apache-maven-3.5.0

Step 4: Include Maven's "bin" Directory in the System PATH. In my case, I include C:\apache-maven-3.5.0\bin

### IntelliJ IDEA Installation:

Step 1: Download and install IntelliJ IDEA Community edition using link https://www.jetbrains.com/idea/#chooseYourEdition and 
