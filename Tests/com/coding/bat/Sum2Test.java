package com.coding.bat;
/**
 * Given an array of ints, return the sum of the first 2 elements in the array. If the array length is
 * less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 * sum2([1, 2, 3]) → 3
 * sum2([1, 1]) → 2
 * sum2([1, 1, 1, 1]) → 2
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Sum2Test {
    Sum2 sum2;

    @Test
    void sumUpElements1() {
        sum2 = new Sum2(new int[]{});
        assertEquals(0, sum2.sumUp2Elements());
    }

    @Test
    void sumUpElements2() {
        sum2 = new Sum2(new int[]{10, 20, 30});
        assertEquals(30, sum2.sumUp2Elements());
    }

    @Test
    void sumUpElements3() {
        sum2 = new Sum2(new int[]{5});
        assertEquals(5, sum2.sumUp2Elements());
    }

}