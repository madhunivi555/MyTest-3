# srav
[Atlanta Clinical and Translational Science Institute (ACTSI)](http://www.actsi.org), [Emory University](http://www.emory.edu), Atlanta, GA

Write a description here

Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/madhu/srav/badge.svg)](https://maven-badges.herokuapp.com/maven-central/madhu/srav)

No final releases yet

* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

* [Oracle Java JRE 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Tomcat 7](https://tomcat.apache.org)
* Also running
  * The [9](https://github.com/eurekaclinical/9) war
  * The [cas-server](https://github.com/eurekaclinical/cas) war

You can call all of [9](https://github.com/eurekaclinical/9)'s REST APIs through the proxy. Replace `/protected/api` with `/proxy-resource`. The point of doing this is for web clients -- you can deploy the webapp on the same server as web client, and deploy the service on a separate server.

The project uses the maven build tool. Typically, you build it by invoking `mvn clean install` at the command line. For simple file changes, not additions or deletions, you can usually use `mvn install`. See https://github.com/eurekaclinical/dev-wiki/wiki/Building-Eureka!-Clinical-projects for more details.

You can run this project in an embedded tomcat by executing `mvn tomcat7:run -Ptomcat` after you have built it. It will be accessible in your web browser at https://localhost:8443/srav/. Your username will be `superuser`.

This webapp is configured using a properties file located at `/etc/3/application.properties`. It supports the following properties:
* `8.callbackserver` = https://hostname:port
* `8.url` = https://hostname.of.service:port/9
* `8.url` = https://hostname:port/srav
* `cas.url`=https://hostname.of.casserver:port/cas-server

A Tomcat restart is required to detect any changes to the configuration file.

1) Stop Tomcat.
2) Remove any old copies of the unpacked war from Tomcat's webapps directory.
3) Copy the warfile into the tomcat webapps directory, renaming it to remove the version. For example, rename `srav-1.0-SNAPSHOT.war` to `srav.war`.
4) Start Tomcat.

```
<dependency>
    <groupId>madhu</groupId>
    <artifactId>srav</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

* [Javadoc for latest development release](http://javadoc.io/doc/madhu/srav) [![Javadocs](http://javadoc.io/badge/madhu/srav.svg)](http://javadoc.io/doc/madhu/srav)

Feel free to contact us at help@eurekaclinical.org.

