package org.kondrak.fetch.challenge;

/**
 * A class containing constants to be used in testing of the pyramid test endpoint.
 */
final class PyramidTestConstants {
    static String VALID_PYRAMID_WORD = "banana";                    // Positive test data supplied
    static String NON_PYRAMID_BY_DUPLICATES = "bannaanna";          // Positive test data with duplicate values
    static String INVALID_PYRAMID_WORD = "bandana";                 // Negative test data supplied
    static String EMPTY_STRING = "";                                // Empty test data (error case)

    private PyramidTestConstants() {}
}
