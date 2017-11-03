package io.acode.leetcode;

import io.acode.util.TestUtils;
import org.junit.Before;
import org.junit.Test;
import static com.google.common.truth.Truth.assertThat;

public class ReverseNodesInGroupsTest extends TestUtils {

    private ListNode node1;

    private ReverveNodesInGroups rnig = new ReverveNodesInGroups();

    @Before
    public void setUp() {
        node1 = new ListNode(1, 2, 3, 4, 5);
    }

    @Test
    public void testGivenExamples() {
        assertThat(rnig.reverseKGroup(node1, 2).toString())
                .isEqualTo(new ListNode(2, 1, 4, 3, 5).toString());
        assertThat(rnig.reverseKGroup(node1, 3).toString())
                .isEqualTo(new ListNode(3, 2, 1, 4, 5).toString());
        assertThat(rnig.reverseKGroup(node1, 5).toString())
                .isEqualTo(new ListNode(5, 4, 3, 2, 1).toString());
    }
}
