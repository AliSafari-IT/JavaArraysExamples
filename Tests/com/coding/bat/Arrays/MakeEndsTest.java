package com.coding.bat.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MakeEndsTest {
    MakeEnds makeEnds;

    @Test
    void makeEnds() {
        makeEnds = new MakeEnds(new int[]{1, 2, 3});
        int[] expectedArr = new int[]{1, 3};
        assertArrayEquals(expectedArr, makeEnds.makeEnds());
    }

    @Test
    void makeEnds2() {
        makeEnds = new MakeEnds(new int[]{7});
        int[] expectedArr = new int[]{7, 7};
        assertArrayEquals(expectedArr, makeEnds.makeEnds());
    }


}