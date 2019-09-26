package org.kondrak.fetch.challenge;

import org.junit.Test;
import org.kondrak.fetch.challenge.pyramid.PyramidService;

import static org.junit.Assert.assertEquals;

/**
 * A test suite for the service layer of the application, which houses the primary logic for classifying pyramid words.
 */
public class PyramidServiceTests {

    private PyramidService pyramidService = new PyramidService();

    /**
     * Ensure the service behaves correctly when passed an empty string.
     */
    @Test
    public void pyramidServiceShouldFailGracefullyForEmptyString() {
        assertEquals(false, pyramidService.isPyramidWord(PyramidTestConstants.EMPTY_STRING));
    }

    /**
     * Ensure the service can correctly identify a pyramid word.
     */
    @Test
    public void pyramidServiceShouldReturnTrueForPyramidWord() {
        assertEquals(true, pyramidService.isPyramidWord(PyramidTestConstants.VALID_PYRAMID_WORD));
    }

    /**
     * Ensure the service can correctly rule out a non-pyramid word due to incorrect counts.
     */
    @Test
    public void pyramidServiceShouldReturnFalseForNonPyramidWordByCount() {
        assertEquals(false, pyramidService.isPyramidWord(PyramidTestConstants.INVALID_PYRAMID_WORD));
    }

    /**
     * Ensure the service can handle symbols where they match a pyramid word pattern.
     */
    @Test
    public void pyramidServiceShouldReturnTrueForSymbolPyramid() {
        assertEquals(true, pyramidService.isPyramidWord(PyramidTestConstants.SYMBOL_PYRAMID_WORD));
    }

    /**
     * Ensure the service can handle symbols where they do NOT match a pyramid word pattern.
     */
    @Test
    public void pyramidServiceShouldReturnFalseForSymbolNonPyramid() {
        assertEquals(false, pyramidService.isPyramidWord(PyramidTestConstants.SYMBOL_NON_PYRAMID_WORD));
    }

    /**
     * Ensure the service can handle sufficiently long pyramid words.
     */
    @Test
    public void pyramidServiceShouldReturnTrueForLongPyramid() {
        assertEquals(true, pyramidService.isPyramidWord(PyramidTestConstants.REALLY_LONG_PYRAMID_WORD));
    }

    /**
     * Ensure pyramid words can be detected even if shuffled.
     */
    @Test
    public void pyramidServiceShouldReturnTrueForShuffledPyramid() {
        assertEquals(true, pyramidService.isPyramidWord(PyramidTestConstants.VALID_SHUFFLED_PYRAMID_WORD));
    }

    /**
     * Ensure words containing only a single letter (by count) fail.
     */
    @Test
    public void pyramidServiceShouldReturnFalseForSingleLetterCountNonPyramid() {
        assertEquals(false, pyramidService.isPyramidWord(PyramidTestConstants.NON_PYRAMID_SINGLE_LETTER_COUNT));
    }

    /**
     * Ensure words containing only a single letter succeed.
     */
    @Test
    public void pyramidServiceShouldReturnTrueForSingleLetterPyramid() {
        assertEquals(true, pyramidService.isPyramidWord(PyramidTestConstants.NON_PYRAMID_SINGLE_LETTER));
    }
}
