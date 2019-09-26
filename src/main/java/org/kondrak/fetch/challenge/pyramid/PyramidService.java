package org.kondrak.fetch.challenge.pyramid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;

/**
 * A service to detect whether a given word is a pyramid word.
 */
@Service
public class PyramidService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PyramidService.class);

    /**
     * Classifer function to determine whether the provided word is a pyramid word or not.
     *
     * @param word - the word to classify
     * @return boolean - true if the word is a pyramid word, false otherwise
     */
    public boolean isPyramidWord(String word) {
        // Split the string into 1-character parts, and add to a set (removing duplicates)
        HashSet<String> chars = new HashSet<>(Arrays.asList(word.split("")));

        HashSet<Integer> occurrences = determineCounts(word, chars);

        /*
         * Ensure that counts exist in ascending order, uninterrupted, from 1 to the number of distinct characters in
         * the string.  Short-circuit if the sizes are different because that means there was a duplicate count--which
         * precludes a word being a pyramid word.
         */
        if(chars.size() == occurrences.size()) {
            for (int i = 1; i < chars.size() + 1; i++) {
                if(occurrences.contains(i)) {   // Used HashSet so this lookup is constant-time
                    LOGGER.debug("Letter in {} with {} occurrences found.", word, i);
                } else {
                    LOGGER.debug("NO letter in {} with {} occurrences found.", word, i);
                    return false;
                }
            }
        } else {
            LOGGER.debug("Distinct letter count was different from occurrence counts.  This indicates a duplicate count.");
            return false;
        }

        return true;
    }

    /**
     * Determine counts for each distinct character, and put the results into a HashSet keyed on
     * number of occurrences.
     *
     * **Note** We don't need to worry about keys getting replaced in the set because if duplicate counts are found,
     * the size of the "chars" parameter and the returned set will differ
     *
     * @param word - The word to determine character counts for
     * @param chars - The distinct characters for the string
     * @return a {@link HashSet} containing counts for each of the distinct characters in the string
     */
    private static HashSet<Integer> determineCounts(String word, HashSet<String> chars) {
        HashSet<Integer> occurrences = new HashSet<>();
        chars.forEach((s) -> {
            int count = StringUtils.countOccurrencesOf(word, s);
            LOGGER.debug("Letter in word: {} - occurs {} times", s, count);
            occurrences.add(count);
        });

        return occurrences;
    }
}
