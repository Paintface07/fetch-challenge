package org.kondrak.fetch.challenge.pyramid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class PyramidService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PyramidService.class);

    public boolean isPyramidWord(String word) {
        HashSet<String> chars = new HashSet<>(Arrays.asList(word.split("")));

        for(String s : chars) {
            LOGGER.info("Letter in word: {} - occurs {} times", s, StringUtils.countOccurrencesOf(word, s));
        }

        return true;
    }
}
