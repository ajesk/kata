package io.acode.codewars;

import java.util.List;

public class BinaryArrayToInt {
  public static int convertBinaryArrayToInt(List<Integer> binary) {
    int sum = 0;
    for (int i = 0; i < binary.size(); i++) {
     sum += binary.get(i) * Math.pow(2, binary.size() - i - 1);
    }
    return sum;
  }
}
