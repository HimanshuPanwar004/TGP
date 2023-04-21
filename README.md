Summary
-------
The project is a TGP archetype for TGP applications 
which has all common standards on place ready for development

- Java 17
- Maven 3.5+
- Spring boot 3.0.0+
- Lombok abstraction
- JPA with Postgres
- Swagger 3 Open API
- REST API model validation 
- Spring cloud config for external configuration on GIT REPO
- Jenkins Pipeline for multi branch project
- continuous delivery and integration standards with Sonar check and release management


Installation
------------

To install the archetype in your local repository execute following commands:

```sh
$ git clone from myRepo
$ cd cloned folder
$ mvn clean install
```

Test on the browser via SWAGGER
-------------------

```sh
http://localhost:8080/swagger-ui.html
```
