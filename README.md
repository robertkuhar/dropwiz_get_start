dropwiz_get_start
=================

Dropwizard Getting Started application implemented through gradle

This project implements the Dropwizard Get Started application 
http://dropwizard.io/getting-started.html employing Gradle rather than Maven to manage the build.  
The operative discovery for this piece of magic was a blog posting at 
http://www.jworks.nl/2013/07/16/gradle-creating-executable-jars-for-dropwizard/ which details how
to, essentially, build an uberjar.

To build the project execute the gradle wrapper ```gradlew``` on *nix, ```gradlew.bat``` on Windows. 

```
$ ./gradlew
:clean
:compileJava
...
BUILD SUCCESSFUL

Total time: 6.33 secs
```

Following the gradle build, the product can be executed from the command line like...
```
$ java -jar build/libs/dropwiz_get_start-1.1.jar server src/main/resources/hello-world.yml
INFO  [2015-02-23 06:30:46,595] io.dropwizard.server.ServerFactory: Starting HelloWorldService
...
    GET     /hello-world (com.example.helloworld.HelloWorldResource)
...
    POST    /tasks/gc (io.dropwizard.servlets.tasks.GarbageCollectionTask)
...
INFO  [2015-02-23 06:30:46,836] org.eclipse.jetty.server.handler.ContextHandler: Started i.d.j.MutableServletContextHandler@d7494f9{/,null,AVAILABLE}
INFO  [2015-02-23 06:30:46,852] org.eclipse.jetty.server.ServerConnector: Started application@17b18d5e{HTTP/1.1}{0.0.0.0:8080}
INFO  [2015-02-23 06:30:46,853] org.eclipse.jetty.server.ServerConnector: Started admin@9b82279{HTTP/1.1}{0.0.0.0:8081}
```

With the server running requests are like http://localhost:8080/hello-world?name=Bob

Check out the Monitoring interface too at http://localhost:8081/

Have at it!
