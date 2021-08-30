# Vehicles API

A REST API to maintain vehicle data and to provide a complete
view of vehicle details including price and address.

## Features

- REST API exploring the main HTTP verbs and features
- Registered as a Eureka client
- Hateoas
- Custom API Error handling using `ControllerAdvice`
- Swagger API docs
- HTTP WebClient
- MVC Test
- CORS handling using Servlets `Filter`
- Automatic model mapping using `RepresentationModelAssembler`

## Instructions

#### Run the Code

To properly run this application you need to start the Orders API and
the Service API first.


```
$ mvn clean package
```

```
$ java -jar target/vehicles-api-0.0.1-SNAPSHOT.jar
```

The service is available by default on port `8080`.

Import it in your favorite IDE as a Maven Project
and run the class `VehiclesApiApplication`.

## Operations

Swagger UI: http://localhost:8080/swagger-ui.html

### Create a Vehicle

`POST` `/cars`

Posts information to create a new vehicle in the system.

`Response code: 201; Time: 464ms; Content length: 546 bytes`
```
HTTP/1.1 201 
Access-Control-Allow-Methods: POST, GET, OPTIONS, PUT, DELETE
Access-Control-Max-Age: 3600
Access-Control-Allow-Credentials: true
Location: http://localhost:8080/cars/1
Content-Type: application/hal+json
Transfer-Encoding: chunked
Date: Mon, 30 Aug 2021 11:02:12 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "id": 1,
  "createdAt": "2021-08-30T13:02:12.6813132",
  "modifiedAt": "2021-08-30T13:02:12.6813132",
  "condition": "USED",
  "details": {
    "body": "sedan",
    "model": "Impala",
    "manufacturer": {
      "code": 100,
      "name": "Audi"
    },
    "numberOfDoors": 4,
    "fuelType": "Gasoline",
    "engine": "3.6L V6",
    "mileage": 32280,
    "modelYear": 2018,
    "productionYear": 2018,
    "externalColor": "Red"
  },
  "location": {
    "lat": 40.73061,
    "lon": -73.935242,
    "address": null,
    "city": null,
    "state": null,
    "zip": null
  },
  "price": null,
  "_links": {
    "self": {
      "href": "http://localhost:8080/cars/1"
    },
    "cars": {
      "href": "http://localhost:8080/cars"
    }
  }
}
```


### Retrieve a Vehicle

`GET` `/cars/{id}`

Retrieves the Vehicle data from the database
and access the Pricing Service and Boogle Maps to enrich 
the Vehicle information to be presented

`Response code: 200; Time: 1040ms; Content length: 588 bytes`
```
HTTP/1.1 200 
Access-Control-Allow-Methods: POST, GET, OPTIONS, PUT, DELETE
Access-Control-Max-Age: 3600
Access-Control-Allow-Credentials: true
Content-Type: application/hal+json
Transfer-Encoding: chunked
Date: Mon, 30 Aug 2021 11:06:57 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "id": 1,
  "createdAt": "2021-08-30T13:02:12.681313",
  "modifiedAt": "2021-08-30T13:02:12.681313",
  "condition": "USED",
  "details": {
    "body": "sedan",
    "model": "Impala",
    "manufacturer": {
      "code": 100,
      "name": "Audi"
    },
    "numberOfDoors": 4,
    "fuelType": "Gasoline",
    "engine": "3.6L V6",
    "mileage": 32280,
    "modelYear": 2018,
    "productionYear": 2018,
    "externalColor": "Red"
  },
  "location": {
    "lat": 40.73061,
    "lon": -73.935242,
    "address": "4133 Veterans Memorial Drive",
    "city": "Batavia",
    "state": "NY",
    "zip": "14020"
  },
  "price": "USD 16410.92",
  "_links": {
    "self": {
      "href": "http://localhost:8080/cars/1"
    },
    "cars": {
      "href": "http://localhost:8080/cars"
    }
  }
}
```

### Update a Vehicle

`PUT` `/cars/{id}`

Updates the information of a vehicle in the system.

`Content-Type: application/json`
```
{
   "condition":"NEW",
   "details":{
      "body":"coupe",
      "model":"Impala",
      "manufacturer":{
         "code":101,
         "name":"Chevrolet"
      },
      "numberOfDoors":4,
      "fuelType":"Solar",
      "engine":"3.6L V6",
      "mileage":32280,
      "modelYear":2018,
      "productionYear":2018,
      "externalColor":"white"
   },
   "location":{
      "lat":40.73061,
      "lon":-73.935242
   }
}
```

`Response code: 200; Time: 294ms; Content length: 499 bytes`
```
HTTP/1.1 200 
Access-Control-Allow-Methods: POST, GET, OPTIONS, PUT, DELETE
Access-Control-Max-Age: 3600
Access-Control-Allow-Credentials: true
Content-Type: application/hal+json
Transfer-Encoding: chunked
Date: Mon, 30 Aug 2021 11:09:38 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "id": 1,
  "createdAt": null,
  "modifiedAt": null,
  "condition": "NEW",
  "details": {
    "body": "coupe",
    "model": "Impala",
    "manufacturer": {
      "code": 101,
      "name": "Chevrolet"
    },
    "numberOfDoors": 4,
    "fuelType": "Solar",
    "engine": "3.6L V6",
    "mileage": 32280,
    "modelYear": 2018,
    "productionYear": 2018,
    "externalColor": "white"
  },
  "location": {
    "lat": 40.73061,
    "lon": -73.935242,
    "address": null,
    "city": null,
    "state": null,
    "zip": null
  },
  "price": null,
  "_links": {
    "self": {
      "href": "http://localhost:8080/cars/1"
    },
    "cars": {
      "href": "http://localhost:8080/cars"
    }
  }
}
```


### Delete a Vehicle

`DELETE` `/cars/{id}`

Removes a vehicle from the system.

`Response code: 204; Time: 271ms; Content length: 0 bytes`
```
HTTP/1.1 204 
Access-Control-Allow-Methods: POST, GET, OPTIONS, PUT, DELETE
Access-Control-Max-Age: 3600
Access-Control-Allow-Credentials: true
Date: Mon, 30 Aug 2021 11:12:45 GMT
Keep-Alive: timeout=60
Connection: keep-alive

<Response body is empty>
```
