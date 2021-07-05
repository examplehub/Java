package com.examplehub.leetcode.easy;

import java.util.Stack;

/** https://leetcode.com/problems/implement-queue-using-stacks/ */
public class ImplementQueueUsingStacks {
  private Stack firstStack;
  private Stack secondStack;

  public ImplementQueueUsingStacks() {
    firstStack = new Stack<>();
    secondStack = new Stack<>();
  }

  public void push(int x) {
    firstStack.push(x);
  }

  public int pop() {
    if (secondStack.isEmpty()) {
      while (!firstStack.isEmpty()) {
        secondStack.push(firstStack.pop());
      }
    }
    return secondStack.isEmpty() ? -1 : (int) secondStack.pop();
  }

  public int peek() {
    if (secondStack.isEmpty()) {
      while (!firstStack.isEmpty()) {
        secondStack.push(firstStack.pop());
      }
    }
    return secondStack.isEmpty() ? -1 : (int) secondStack.peek();
  }

  public boolean empty() {
    return firstStack.isEmpty() && secondStack.isEmpty();
  }
}
