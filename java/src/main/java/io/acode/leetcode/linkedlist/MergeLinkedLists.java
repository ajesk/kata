package io.acode.leetcode.linkedlist;

import io.acode.leetcode.datastructures.linkedlist.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * <p>
 * I must add that it took me a while to understand the ListNode object that leetcode expects you to use.
 */
public class MergeLinkedLists {

  public int getLowest(ListNode[] lists) {
    Integer lowVal = null, index = 0;
    for (int i = 0; i < lists.length; i++) {
      if (lists[i] == null) continue;
      if (lowVal == null || lists[i].val < lowVal) {
        lowVal = lists[i].val;
        index = i;
      }
    }
    lists[index] = lists[index].next;
    return lowVal;
  }

  public ListNode comparison(ListNode[] lists) {
    ListNode outerNode = new ListNode(0), nextNode = outerNode;
    List<ListNode> list = Arrays.asList(lists);
    while (list.stream().anyMatch(e -> e != null)) {
      nextNode.next = new ListNode(getLowest(lists));
      nextNode = nextNode.next;
    }
    return outerNode.next;
  }

  public ListNode priorityQueue(ListNode[] lists) {
    List<ListNode> nodes = Arrays.asList(lists);

    PriorityQueue<ListNode> queue = new PriorityQueue<>(nodes.size(), new Comparator<ListNode>() {
      @Override
      public int compare(ListNode o1, ListNode o2) {
        if (o1.val < o2.val)
          return -1;
        else if (o1.val == o2.val)
          return 0;
        else
          return 1;
      }
    });

    ListNode solution = new ListNode(0);
    ListNode tail = solution;

    for (ListNode node : nodes) {
      if (node != null) {
        queue.add(node);
      }
    }

    while (!queue.isEmpty()) {
      tail.next = queue.poll();
      tail = tail.next;

      if (tail.next != null) {
        queue.add(tail.next);
      }
    }
    return solution.next;
  }
}
