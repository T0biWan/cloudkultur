# cloudkultur - coding challenge: REST Backend API

> My solution for the given coding challenge.

## Getting started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You will need a current version of [Java](https://www.java.com/), 1.8.0 was used during development, and [Maven](https://maven.apache.org/), version 3.5.0 was used during development.

### Installing

After cloning the repository you can run the project in a development tomcat server or build an executable JAR.

```bash
# run project under http://localhost:8080/
./mvnw spring-boot:run

# build JAR
./mvnw clean package

# run JAR
java -jar target/api-0.0.1-SNAPSHOT.jar
```

## Usage

You can now run requests against the running project, e.g. `http://localhost:8080/helloapi/fibonacci/1`.

### API Documentation

The [API documentation](https://github.com/T0biWan/cloudkultur/blob/main/api-docs.yaml) is in OpenAPI v3.

### Example Request

An example request and its respective response can be viewed [here](https://github.com/T0biWan/cloudkultur/blob/main/http-client.md).

## Built With

- [Java](https://www.java.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Maven](https://maven.apache.org/)
- [OpenAPI](https://swagger.io/specification/)

## Next steps

The next steps would be to eventually further develop the API and to implement proper tests.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/T0biWan/cloudkultur/tags).

## Authors

- **Tobias Klatt** - _Initial work_ - [GitHub](https://github.com/T0biWan/)
