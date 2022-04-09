package io.acode.leetcode;

import io.acode.leetcode.datastructures.ListNode;
import io.acode.util.TestUtils;
import org.junit.Before;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class MergeLinkedListsTest extends TestUtils {
    private ListNode node1;
    private ListNode node2;
    private ListNode node3;

    private MergeLinkedLists mll = new MergeLinkedLists();

    @Before
    public void setUp() {
        node1 = new ListNode(1, 4, 7, 9);
        node2 = new ListNode(3, 5, 8, 12);
        node3 = new ListNode(2, 2, 2);
    }

    @Test
    public void getLowest() {
        assertThat(mll.getLowest(new ListNode[]{node1, node2})).isEqualTo(1);
        assertThat(mll.getLowest(new ListNode[]{node3, node2})).isEqualTo(2);
        assertThat(mll.getLowest(new ListNode[]{node2, node1})).isEqualTo(1);
    }

    @Test
    public void testTwoListsComparison() {
        assertThat(mll.comparison(new ListNode[]{node1, node2}).toString())
            .isEqualTo(new ListNode(1, 3, 4, 5, 7, 8, 9, 12).toString());
    }

    @Test
    public void testThreeListsComparison() {
        assertThat(mll.comparison(new ListNode[]{node1, node2, node3}).toString())
                .isEqualTo(new ListNode(1, 2, 2, 2, 3, 4, 5, 7, 8, 9, 12).toString());
    }

    @Test
    public void testTwoListsPriority() {
        assertThat(mll.priorityQueue(new ListNode[]{node1, node2}).toString())
                .isEqualTo(new ListNode(1, 3, 4, 5, 7, 8, 9, 12).toString());
    }

    @Test
    public void testThreeListsPriority() {
        assertThat(mll.priorityQueue(new ListNode[]{node1, node2, node3}).toString())
                .isEqualTo(new ListNode(1, 2, 2, 2, 3, 4, 5, 7, 8, 9, 12).toString());
    }
}
