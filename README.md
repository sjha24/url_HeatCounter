#                                                  URL-Hit-Counter
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a URL Hit counter system built using Spring Boot with Java.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The user Data model define in the user class
```
UserName : Name of the user
UrlHitCount : count of the times user hit url
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 

* GetMaping/count
```
This endpoint makes a call to method in userService class which retrieves data of user from database and updates urlHitCount by + 1. This data is sent to controller which is sent through the API to client.
```
* GetMaping/userName/{userName}/count
```
This endpoint returns data of specific user and updates it's urlCount by +1 based on username through API .
```
## Data Structure Used
* HashMap
```
We have used HashMap data structure as a database to get, add and update Users data in database .
```

## Project Summary
```
This is a simple Spring Boot project that implements a URL hit counter. The application keeps track of the number of times a specific URL is accessed and also provides an additional feature to show the hit count for a specific username.
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license
