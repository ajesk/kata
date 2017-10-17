package io.acode.kata;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    int moves = 0;
    int currentWeight = 0, totalPeople = 0, max, capacity;
    List<Integer> targetFloors = new ArrayList<>();

    boolean isFull(int additionalWeight) {
        return currentWeight + additionalWeight >= max || totalPeople + 1 >= capacity;
    }

    void addRider(int weight, int floor) {
        currentWeight += weight;
        targetFloors.add(floor);
    }

    int getFloors() {
        int numOfDifferentVals = 0;

        ArrayList<Integer> uniqueFloors = new ArrayList<>();

        for(int i = 0; i < targetFloors.size(); i++) {
            if(!uniqueFloors.contains(targetFloors.get(i))){
                uniqueFloors.add(targetFloors.get(i));
            }
        }
        if(uniqueFloors.size()==1) {
            numOfDifferentVals = 0;
        } else {
            numOfDifferentVals = uniqueFloors.size();
        }

        return numOfDifferentVals;
    }

    long sendElevator() {
        long totalFloors = getFloors() + 1;
        currentWeight = 0;
        totalPeople = 0;
        targetFloors.clear();
        return totalFloors;
    }

    public int solution(int[] weights, int[] targetFloors, int floors, int maxWeight, int capacity) {
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
