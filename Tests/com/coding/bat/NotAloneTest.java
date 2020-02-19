package com.coding.bat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotAloneTest {
    NotAlone notAlone;

    @Test
    void replacedAloneCase1() {
        notAlone = new NotAlone(new int[]{1, 3}, 3);
        assertArrayEquals(new int[]{1, 3}, notAlone.checkIfAloneReplaced());
    }

    @Test
    void replacedAloneCase2() {
        notAlone = new NotAlone(new int[]{1, 2, 3, 2, 5, 2}, 2);
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, notAlone.checkIfAloneReplaced());
    }

    @Test
    void replacedAloneCase3() {
        notAlone = new NotAlone(new int[]{1, 1, 1, 2}, 2);
        assertArrayEquals(new int[]{1, 1, 1, 2}, notAlone.checkIfAloneReplaced());
    }

    @Test
    void replacedAloneCase4() {
        notAlone = new NotAlone(new int[]{1, 2, 3, 2, 5, 2}, 2);
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, notAlone.checkIfAloneReplaced());
    }
}