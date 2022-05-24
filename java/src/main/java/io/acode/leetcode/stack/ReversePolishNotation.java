package io.acode.leetcode.stack;

import java.util.*;

public class ReversePolishNotation {
  final static Set<String> operations = Set.of("+", "-", "/", "*");

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < tokens.length; i++) {
      String current = tokens[i];
      if (!operations.contains(current)) {
        stack.push(Integer.parseInt(current));
      } else {
        int a = stack.pop();
        int b = stack.pop();
        switch (current) {
          case "+" -> stack.push(a + b);
          case "*" -> stack.push(a * b);
          case "/" -> stack.push(b / a);
          case "-" -> stack.push(b - a);
        }
      }
    }
    return stack.pop();
  }
}
