package by.andrey.twikss.exer1signcomparator.service;

import junit.framework.TestCase;
import org.junit.Test;

public class SignComparatorTest extends TestCase {

    @Test
    public void testCompareReturnPositiveNumber() {

        boolean expected = true;
        boolean actual = SignComparator.compare(100).equals("Number is positive");

        assertEquals(expected,actual);

    }

    @Test
    public void testCompareReturnNegative() {

        boolean expected = true;
        boolean actual = SignComparator.compare(-324).equals("Number is negative");

        assertEquals(expected,actual);

    }


    @Test
    public void testCompareReturnZero() {

        boolean expected = true;
        boolean actual = SignComparator.compare(0).equals("Number is equal to zero");

        assertEquals(expected,actual);

    }
}