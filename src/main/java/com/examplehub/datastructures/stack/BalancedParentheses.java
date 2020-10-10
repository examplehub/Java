package com.examplehub.datastructures.stack;

import java.util.Stack;

public class BalancedParentheses {

    /**
     * Test if a parentheses expression
     *
     * @param parenthesesExpr the parentheses expression
     * @return {@code true} if given parentheses expression is balanced.å
     */
    public static boolean isBalanced(String parenthesesExpr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parenthesesExpr.length(); i++) {
            switch (parenthesesExpr.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(parenthesesExpr.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty() || !isPaired(stack.pop(), parenthesesExpr.charAt(i))) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

    /**
     * Test if left bracket and right bracket is paired.
     *
     * @param leftBracket  the left bracket.
     * @param rightBracket the right bracket.
     * @return {@code true} if two brackets are paired.
     */
    public static boolean isPaired(char leftBracket, char rightBracket) {
        return leftBracket == '(' && rightBracket == ')'
                || leftBracket == '[' && rightBracket == ']'
                || leftBracket == '{' && rightBracket == '}';
    }
}
