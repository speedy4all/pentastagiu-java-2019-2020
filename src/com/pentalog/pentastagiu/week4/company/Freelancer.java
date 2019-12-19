package com.pentalog.pentastagiu.week4.company;

public class Freelancer extends Person implements Imposable, Comparable {
    private int numberOfHours = 40;
    private int hourlyRate = 20;

    @Override
    public int calculateImposit() {
        return numberOfHours*hourlyRate*17/100;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
