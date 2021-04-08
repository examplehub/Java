package com.examplehub.leetcode.middle;

import com.examplehub.leetcode.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 */
public class NextGreaterNodeInLinkedList {
    public static int[] solution1(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        int[] numbers = list.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < numbers.length; ++i) {
            boolean exists = false;
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[j] > numbers[i]) {
                    numbers[i] = numbers[j];
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                numbers[i] = 0;
            }
        }
        return numbers;
    }
}
