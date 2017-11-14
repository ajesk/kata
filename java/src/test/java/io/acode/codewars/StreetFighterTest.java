package io.acode.codewars;

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
        assertThat(StreetFighter.streetFighterSelection(fighters, startPos, new String[]{})).isEqualTo(new String[]{});
    }

    @Test
    public void testAlwaysMoveLeft() {
        String[] moves = new String[] { "left", "left", "left", "left", "left", "left", "left", "left" };
        String[] solution = new String[] { "Vega", "Balrog", "Guile", "Blanka", "E.Honda", "Ryu", "Vega", "Balrog" };
        assertThat(StreetFighter.streetFighterSelection(fighters, new int[] {0,0}, moves)).isEqualTo(solution);
    }

    @Test
    public void testAlwaysMoveRight(){
        String[] moves = new String[] { "right", "right", "right", "right", "right", "right", "right", "right" };
        String[] solution = new String[] { "E.Honda", "Blanka", "Guile", "Balrog", "Vega", "Ryu", "E.Honda", "Blanka" };
        assertThat(StreetFighter.streetFighterSelection(fighters, new int[] {0,0}, moves)).isEqualTo(solution);
    }

    @Test
    public void testUseAll4DirectionsClockwiseTwice(){
        String[] moves = new String[] { "up", "left", "down", "right", "up", "left", "down", "right" };
        String[] solution = new String[] { "Ryu", "Vega", "M.Bison", "Ken", "Ryu", "Vega", "M.Bison", "Ken" };
        assertThat(StreetFighter.streetFighterSelection(fighters, new int[] {0,0}, moves)).isEqualTo(solution);
    }

    @Test
    public void testlwaysMoveDown(){
        String[] moves = new String[] { "down", "down", "down", "down" };
        String[] solution = new String[] { "Ken", "Ken", "Ken", "Ken" };
        assertThat(StreetFighter.streetFighterSelection(fighters, new int[] {0,0}, moves)).isEqualTo(solution);
    }

    @Test
    public void testAlwaysMoveUp(){
        String[] moves = new String[] { "up", "up", "up", "up" };
        String[] solution = new String[] { "Ryu", "Ryu", "Ryu", "Ryu" };
        assertThat(StreetFighter.streetFighterSelection(fighters, new int[] {0,0}, moves)).isEqualTo(solution);
    }
}
