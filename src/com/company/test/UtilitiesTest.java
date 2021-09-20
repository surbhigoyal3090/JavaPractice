package com.company.test;

import com.company.Utilities;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    Utilities utility;

    @Before
    public void setUp() {
        utility = new Utilities();
    }

    @Test
    public void everyNthChar_WHEN_N_Less_Than_Length() {
        char[] out = utility.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, out);
    }

    @Test
    public void everyNthChar_WHEN_N_GREATER_THAN_LENGTH() {
        char[] out = utility.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 6);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, out);
    }

    @Test
    public void removePairs() {
        String pairs = utility.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", pairs);
        assertEquals("A", utility.removePairs("A"));
        assertNull("Didn't get value", utility.removePairs(null));
    }

    @Test
    public void converter() {
        assertEquals(300,utility.converter(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_When_divided_by_Zero() {
        utility.converter(10,0);
    }

    @Test
    public void nullIfOddLength_WHEN_PASSED_EVEN_LENGTH() {
        assertNotNull("Even length string passed", utility.nullIfOddLength("ABCD"));
    }

    @Test
    public void nullIfOddLength_WHEN_PASSED_ODD_LENGTH() {
        assertNull("Passed odd length", utility.nullIfOddLength("ABCED"));
    }
}