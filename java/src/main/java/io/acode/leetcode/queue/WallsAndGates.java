package io.acode.leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates {

  public void wallsAndGates(int[][] rooms) {
    int maxY = rooms.length - 1;
    int maxX = rooms[0].length - 1;
    Queue<Cell> cellsToExplore = new LinkedList<>();
    for (int y = 0; y < maxY + 1; y++) {
      for (int x = 0; x < maxX + 1; x++) {
        if (rooms[y][x] == 0) cellsToExplore.add(new Cell(y, x, 0));
      }
    }

    while (!cellsToExplore.isEmpty()) {
      Cell cell = cellsToExplore.poll();

      rooms[cell.y][cell.x] = Math.min(cell.distance, rooms[cell.y][cell.x]);

      if (cell.x != 0) {
        int left = rooms[cell.y][cell.x - 1];
        if (left != -1 && left > cell.distance + 1) {
          cellsToExplore.add(new Cell(cell.y, cell.x - 1, cell.distance + 1));
        }
      }
      if (cell.x != maxX) {
        int right = rooms[cell.y][cell.x + 1];
        if (right != -1 && right > cell.distance + 1) {
          cellsToExplore.add(new Cell(cell.y, cell.x + 1, cell.distance + 1));
        }
      }
      if (cell.y != 0) {
        int up = rooms[cell.y - 1][cell.x];
        if (up != -1 && up > cell.distance + 1) {
          cellsToExplore.add(new Cell(cell.y - 1, cell.x, cell.distance + 1));
        }
      }
      if (cell.y != maxY) {
        int down = rooms[cell.y + 1][cell.x];
        if (down != -1 && down > cell.distance + 1) {
          cellsToExplore.add(new Cell(cell.y + 1, cell.x, cell.distance + 1));
        }
      }
    }
  }

  private class Cell {
    int y;
    int x;
    int distance;

    public Cell(int y, int x, int distance) {
      this.y = y;
      this.x = x;
      this.distance = distance;
    }
  }
}
