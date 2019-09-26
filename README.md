# fetch-challenge

## Objective
A Spring application to demonstrate the following functionality:
> Please write a web service that takes in a string and returns a boolean to indicate whether a word is a pyramid word.
> A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, starting with 1 and continuing
> without gaps and without duplicates.
>
> Examples:
> banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.
> bandana is not a pyramid word because you have 1 'b' and 1 'd'.
>
> You can use any language and when completed, please upload to a public repository and provide us with the link.

## Dependencies

For this application, I will be using the following technologies to demonstrate this functionality.  The application
may work on other versions, but these are what I tested with:
* Language - Java (11+) - Utilized because I am most familiar with this language and can develop quickly in it.
* Web Framework - Spring Boot (2.1.8+) - Utilized to quicken development of a RESTful web service.
* Build Tool - Maven (3.6.0+) - Utilized to simplify creation of a runnable JAR.

## Building the Application

After installing the above Java and Maven versions, simply run the following in the application root
directory (the one containing pom.xml), to install dependencies, run the tests, and build a runnable JAR:
```
mvn install
```

## Running the Application
To launch the application, simply run it from the target folder (created by Maven) using the following
command in the application root directory:
```
java -jar target/fetch-challenge-0.0.1-SNAPSHOT.jar
```

Alternatively, if you'd like to use the Spring Boot Maven plugin to run the application, use the
following in the application root directory:
```
mvn spring-boot:run
```

## Testing a Word
After running the application via one of the above methods, you are ready to test words for "pyramidity".
To test a word, simply append the word to a URL as follows, and enter it in a browser:
```
http://localhost:8080/pyramid/<your word goes here>
```
The application will display either "true" or "false" to signify whether or not a word is a pyramid
word.

### Changing the Port
Occasionally, port 8080 (the default port for this application) may already be in use by another application.
To change the port, simply change the following in src/main/resources/application.yml:
```yaml
server:
  port: 8080
```

```yaml
server:
  port: <some free port number>
```

### Logging
By default, the application only logs performance metrics of the classification algorithm, but 
if you'd like to enable detailed logging of the algorithm, you can change the following
(you will have to rebuild the application after making this change) in src/main/resources/application.yml:
```yaml
logging:
  level:
    org.kondrak.fetch.challenge: info
```
to:
```yaml
logging:
  level:
    org.kondrak.fetch.challenge: debug
```

## Assumptions
The following are assumptions that were made in the creation of this service:
* The "word" does not need to be a dictionary word, and can be any string of characters that can be
put into a URL.

## Possible Improvements
This application could benefit from a couple of improvements if it were to be used in production:
* A client library to simplify calls from other applications/services
* RESTful interface documentation (ex. Swagger) to improve usability and documentation
* Further optimization of the classifier to the workload
* Enforce further input validation based on use-case
* Depending on traffic and workload, a caching solution could improve performance on repetitive calls
