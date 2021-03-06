# :clapper: Cinema-service :tickets:

## Description:
It`s a little cinema-service software.The service provides two roles: User and Admin. For users, I provide the 
possibility to choose the film and available movie session, add the tickets to the shopping cart and complete 
the order. Admin can: add and delete movies, movie sessions, cinema halls, get user by email. 
Also, all not registered users only have access to registration page.


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
`In this project I implement n-tier architecture with 4 layer: db, dao, service, controller.`

## Technologies used:
- Hibernate


- Spring MVC


- Spring Security


- Tomcat


- REST


- Logger - I used log4j


## How to start ?
1. Enter your DB connection settings in db.properties <br>
```
    #MySQL properties
    db.driver=com.mysql.cj.jdbc.Driver
    db.url=YOUR_URL //here
    db.user=YOUR_USERNAME //here
    db.password=YOUR_PASSWORD //and here
```
2. Enter path to your file for logs in log4j2.xml <br>
```
    <File name="LogToFile" fileName="YOUR_FILE"> //here
        <PatternLayout>
            <Pattern>%d %p %c:%L %m%n</Pattern>
        </PatternLayout>
    </File>
```
4. Edit Rub/Debug configuration <br><br>
   <img src="https://devcolibri.com/cp/wp-content/uploads/2014/03/4249_2.png">
5. Select local TomCat <br><br>
   <img src="https://devcolibri.com/cp/wp-content/uploads/2014/03/4249_3.png">
6. In the tab `Deployment`, press add artifacts: <br><br>
   <img src="https://devcolibri.com/cp/wp-content/uploads/2014/03/4249_6.png">
7. Run your TomCat :arrow_forward: 
8. I have already injected admin, with email - "admin@i.ua", password - "admin123", you can use it to authorize.
