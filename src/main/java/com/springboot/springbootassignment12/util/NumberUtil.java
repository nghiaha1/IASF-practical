package com.springboot.springbootassignment12.util;

import java.util.Random;

public class NumberUtil {
    public static int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
