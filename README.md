# :clapper: Cinema-service :tickets:

## Description:
`It's a web-application that can be used as a software for the cinema service. It support authentication, registration, CRUD operations and  
logic of the cinema store also is present. The service also provides two roles: User and Admin.`

## Features:
- registration as a user
- authentication as a user/admin
- create:
    - a movie
    - a movie session
    - a cinema hall
- display all:
    - cinema halls
    - movies
- get available movie sessions
- get order history by user
- add tickets to shopping card

## Structure:
`In this project I implement n-tier architecture with 5 layer: DB, DAO, Service, DTO, Controller. 
Also realized dto mappers that convert entities object to dto.`

## Technologies used:
- Hibernate - is an object–relational mapping tool for the Java programming language. It provides a framework for mapping an object-oriented domain model to a relational database.


- Spring MVC - is a library within the Spring framework that simplifies handling HTTP requests and responses. It’s built on the Servlet API and is an essential component of the Spring Framework.


- Spring Security -  is a framework provided by Spring that helps to customize an access and authentication process.


- Tomcat - is a popular open source web server and Servlet container for Java code.


- REST - is an architectural style that specifies constraints, such as the uniform interface, that if applied to a web service induce desirable properties, such as performance, scalability, and modifiability, that enable services to work best on the Web.


## How to start ?
1. Enter your DB connection settings in db.properties <br>
```
    #MySQL properties
    db.driver=com.mysql.cj.jdbc.Driver
    db.url=YOUR_URL //here
    db.user=YOUR_USERNAME //here
    db.password=YOUR_PASSWORD //and here
```
2. Edit Rub/Debug configuration <br><br>
   <img src="https://devcolibri.com/cp/wp-content/uploads/2014/03/4249_2.png">
3. Select local TomCat <br><br>
   <img src="https://devcolibri.com/cp/wp-content/uploads/2014/03/4249_3.png">
4. In the tab `Deployment`, press add artifacts: <br><br>
   <img src="https://devcolibri.com/cp/wp-content/uploads/2014/03/4249_6.png">
5. Run your TomCat :arrow_forward: 
