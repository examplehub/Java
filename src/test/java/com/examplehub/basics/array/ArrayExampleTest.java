package com.examplehub.basics.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {
    @Test
    void testInit() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(nums));

        nums = new int[]{1, 2, 3};
        assertEquals("[1, 2, 3]", Arrays.toString(nums));
    }

    @Test
    void testReadWrite() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(4, nums[3]);
        assertEquals(5, nums[4]);

        for (int i = 0; i < nums.length; ++i) {
            assertEquals(i + 1, nums[i]);
        }

        for (int i = nums.length - 1; i > 0; --i) {
            assertEquals(i + 1, nums[i]);
        }

        nums[0] = 0;
        assertEquals(0, nums[0]);

        try {
            nums[nums.length] = 1;
            fail(); /* wont' execute it */
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            assertTrue(true);
        }

        try {
            nums[-1] = 1;
            fail(); /* wont' execute it */
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            assertTrue(true);
        }

    }

    @Test
    void testLength() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, nums.length);
        nums = new int[]{};
        assertEquals(0, nums.length);
    }

    @Test
    void testTravelUsingFor() {
        int[] nums = {1, 2, 3, 4, 5};
        int count = 1;
        for (int num : nums) {
            assertEquals(count++, num);
        }
    }

    @Test
    void testToString() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(nums));
    }

    @Test
    void testStringArray() {
        String[] company = {"Google", "Facebook", "Amazon", "Microsoft"};
        assertEquals("Google", company[0]);
        assertEquals("Facebook", company[1]);
        assertEquals("Amazon", company[2]);
        assertEquals("Microsoft", company[3]);
        assertEquals('g', company[0].charAt(3));
        assertEquals("[Google, Facebook, Amazon, Microsoft]", Arrays.toString(company));
    }

    @Test
    void tesTwoDimensionalArray() {
        int[][] twoDimensionalNumbers = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9},
                {10, 11, 12, 13, 14, 15}
        };
        assertEquals(4, twoDimensionalNumbers.length);

        assertEquals(3, twoDimensionalNumbers[0].length);
        assertEquals(4, twoDimensionalNumbers[1].length);
        assertEquals(2, twoDimensionalNumbers[2].length);
        assertEquals(6, twoDimensionalNumbers[3].length);

        assertEquals(9, twoDimensionalNumbers[2][1]);
        int count = 1;
        for (int i = 0; i < twoDimensionalNumbers.length; ++i) {
            for (int j = 0; j < twoDimensionalNumbers[i].length; ++j) {
                assertEquals(count++, twoDimensionalNumbers[i][j]);
            }
        }

        count = 1;
        for (int[] twoDimensionalNumber : twoDimensionalNumbers) {
            for (int num : twoDimensionalNumber) {
                assertEquals(count++, num);
            }
        }

        assertEquals("[1, 2, 3]", Arrays.toString(twoDimensionalNumbers[0]));
        assertEquals("[4, 5, 6, 7]", Arrays.toString(twoDimensionalNumbers[1]));
        assertEquals("[8, 9]", Arrays.toString(twoDimensionalNumbers[2]));
        assertEquals("[10, 11, 12, 13, 14, 15]", Arrays.toString(twoDimensionalNumbers[3]));
        assertEquals("[[1, 2, 3], [4, 5, 6, 7], [8, 9], [10, 11, 12, 13, 14, 15]]", Arrays.deepToString(twoDimensionalNumbers));

    }

    @Test
    void testSort() {
        int[] nums = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        Arrays.sort(nums);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(nums));
    }


}