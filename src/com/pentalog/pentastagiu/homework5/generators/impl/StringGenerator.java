package com.pentalog.pentastagiu.homework5.generators.impl;

import com.pentalog.pentastagiu.homework5.exceptions.IllegalNumberOfStringsException;
import com.pentalog.pentastagiu.homework5.generators.Generator;
import com.pentalog.pentastagiu.homework5.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class StringGenerator implements Generator<String> {

    private int numberOfStrings;

    private static final String[] possibleString = "He went back to the video to see what had been recorded and was shocked at what he saw".split(" ");

    public StringGenerator(int numberOfStrings) {
        if (numberOfStrings <= 0) {
            throw new IllegalNumberOfStringsException("Numarul de stringuri generate nu poate fi negativ sau 0");
        }
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String generate() {
        return possibleString[RandomUtils.getRandomIntInLimit(possibleString.length) - 1];
    }

    @Override
    public List<String> generateList() {
        int number = numberOfStrings;
        List<String> strings = new ArrayList<>();
        while (number != 0) {
            strings.add(generate());
            number--;
        }
        return strings;
    }
}
