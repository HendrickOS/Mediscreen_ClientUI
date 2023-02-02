# Mediscreen
JAVA Project 9 OpenClassrooms


## Description
This app is for doctors. It enables them to writes notes about patients.<br>
Then the apps analyses notes and produce a report to alarm doctors about their patients' potential sensitivity to diabetes.


## Prerequisite
- [Java](https://www.java.com/download/ie_manual.jsp)
- [Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/)
- [MongoDB datatools (latest)](https://www.mongodb.com/docs/database-tools/installation/installation/)
- [Docker desktop](https://docs.docker.com/desktop/)
- Ide : IntelliJ or Eclipse


## How to run the App
1. First of all, make sure you created a Database named `postgres` with the password as shown in the table below has all the permissions on that database.
2. Make also sure that your local `mysql port` is `5432`.
3. No need to create a Mongo DB but still you hve to run a local server running on port 27017. 
4. You can initialise your MongoDB and MySQL DB by following bellow info.
5. From you IDE execute each in that order :
   1. eureka-server
   2. microservice-patient
   3. microservice-note
   4. microservice-assessment
   5. client-ui
6. Go to http://localhost:8080 to get into the app.


## Endpoint
1. `clint-ui` : http://localhost:8080
2. `eureka-server` : http://localhost:9090
3. `microservice-patient` : http://localhost:8081
4. `microservice-note` : http://localhost:8082
5. `microservice-assessment` : http://localhost:8083


## Info
### Database
- There are 2 databases embedded inside the project.
  - _MySQL_ for `microservice-patient`
  - _NoSQL (MongoDB)_ for `microservice-bote`

|    Database   |   Host    |      Local port      |      Name      |         Password         |
|:-------------:|:---------:|:--------------------:|:--------------:|:------------------------:|
|     MySQL     | localhost |        5432          |     postgres   |          root            |
|     NoSQL     | localhost |        27017         |     mongodb    |                          |


- <u>**Initialisation :**</u>
  - You can initialise NoSQL database by using a provided file located here : `src/main/resources/noteBDD_MongoDB.json`
    - If you want to do so here are the steps to follow using `MongoDB Compass` :
      1. Make sure you have Mongo data tools properly installed on your computer (link provided above).
      2. Open `MongoDB Compass`
      3. Go to the `database` named `mongodb`
      4. Create a new `Collection` named `notes`
      5. From this page, go to `ADD DATA` -> `Import File` and choose the JSON file
