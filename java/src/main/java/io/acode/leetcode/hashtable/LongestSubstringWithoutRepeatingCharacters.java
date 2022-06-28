package io.acode.leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
  private boolean containsDuplicate(String substring) {
    Set<Character> chars = new HashSet<>();

    for (char ch : substring.toCharArray()) {
      if (chars.contains(ch)) {
        return true;
      }
      chars.add(ch);
    }

    return false;
  }

  public int lengthOfLongestSubstring(String s) {
    int max = 0;
    int base = 0;
    for (int i = 0; i <= s.length(); i++) {
      if (containsDuplicate(s.substring(base, i))) {
        base++;
      } else {
        max = Math.max(i - base, max);
      }
    }

    return max;
  }

  public int lengthOfLongestSubstring2(String s) {
    Integer[] chars = new Integer[128];
    int left = 0;
    int right = 0;
    int max = 0;

    while (right < s.length()) {
      char r = s.charAt(right);
      Integer index = chars[r];

      if (index != null && index >= left && index < right) {
        left = index + 1;
      }

      max = Math.max(max, right - left + 1);
      chars[r] = right;
      right++;
    }
    return max;
  }
}
