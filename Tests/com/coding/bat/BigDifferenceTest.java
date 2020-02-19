package com.coding.bat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDifferenceTest {

    //    BigDifference([10, 3, 5, 6]) → 7
//    BigDifference([7, 2, 10, 9]) → 8
//    BigDifference([2, 10, 7, 2]) → 8
    BigDifference bigDiff;

    @Test
    void getMaxDiff1() {
        bigDiff = new BigDifference(new int[]{2, 10, 7, 2});
        assertEquals(8, bigDiff.getMaxDiff());
    }

    @Test
    void getMaxDiff2() {
        bigDiff = new BigDifference(new int[]{10, 3, 5, 6});
        assertEquals(7, bigDiff.getMaxDiff());
    }

    @Test
    void getMaxDiff3() {
        bigDiff = new BigDifference(new int[]{6});
        assertEquals(0, bigDiff.getMaxDiff());
    }
}