package io.acode.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * data and data1 are two strings with rainfall records of a few cities for months from
 * January to December. The records of towns are separated by \n. The name of each town is followed by :.

 data and towns can be seen in "Your Test Cases:".

 Task:

 function: mean(town, strng) should return the average of rainfall for the city town and the strng data or data1 (In R this function is called avg).
 function: variance(town, strng) should return the variance of rainfall for the city town and the strng data or data1.
 Examples:

 mean("London", data), 51.19(9999999999996)
 variance("London", data), 57.42(833333333374)
 Notes:

 if functions mean or variance have as parameter town a city which has no records return -1
 Don't truncate or round: the tests will pass if abs(your_result - test_result) <= 1e-2 or abs((your_result - test_result) / test_result) <= 1e-6 depending on the language.
 http://www.mathsisfun.com/data/standard-deviation.html
 data and data1 are adapted from http://www.worldclimate.com
 */
public class Rainfall {

    /**
     * Returns a collection object with the data broken down.
     * @param data
     * @return - Map<City, List<Temps>>
     */
    static Map<String, List<String>> cityBreakdown(String data) {
        Map<String, List<String>> breakdown = new HashMap<>();
        Arrays.stream(data.split("\n"))
                .forEach(line -> {
                    String[] dataSplit = line.split(":");
                    String city = dataSplit[0], values = dataSplit[1];
                    breakdown.put(city, Arrays.stream(values.split(","))
                            .map(monthData -> monthData.split(" ")[1])
                            .collect(Collectors.toList()));
                });
        return breakdown;
    }

    public static double mean(String town, String data) {
        try {
            return cityBreakdown(data)
                    .get(town)
                    .stream()
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .getAsDouble();
        } catch (Exception e) {
            return -1;
        }

    }

    // This is terribly inefficient since it processes the data string twice. Was just too lazy to tie the methods
    // together.
    public static double variance(String town, String data) {
        double rainMean = mean(town, data);
        if (rainMean == -1) return rainMean;
        return cityBreakdown(data)
                .get(town)
                .stream()
                .mapToDouble(val -> Math.pow(Double.parseDouble(val) - rainMean, 2))
                .average()
                .getAsDouble();
    }
}
