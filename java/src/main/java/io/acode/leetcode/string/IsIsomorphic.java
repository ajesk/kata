package io.acode.leetcode.string;

public class IsIsomorphic {

  public boolean isIsomorphic(String s, String t) {
    char[] sMapping = new char[128];
    char[] tMapping = new char[128];

    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (sMapping[sChar] == 0 && tMapping[tChar] == 0) {
        sMapping[sChar] = tChar;
        tMapping[tChar] = sChar;
        continue;
      }
      if (sMapping[sChar] != tChar && tMapping[tChar] != sChar) return false;
    }

    return true;
  }
}
