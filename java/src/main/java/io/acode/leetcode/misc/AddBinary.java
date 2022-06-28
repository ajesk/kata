package io.acode.leetcode.misc;

public class AddBinary {

  public String addBinary(String a, String b, boolean carry) {
    if (a.isEmpty() && b.isEmpty()) return carry ? "1" : "";
    String lastA = a.isEmpty() ? a : a.substring(a.length() - 1);
    String lastB = b.isEmpty() ? b : b.substring(b.length() - 1);
    String strippedA = a.isEmpty() ? a : a.substring(0, a.length() - 1);
    String strippedB = b.isEmpty() ? b : b.substring(0, b.length() - 1);

    if ("1".equals(lastA) && "1".equals(lastB)) {
      return addBinary(strippedA, strippedB, true) + (carry ? "1" : "0");
    } else if ("1".equals(lastA) || "1".equals(lastB)) {
      return addBinary(strippedA, strippedB, carry) + (carry ? "0" : "1");
    } else {
      return addBinary(strippedA, strippedB, false) + (carry ? "1" : 0);
    }
  }

  public String addBinary(String a, String b) {
    return addBinary(a, b, false);
  }


//  public String addBinary(String a, String b) {
//    BigInteger x = new BigInteger(a, 2);
//    BigInteger y = new BigInteger(b, 2);
//    BigInteger zero = new BigInteger("0", 2);
//    BigInteger carry, answer;
//    while (y.compareTo(zero) != 0) {
//      answer = x.xor(y);
//      carry = x.and(y).shiftLeft(1);
//      x = answer;
//      y = carry;
//    }
//    return x.toString(2);
//  }
}
