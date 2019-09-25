package org.kondrak.fetch.challenge.pyramid;

import org.apache.tomcat.jni.Local;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * A controller to handle routes for pyramid word tests.
 */
@RestController
@RequestMapping("/pyramid")
public class PyramidController {
    Logger LOGGER = LoggerFactory.getLogger(PyramidController.class);

    private PyramidService pyramidService;

    public PyramidController(PyramidService pyramidService) {
        this.pyramidService = pyramidService;
    }

    /**
     * A controller method that will test the provided word to determine whether it's a pyramid word or not.
     * A {@link PathVariable} is used for the word since it *should* be a relatively small and simple piece of data.
     * @param word - the word to test for pyramid attributes
     * @return boolean - true if the word is a pyramid word, false if it is not
     */
    @RequestMapping("/{word}")
    public boolean testWord(@PathVariable String word) {
        // log time prior to starting processing
        LocalTime start = LocalTime.now();
        LOGGER.info("Starting to process: {} - {}", word, start);

        boolean isPyramid = pyramidService.isPyramidWord(word);

        // log time, and duration following processing so performance of runs can be compared
        LocalTime end = LocalTime.now();
        long minutes = start.until( end, ChronoUnit.MINUTES);
        long seconds = start.until( end, ChronoUnit.SECONDS);
        long nanos = start.until( end, ChronoUnit.NANOS);
        LOGGER.info("End processing! - at {} - {}m {}s {}n", end, minutes, seconds, nanos);

        return isPyramid;    // stub out the method for now
    }
}
