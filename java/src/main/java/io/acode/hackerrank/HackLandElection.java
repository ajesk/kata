package io.acode.hackerrank;

import java.util.*;

public class HackLandElection {
    Map<String, Integer> tally = new HashMap<>();

    void tallyVotes(String[] votes) {
        Arrays.stream(votes).forEach(vote -> {
            if (!tally.containsKey(vote)) {
                tally.put(vote, 1);
            } else {
                tally.put(vote, tally.get(vote) + 1);
            }
        });
    }

    List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        int highestValue = 0;
        for (Map.Entry<String, Integer> entry : tally.entrySet()) {
            if (entry.getValue() > highestValue) {
                winners.clear();
                highestValue = entry.getValue();
                winners.add(entry.getKey());
            } else {
                winners.add(entry.getKey());
            }
        }
        return winners;
    }

    String tieBreaker(List<String> winners) {
        return winners.stream().max(String::compareTo).get();
    }

    /*
     * Complete the function below.
     */
    static String electionWinner(String[] votes) {
        System.out.println(Arrays.toString(votes));
        HackLandElection hackLandElection = new HackLandElection();
        hackLandElection.tallyVotes(votes);

        List<String> winners = hackLandElection.getWinners();

        if (winners.size() == 1) {
            return winners.get(0);
        }

        return hackLandElection.tieBreaker(winners);
    }
}
