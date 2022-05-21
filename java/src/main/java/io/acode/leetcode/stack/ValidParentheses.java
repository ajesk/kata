package io.acode.leetcode.stack;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
  private final Map<Character, Character> pairs = Map.of(
    '}', '{',
    ']', '[',
    ')', '('
  );

  public boolean isValid(String s) {
    Stack<Character> parenStack = new Stack<>();
    if (s.length() % 2 == 1) return false;

    for (char character : s.toCharArray()) {
      if (pairs.containsKey(character)) {
        if (parenStack.isEmpty() || !parenStack.peek().equals(pairs.get(character))) {
          return false;
        }
        parenStack.pop();
      } else {
        parenStack.push(character);
      }
    }

    return parenStack.isEmpty();
  }
}
