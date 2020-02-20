package com.coding.bat.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoesItHave1and2Test {
    DoesItHave1and2 have1and2;

    @Test
    void isEmpty() {
        have1and2 = new DoesItHave1and2(new int[]{});
        assertEquals(0, have1and2.isEmpty());
    }

    @Test
    void has1And2() {
        have1and2 = new DoesItHave1and2(new int[]{1, 5, 7, 8, 11, 15, 2});
        assertTrue(have1and2.check1And2());
    }

    @Test
    void hasNo1And2() {
        have1and2 = new DoesItHave1and2(new int[]{3, 1, 4, 5, 6});
        assertFalse(have1and2.check1And2());
    }


}