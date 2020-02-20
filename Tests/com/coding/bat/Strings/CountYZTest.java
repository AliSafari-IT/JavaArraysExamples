package com.coding.bat.Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountYZTest {
//    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
//    in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
//    sensitive). We'll say that a y or z is at the end of a word if there is not
//    an alphabetic letter immediately following it. (Note: Character.isLetter(char)
//    tests if a char is an alphabetic letter.)
//
//
//    countYZ("fez day") → 2
//    countYZ("day fez") → 2
//    countYZ("day fyyyz") → 2

    CountYZ yz;

    @Test
    void countYZ1() {
        yz = new CountYZ("fez day");
        assertEquals(2, yz.countYZ());
    }

    @Test
    void countYZ2() {
        yz = new CountYZ("day fyyyz y");
        assertEquals(3, yz.countYZ());
    }

    @Test
    void countYZ3() {
        yz = new CountYZ("!!day--yaz!!");
        assertEquals(2, yz.countYZ());
    }

    @Test
    void countYZ4() {
        yz = new CountYZ("zxyx");
        assertEquals(0, yz.countYZ());
    }
}