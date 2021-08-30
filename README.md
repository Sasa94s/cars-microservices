# Cars Microservices

REST-based Vehicles API that can communicate with separate location and pricing services.

## Instructions

Check each component to see its details and instructions. Note that all four applications
should be running at once for full operation. Further instructions are available in the classroom.

- [Eureka Server](eureka-server/README.md)
- [Documentation Service](documentation-service/README.md)
- [Vehicles API](vehicles-api/README.md)
- [Pricing Service](pricing-service/README.md)
- [Maps Service](boogle-maps/README.md)

## Dependencies

The project requires the use of:
- [Maven](https://maven.apache.org/) ([Download](https://maven.apache.org/download.cgi) and [Setup](https://www.baeldung.com/install-maven-on-windows-linux-mac))
- [Spring Boot](https://spring.io/projects/spring-boot)
- Java v11 ([Download JDK11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html))

## Run the applications
Note that the [Eureka Server](./eureka-server/README.md), [Maps Service](./boogle-maps/README.md), [Pricing Service](./pricing-service/README.md) and [Vehicles API](./vehicles-api/README.md) applications must all be running for all operations to perform correctly, although they should be able to launch on their own.

You can either use these in separate windows in your favorite IDE, or use the below commands:

1. `$ mvn clean package` (run this in each directory containing the separate applications)
2. [Eureka Server](./eureka-server/README.md): `$ java -jar target/eureka-server-0.0.1-SNAPSHOT.jar`
	- The service is available by default on port `8761`.
3. [Documentation Service](./documentation-service/README.md): `$ java -jar target/documentation-service-0.0.1-SNAPSHOT.jar`
	- The service is available by default on port `7171`.
	- Swagger API documentation should be available at: http://localhost:7171/swagger-ui/
2. [Maps Service](./boogle-maps/README.md): `$ java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar`
	- The service is available by default on port `9191`.
	- Swagger API documentation should be available at: http://localhost:9191/swagger-ui/
3. [Pricing Service](./pricing-service/README.md): `$ java -jar target/pricing-service-0.0.1-SNAPSHOT.jar`
	- The service is available by default on port `8082`.
	- Swagger API documentation should be available at: http://localhost:8082/swagger-ui/
4. [Vehicles API](./vehicles-api/README.md): `$ java -jar target/vehicles-api-0.0.1-SNAPSHOT.jar`
	- The service is available by default on port `8080`.
	- Swagger API documentation should be available at: http://localhost:8080/swagger-ui/


## License
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)