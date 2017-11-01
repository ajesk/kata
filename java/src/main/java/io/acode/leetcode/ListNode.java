package io.acode.leetcode;

import java.util.Arrays;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    ListNode(int... nodeVals) {
        val = nodeVals[0];
        next = new ListNode(Arrays.copyOfRange(nodeVals, 1, nodeVals.length - 1));
    }
}
