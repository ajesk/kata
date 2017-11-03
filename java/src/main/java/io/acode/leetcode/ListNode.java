package io.acode.leetcode;

import java.util.Arrays;

class ListNode {
    int val = 0;
    ListNode next;
    ListNode(int x) { val = x; }

    ListNode(int... nodeVals) {
        if (nodeVals.length > 0) val = nodeVals[0];
        if (nodeVals.length > 1) next = new ListNode(Arrays.copyOfRange(nodeVals, 1, nodeVals.length));
    }

    @Override
    public String toString() {
        if (next != null) return val + ", " + next.toString();
        return val + "";
    }
}
