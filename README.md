# Java project
Simple Java project done using Spring Boot and Spring Framework Edit

## Description
Simple base code I'll use as base for some projects.

## Dependencies
- Spring Boot
- Spring Framework
- Spring Jdbc
- Postgres driver
- HikariCP

## How to run
Run 
```
docker-compose up
```
to run dependencies and then run the application:
```
./gradlew bootRun
```
App will be available at port `8000`

## How to connect to Postgres
Run following command to connect to Postgres container:
```
docker exec -it DOCKERCONTAINERID bash
```
one inside run:
```
psql -U postgres
```