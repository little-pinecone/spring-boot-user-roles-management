# spring-boot-user-roles-management

[![keep_growing logo](readme-images/logo_250x60.png)](https://keepgrowing.in/)

## About this project

This project shows an example implementation of type-sage user roles for Spring Security

## Prerequisites

* JDK 17+ ([How to install OpenJDK 17 on Ubuntu](https://keepgrowing.in/java/how-to-install-openjdk-17-on-ubuntu/))
* [Maven](https://maven.apache.org/) (or you can use `mvnw` provided in the project)

## Getting started

First, [clone](https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/cloning-a-repository-from-github/cloning-a-repository)
this repository.

Then, build it locally with:

```shell
mvn clean install
```

You can run the app in a command line with the following command:

```shell
mvn spring-boot:run
```

### Running tests

You can run tests with:

```shell
mvn test
```

### API documentation

#### Swagger UI

Swagger UI is available at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

#### OpenAPI

[http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)