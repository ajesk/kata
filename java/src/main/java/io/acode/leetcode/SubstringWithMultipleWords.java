package io.acode.leetcode;

import java.util.*;

/**
 * You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of
 * substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 *
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 *
 * You should return the indices: [0,9].
 * (order does not matter).
 */
public class SubstringWithMultipleWords {

    // I like recursion :)
    String getDots(int wordSize) {
        if (wordSize > 1) return "." + getDots(wordSize - 1);
        else return ".";
    }

    String[] getSlices(String s, int wordSize) {
        return s.split("(?<=\\G" + getDots(wordSize) + ")");
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<String> wordList = Arrays.asList(words);
        List<String> workingList;
        int wordSize = words[0].length();
        String[] sSlices;
        List<Integer> indeces = new ArrayList<>();

        for (int i = 0; i < s.length() - (wordSize * words.length) - 1; i++) {
            sSlices = getSlices(s, wordSize);
            workingList = new ArrayList<>(wordList);
            for (int y = i; y < i + words.length - 1; y++) {
                System.out.println(i + " "+ y);
                if (workingList.contains(sSlices[y])) {
                    workingList.remove(sSlices[y]);
                } else {
                    break;
                }
            }
            if (workingList.isEmpty()) indeces.add(i * wordSize);
        }

        return indeces;
    }
}