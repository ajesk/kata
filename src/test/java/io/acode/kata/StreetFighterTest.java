package io.acode.kata;

import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class StreetFighterTest {
    private final String[][] fighters = {
            {"Ryu", "E.Honda","Blanka","Guile","Balrog","Vega"},
            {"Ken","Chun Li","Zangief","Dhalsim","Sagat","M.Bison"}
    };

    @Test
    public void testFewPlayers() {
        int[] startPos = {0,0};
        String[] moves = new String[] { "up", "left", "right", "left", "left" };
        String[] solution = new String[] { "Ryu", "Vega", "Ryu", "Vega", "Balrog" };
        assertThat(StreetFighter.streetFighterSelection(fighters, startPos, moves)).isEqualTo(solution);
    }

    @Test
    public void testGetNoPlayers() {
        int[] startPos = {0,0};
        //assertThat(StreetFighter.streetFighterSelection(fighters, startPos, new String[]{})).isEqualTo(new String[]{});
    }

}
