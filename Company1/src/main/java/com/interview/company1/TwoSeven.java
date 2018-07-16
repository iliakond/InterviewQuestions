package com.interview.company1;

import java.util.stream.IntStream;

public class TwoSeven {
    public void print() {
        IntStream.rangeClosed(0, 100).mapToObj(i -> {
            if (i % (2 * 7) == 0) {
                return "TwoSeven";
            } else if (i % 7 == 0) {
                return "Seven";
            } else if ((i % 2) == 0) {
                return "Two";
            } else {
                return Integer.toString(i);
            }
        }).forEach(System.out::println);
    }
}
