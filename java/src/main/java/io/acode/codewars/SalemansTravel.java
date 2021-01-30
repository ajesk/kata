package io.acode.codewars;

import java.util.*;

/**
 * A traveling salesman has to visit clients. He got each client's address e.g. "432 Main Long Road St. Louisville OH 43071"
 * as a list.
 * <p>
 * The basic zipcode format usually consists of two capital letters followed by a white space and five digits.
 * The list of clients to visit was given as a string of all addresses, each separated from the others by a comma, e.g. :
 * <p>
 * "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432".
 * <p>
 * To ease his travel he wants to group the list by zipcode.
 * <p>
 * Task
 * The function travel will take two parameters r (addresses' list of all clients' as a string) and zipcode and returns a string in the following format:
 * <p>
 * zipcode:street and town,street and town,.../house number,house number,...
 * <p>
 * The street numbers must be in the same order as the streets where they belong.
 * <p>
 * If a given zipcode doesn't exist in the list of clients' addresses return "zipcode:/"
 */

class SalesmansTravel {
    public static String travel(String listing, String search) {
        if (search.isEmpty()) return ":/";
        List<String> numbers = new ArrayList<>();
        List<String> streets = new ArrayList<>();

        Arrays.stream(listing.split(","))
                .filter(s -> s.substring(s.lastIndexOf(" ") - 2).equals(search))
                .map(s -> s.substring(0, s.lastIndexOf(" ") - 2))
                .forEach(s -> {
                    numbers.add(s.substring(0, s.indexOf(" ")));
                    streets.add(s.substring(s.indexOf(" ") + 1, s.length() - 1));
                });

        return search + ":" + String.join(",", streets) + "/" + String.join(",", numbers);
    }
}
