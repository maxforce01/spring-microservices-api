Simple web API based on microservices architecture.
Stack:
Spring boot, Spring Cloud ,Eureka server, Spring Data and MongoDB.

Requests:

1)api/users  - for getting users from github. 

2)api/database/users/save - for save this users in database

3)api/database/users/get - for get this users from database


Also we have 4 microservices: 

1) common-utils - which store models and common classes

2) consumer-microservice - which is database service.

3) producer-microservice - which is get users from github.

4) discovery-server - based on Eureka service.
