package com.examplehub.basics.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopTest {
    @Test
    void testSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        assertEquals(5050, sum);
    }

    @Test
    void testAccessArray(){
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
        }
        assertEquals(15, sum);

        sum = 0;
        for (int num : nums) {
            sum += num;
        }
        assertEquals(15, sum);
    }
}