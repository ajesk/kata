package io.acode.leetcode.stack;

import java.util.Stack;

public class DecodeString {

  public String decodeString(char[] s, int index) {
    StringBuilder out = new StringBuilder();
    StringBuilder number = new StringBuilder();
    Stack<Character> brackets = new Stack<>();

    for (int i = index; i < s.length; i++) {
      char current = s[i];
      if (current == '[') {
        brackets.push('[');
        if (number.isEmpty()) continue;

        int loopTimes = Integer.parseInt(number.toString());
        for (int j = 0; j < loopTimes; j++) {
          out.append(decodeString(s, i + 1));
        }
        number = new StringBuilder();
      } else if (current == ']') {
        if (brackets.isEmpty()) return out.toString();
        brackets.pop();
      } else if (brackets.isEmpty()) {
        if (!Character.isDigit(current)) {
          if (brackets.isEmpty()) {
            out.append(current);
          }
        } else {
          number.append(s[i]);
        }
      }
    }
    return out.toString();
  }

  public String decodeString(String s) {
    return decodeString(s.toCharArray(), 0);
  }
}
