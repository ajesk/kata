package io.acode.leetcode.dfs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfIslandsTest {
  NumberOfIslands target = new NumberOfIslands();

  @Test
  public void testBasic() {
    assertEquals(0, target.numIslands(new char[][]{{'0'}}));
    assertEquals(1, target.numIslands(new char[][]{{'1'}}));
  }

  @Test
  public void testTwoNodeInRow() {
    assertEquals(1, target.numIslands(new char[][]{{'1', '0'}}));
    assertEquals(0, target.numIslands(new char[][]{{'0', '0'}}));
    assertEquals(1, target.numIslands(new char[][]{{'1', '1'}}));
  }

  @Test
  public void testTwoNodeInColumn() {
    assertEquals(1, target.numIslands(new char[][]{{'1'}, {'1'}}));
    assertEquals(0, target.numIslands(new char[][]{{'0'}, {'0'}}));
    assertEquals(1, target.numIslands(new char[][]{{'1'}, {'0'}}));
  }

  @Test
  public void testThreeNodesInARow() {
    assertEquals(2, target.numIslands(new char[][]{{'1'}, {'0'}, {'1'}}));
    assertEquals(1, target.numIslands(new char[][]{{'1'}, {'1'}, {'1'}}));
    assertEquals(2, target.numIslands(new char[][]{{'1', '0', '1'}}));
    assertEquals(1, target.numIslands(new char[][]{{'1', '1', '1'}}));
    assertEquals(0, target.numIslands(new char[][]{{'0', '0', '0'}}));
  }

  @Test
  public void twoByTwoGrid() {
    assertEquals(2, target.numIslands(new char[][]{{'1', '0'}, {'0', '1'}}));
    assertEquals(1, target.numIslands(new char[][]{{'1', '0'}, {'1', '1'}}));
  }

  @Test
  public void threeByThreeGrid() {
    assertEquals(2, target.numIslands(new char[][]{
      {'1', '1', '1'},
      {'0', '0', '0'},
      {'1', '1', '1'}
    }));
    assertEquals(1, target.numIslands(new char[][]{
      {'1', '1', '1'},
      {'0', '0', '1'},
      {'0', '1', '1'}
    }));
    assertEquals(5, target.numIslands(new char[][]{
      {'1', '0', '1'},
      {'0', '1', '0'},
      {'1', '0', '1'}
    }));
  }
}
