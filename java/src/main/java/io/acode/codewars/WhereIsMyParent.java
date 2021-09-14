package io.acode.codewars;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Mothers arranged a dance party for the children in school.
// At that party, there are only mothers and their children.
// All are having great fun on the dance floor when suddenly all the lights went out.
// It's a dark night and no one can see each other.
// But you were flying nearby and you can see in the dark and have ability to teleport people anywhere you want.
//
//        Legend:
//        -Uppercase letters stands for mothers, lowercase stand for their children, i.e. "A" mother's children are "aaaa".
//        -Function input: String contains only letters, uppercase letters are unique.
//        Task:
//        Place all people in alphabetical order where Mothers are followed by their children, i.e. "aAbaBb" => "AaaBbb".
public class WhereIsMyParent {
    static String findChildren(final String text) {
        if (text.isEmpty()) return "";
        // sort into order
        String sortedParents = Arrays.stream(text.split(""))
                .map(String::toCharArray)
                .map(s -> s[0])
                .filter(s -> (int) s < 91)
                .sorted()
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));

        return Arrays.stream(sortedParents.split(""))
                .map(parent -> parent + Arrays.stream(text.split(""))
                        .filter(s -> s.equals(parent.toLowerCase()))
                        .collect(Collectors.joining())
                ).collect(Collectors.joining());
    }
}
