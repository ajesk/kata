package io.acode.codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Meeting {
    private static class Person {
        String getFirst() {
            return first;
        }

        String getLast() {
            return last;
        }

        Person(String first, String last) {
            this.first = first;
            this.last = last;
        }

        String first;
        String last;
    }

    public static String meeting(String seed) {
        return Arrays.stream(seed.toUpperCase().split(";"))
                .map(s -> s.split(":"))
                .map(s -> new Person(s[0], s[1]))
                .sorted(Comparator.comparing(Person::getLast)
                        .thenComparing(Person::getFirst))
                .map(p -> String.format("(%s, %s)", p.getLast(), p.getFirst()))
                .collect(Collectors.joining());
    }
}
