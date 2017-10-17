package io.acode.kata;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int moves = 0;
    private int currentWeight = 0, totalPeople = 0, max, capacity;
    private List<Integer> targetFloors = new ArrayList<>();

    private boolean isFull(int additionalWeight) {
        return currentWeight + additionalWeight >= max || totalPeople == capacity;
    }

    private void addRider(int weight, int floor) {
        currentWeight += weight;
        totalPeople++;
        targetFloors.add(floor);
    }

    private int getFloors() {
        ArrayList<Integer> uniqueFloors = new ArrayList<>();

        for (Integer floor: targetFloors) {
            if (!uniqueFloors.contains(floor)) {
                uniqueFloors.add(floor);
            }
        }
        return uniqueFloors.size();
    }

    private long sendElevator() {
        long totalFloors = getFloors() + 1;
        currentWeight = 0;
        totalPeople = 0;
        targetFloors.clear();
        return totalFloors;
    }

    public int solution(int[] weights, int[] targetFloors, int floors, int capacity, int maxWeight) {
        this.max = maxWeight;
        this.capacity = capacity;

        for (int i = 0; i < weights.length; i++) {
            if (isFull(weights[i])) {
                moves += sendElevator();
            }
            addRider(weights[i], targetFloors[i]);
        }
        return moves += sendElevator();
    }
}
