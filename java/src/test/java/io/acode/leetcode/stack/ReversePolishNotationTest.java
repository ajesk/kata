package io.acode.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationTest {
  ReversePolishNotation target = new ReversePolishNotation();

  @Test
  public void testBasic() {
    assertEquals(3, target.evalRPN(new String[]{"1","2","+"}));
    assertEquals(1, target.evalRPN(new String[]{"2","1","-"}));
    assertEquals(4, target.evalRPN(new String[]{"2","2","*"}));
    assertEquals(2, target.evalRPN(new String[]{"4","2","/"}));
  }

  @Test
  public void testDivisionToZero() {
    assertEquals(1, target.evalRPN(new String[]{"10", "6", "/"}));
  }

  @Test
  public void testLeet() {
    assertEquals(6, target.evalRPN(new String[]{"4","13","5","/","+"}));
    assertEquals(22, target.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
  }
}
