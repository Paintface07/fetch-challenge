package org.kondrak.fetch.challenge;

public final class PyramidTestConstants {
    static String VALID_PYRAMID_WORD = "banana";                    // Positive test data supplied
    static String VALID_SHUFFLED_PYRAMID_WORD = "anabna";           // Positive test shuffled data
    static String NON_PYRAMID_BY_DUPLICATES = "bannaanna";          // Negative test due to duplicate values
    static String INVALID_PYRAMID_WORD = "bandana";                 // Negative test data supplied
    static String EMPTY_STRING = "";                                // Empty test data (edge case)
    static String SYMBOL_PYRAMID_WORD = "@##$$$%%%%";               // Positive test with symbols
    static String SYMBOL_NON_PYRAMID_WORD = "@##$$%%%";             // Negative test with symbols
    static String NON_PYRAMID_SINGLE_LETTER_COUNT = "gggggggggg";   // Negative test with single letter (by count)
    static String NON_PYRAMID_SINGLE_LETTER = "g";                  // Negative test with single letter
    static String REALLY_LONG_PYRAMID_WORD = "abbcccddddeeeeeffffffggggggghhhhhhhhiiiiiiiiijjjjjjjjjjkkkkkkkkkkk" +
            "llllllllllllmmmmmmmmmmmmmnnnnnnnnnnnnnnooooooooooooooopppppppppppppppp";
}
