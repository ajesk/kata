package io.acode.leetcode;

import java.util.List;

/**
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 *
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 *
 * You should return the indices: [0,9].
 * (order does not matter).
 */
public class SubstringWithMultipleWords {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordSize = words[0].length();
        for (int i = 0; i < s.length(); i += wordSize) {

        }
    }
}