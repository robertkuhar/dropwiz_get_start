dropwiz_get_start
=================

Dropwizard Getting Started application implemented through gradle

This project implements the Dropwizard Get Started application http://dropwizard.codahale.com/getting-started/
employing Gradle rather than Maven to manage the build.  The operative discovery for this piece of magic was a 
blog posting at http://www.jworks.nl/2013/07/16/gradle-creating-executable-jars-for-dropwizard/.

Following the gradle build, the product can be executed from the command line like

java -jar build/libs/dropwiz_get_start-1.1.jar server src/main/resources/hello-world.yml

With the server running requests are like http://localhost:8080/hello-world?name=Bob

Check out the Monitoring interface too at http://localhost:8081/

Have at it!
