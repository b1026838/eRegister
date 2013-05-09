eRegister - by Sean Edgar
======================

An electronic attendance register.

A project for the SHU Web Architectures module, focused around the various aspects of MVC application development which aims to:
* Create an electronic attendance register based around student attendance.
* Explore the implementation of MVC architectures.
* Develop the application using Grails.

Dependencies: Grails v2.1.x, Java 7, MySQL.

Log into MySQL and use the following commands:
```
create database eregister default chatset utf8 default collate utf8_bin;
grant all on eregister.* to 'webarch'@'localhost' identified by 'webarch';
```
You should then be able to run the application with:

```
grails run-app
```



