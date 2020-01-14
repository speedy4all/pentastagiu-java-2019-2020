package com.pentalog.pentastagiu.homework5.generators.impl;

import com.pentalog.pentastagiu.homework5.exceptions.IllegalRadiusException;
import com.pentalog.pentastagiu.homework5.generators.Generator;
import com.pentalog.pentastagiu.homework5.shapes.Circle;
import com.pentalog.pentastagiu.homework5.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class CirclesGenerator implements Generator<Circle> {

    private int radiusLimit;

    public CirclesGenerator(int radiusLimit) {
        if (radiusLimit <= 0) {
            throw new IllegalRadiusException("Raza nu poate fi negativa sau 0");
        }
        this.radiusLimit = radiusLimit;
    }

    @Override
    public Circle generate() {
        return new Circle(RandomUtils.getRandomIntInLimit(radiusLimit), Math.random(), Math.random());
    }

    @Override
    public List<Circle> generateList() {
        List<Circle> circles = new ArrayList<>();
        while (Math.random() >= 0.01) {
            circles.add(generate());
        }
        return circles;
    }


}
