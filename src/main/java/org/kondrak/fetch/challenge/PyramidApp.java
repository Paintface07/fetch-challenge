package org.kondrak.fetch.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A Spring application to demonstrate the following functionality:
 * <p>
 * 	Please write a web service that takes in a string and returns a boolean to indicate whether a word is a pyramid word.
 * 	A word is a ‘pyramid’ word if you can arrange the letters in increasing frequency, starting with 1 and continuing
 * 	without gaps and without duplicates.
 *
 * 	Examples:
 * 	banana is a pyramid word because you have 1 'b', 2 'n's, and 3 'a's.
 * 	bandana is not a pyramid word because you have 1 'b' and 1 'd'.
 *
 * 	You can use any language and when completed, please upload to a public repository and provide us with the link.
 * </p>
 *
 * For this application, I will be using the following technologies to demonstrate this functionality:
 * <ul>
 *     <li>Language - Java - Utilized because I am most familiar with this language and can develop quickly in it.</li>
 *     <li>Web Framework - Spring Boot - Utilized to quicken development of a RESTful web service.</li>
 *     <li>Build Tool - Maven - Utilized to simplify creation of a runnable JAR.</li>
 * </ul>
 */
@SpringBootApplication
public class PyramidApp {

	public static void main(String[] args) {
		SpringApplication.run(PyramidApp.class, args);
	}

}
