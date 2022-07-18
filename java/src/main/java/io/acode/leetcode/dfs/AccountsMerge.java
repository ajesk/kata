package io.acode.leetcode.dfs;

import java.util.*;

public class AccountsMerge {

  private Map<String, List<String>> emailMap;
  private Set<String> visited;

  private SortedSet<String> dfs(SortedSet<String> result, String email) {
    result.add(email);
    visited.add(email);

    for (String nextEmail : emailMap.get(email)) {
      if (!visited.contains(nextEmail)) {
        dfs(result, nextEmail);
      }
    }

    return result;
  }

  public List<List<String>> accountsMerge(List<List<String>> accounts) {
    emailMap = new HashMap<>();
    visited = new HashSet<>();

    for (List<String> account : accounts) {
      for (int i = 1; i < account.size(); i++) {
        emailMap.computeIfAbsent(account.get(i), x -> new ArrayList<>());

        for (int j = i; j < account.size(); j++) {
          emailMap.computeIfAbsent(account.get(j), x -> new ArrayList<>());
          emailMap.get(account.get(i)).add(account.get(j));
          emailMap.get(account.get(j)).add(account.get(i));
        }
      }
    }

    List<List<String>> result = new ArrayList<>();
    for (List<String> account : accounts) {
      String name = account.get(0);
      String firstEmail = account.get(1);
      if (!visited.contains(firstEmail)) {
        List<String> nameList = new ArrayList<>();
        SortedSet<String> emailSet = new TreeSet<>();
        nameList.add(name);
        nameList.addAll(dfs(emailSet, firstEmail).stream().toList());

        result.add(nameList);
      }
    }
    return result;
  }
}
