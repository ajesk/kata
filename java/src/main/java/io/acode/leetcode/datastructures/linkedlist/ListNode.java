package io.acode.leetcode.datastructures.linkedlist;

import java.util.Arrays;

public class ListNode {
    public int val = 0;
    public ListNode next;
    public ListNode(int x) { val = x; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    public ListNode(int... nodeVals) {
        if (nodeVals.length > 0) val = nodeVals[0];
        if (nodeVals.length > 1) next = new ListNode(Arrays.copyOfRange(nodeVals, 1, nodeVals.length));
    }

    @Override
    public String toString() {
        return val + "," + next;
    }
}
