# Connection Pool Test Setup

Setup to test the behavior of http connection pools with the following setup
* server-apache
    * apache server with proxy-pass to server-app 
* server-app
    * spring-boot application 
* client-app
    * spring-boot application which makes request to server-app through server-apache

## Requirements

Install docker and docker-compose

## How to use

Build the maven projects
```
maven clean package
```

Start the servers via docker-compose
```
docker-compose up
```

**Note**: When you make changes in one of the apps or in the apache, docker have to rebuild the apps and the container images
```
maven clean package
docker-compose up --build
```

**Info**: The collection in [intellij-rest-api.http](intellij-rest-api.http) helps to understand the setup




