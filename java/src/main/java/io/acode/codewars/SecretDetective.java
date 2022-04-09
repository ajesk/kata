package io.acode.codewars;

import java.util.Arrays;

//There is a secret string which is unknown to you.
// Given a collection of random triplets from the string, recover the original string.
//
//  A triplet here is defined as a sequence of three letters such that each letter occurs somewhere before the next in
//  the given string.
//  "whi" is a triplet for the string "whatisup".
//
//  As a simplification, you may assume that no letter occurs more than once in the secret string.
//
//  You can assume nothing about the triplets given to you other than that they are valid triplets and that they
//  contain sufficient information to deduce the original string.
//  In particular, this means that the secret string will never contain letters that do not occur in one
//  of the triplets given to you.
public class SecretDetective {
  public String recoverSecret(char[][] triplets) {
    String result = "";
    while (triplets.length != 0) {
      // get list of first chars
      for (char[] triplet : triplets) {
        if (triplet.length == 0) {
          continue;
        }
        char firstLetter = triplet[0];
        boolean found = false;

        for (char[] checkTriplet : triplets) {
          if (checkTriplet.length == 0) continue;

          if (checkTriplet.length == 3) {
            found = found || checkTriplet[1] == firstLetter || checkTriplet[2] == firstLetter;
          } else if (checkTriplet.length == 2) {
            found = found || checkTriplet[1] == firstLetter;
          }
        }

        if (!found) {
          result += firstLetter;
          for (int i = 0; i < triplets.length; i++) {
            if (triplets[i].length != 0 && triplets[i][0] == firstLetter) {
              triplets[i] = Arrays.copyOfRange(triplets[i], 1, triplets[i].length);
            }
          }
        }
      }
      boolean lettersLeft = false;
      for (char[] triplet : triplets) {
        lettersLeft = lettersLeft || triplet.length != 0;
      }
      if (!lettersLeft) break;
    }
    return result;
  }
}
