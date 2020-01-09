package com.pentalog.pentastagiu.week5.collections;

import java.util.Comparator;

public class SecondLetterComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        // negative , s < t1
        // 0, s==t1
        //positive, s>t1
        return s.charAt(1) - t1.charAt(1);
    }
}
