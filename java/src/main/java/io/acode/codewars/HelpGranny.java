package io.acode.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HelpGranny {
  public static int tour(String[] arrFriends, String[][] towns, Map<String, Double> h) {
    Map<String, String> townMap = getTownMap(towns);

    List<String> friends = filterUnfoundFriends(arrFriends, townMap);
    if (friends.isEmpty()) return 0;

    return (int) (h.get(townMap.get(friends.get(0))) + // first
      getDistanceBetweenLocales(h, townMap, friends) +
      h.get(townMap.get(friends.get(friends.size() - 1)))); // last
  }

  private static double getDistanceBetweenLocales(Map<String, Double> h, Map<String, String> townMap, List<String> friends) {
    return IntStream.rangeClosed(0, friends.size() - 2)
      .mapToDouble(i -> pythTheorem(h.get(townMap.get(friends.get(i))), h.get(townMap.get(friends.get(i + 1)))))
      .sum();
  }

  private static List<String> filterUnfoundFriends(String[] arrFriends, Map<String, String> townMap) {
    return Arrays.stream(arrFriends)
      .filter(townMap::containsKey)
      .collect(Collectors.toList());
  }

  private static Map<String, String> getTownMap(String[][] ftwns) {
    Map<String, String> townMap = new HashMap<>();
    for (String[] townEntry : ftwns) {
      townMap.put(townEntry[0], townEntry[1]);
    }
    return townMap;
  }

  private static double pythTheorem(Double x, Double y) {
    return Math.sqrt(Math.abs(
        Math.pow(x, 2) - Math.pow(y, 2)
      )
    );
  }
}
