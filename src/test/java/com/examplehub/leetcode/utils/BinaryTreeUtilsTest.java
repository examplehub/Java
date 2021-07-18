package com.examplehub.leetcode.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.examplehub.leetcode.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreeUtilsTest {
  @Test
  void test() {
    TreeNode root = BinaryTreeUtils.createTree(new int[] {1, 2, 3}, 0);
    assert root != null;
    assertEquals(1, root.val);
    assertEquals(2, root.left.val);
    assertEquals(3, root.right.val);
  }
}
