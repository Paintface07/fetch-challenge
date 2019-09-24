package org.kondrak.fetch.challenge.pyramid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller to handle routes for pyramid word tests.
 */
@RestController
@RequestMapping("/pyramid")
public class PyramidController {

    /**
     * A controller method that will test the provided word to determine whether it's a pyramid word or not.
     * @param word - the word to test for pyramid attributes
     * @return boolean - true if the word is a pyramid word, false if it is not
     */
    @RequestMapping("/{word}")
    public boolean testWord(@PathVariable String word) {
        return true;    // stub out the method for now
    }
}
