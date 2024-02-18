package com.epam.rd.autotasks;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class SortingTest {
    private static final Logger logger = Logger.getLogger(SortingTest.class.getName());

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase() {
        try {
            sorting.sort(null);
            fail();

        } catch (IllegalArgumentException e) {

            logger.info("testNullCase: Passed");
            assertTrue(true);

        } catch (Exception e) {
            throw new NullPointerException("Unexpected exception");
        }

    }

    /*

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }
     */


    @Test
    public void testEmptyCase() {
        int[] array = {};
        sorting.sort(array);
        assertArrayEquals(new int[]{}, array);

        logger.info("testEmptyCase: Passed");
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = {5};
        sorting.sort(array);
        assertArrayEquals(new int[]{5}, array);

        logger.info("testSingleElementArrayCase: passed");

    }

    @Test
    public void testSortedArraysCase() {
        int[] array = {1, 2, 3, 4, 5};
        sorting.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);

        logger.info("testSortedArrayCase: passed");
    }

    @Test
    public void testOtherCases() {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        sorting.sort(array);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, array);

        logger.info("testOtherCases: passed");

    }

}