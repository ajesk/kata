package io.acode.hackerrank;

import io.acode.util.TestUtils;
import org.junit.Test;

public class TesElection extends TestUtils {
    String[] test1 = new String[] {
            "10",
            "Alex",
            "Michael",
            "Harry",
            "Dave",
            "Michael",
            "Victor",
            "Harry",
            "Alex",
            "Mary",
            "Mary"
    };
    String[] test2 = new String[] {
            "10",
            "Victor",
            "Veronica",
            "Ryan",
            "Dave",
            "Maria",
            "Maria",
            "Farah",
            "Farah",
            "Ryan",
            "Veronica"
    };

    @Test
    public void testScenario1() {
        String winner = HackLandElection.electionWinner(test1);
        assert winner.equalsIgnoreCase("Michael");
    }

    @Test
    public void testScenario2() {
        String winner = HackLandElection.electionWinner(test2);
        assert winner.equalsIgnoreCase("Veronica");
    }
}
