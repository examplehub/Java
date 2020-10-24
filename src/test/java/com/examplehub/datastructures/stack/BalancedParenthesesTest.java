package com.examplehub.datastructures.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BalancedParenthesesTest {
  @Test
  void testIsBalanced() {
    assertTrue(BalancedParentheses.isBalanced("([]{})"));
    assertTrue(BalancedParentheses.isBalanced("[()]{}{[()()]()}"));
    assertFalse(BalancedParentheses.isBalanced("[(])"));
  }

  @Test
  void testIsPaired() {
    assertTrue(BalancedParentheses.isPaired('[', ']'));
    assertTrue(BalancedParentheses.isPaired('(', ')'));
    assertTrue(BalancedParentheses.isPaired('{', '}'));
    assertFalse(BalancedParentheses.isPaired('(', '}'));
  }
}
