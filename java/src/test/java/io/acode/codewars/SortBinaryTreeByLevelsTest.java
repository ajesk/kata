package io.acode.codewars;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static io.acode.codewars.SortBinaryTreeByLevels.reset;
import static io.acode.codewars.SortBinaryTreeByLevels.treeByLevels;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;

public class SortBinaryTreeByLevelsTest {
  @Before
  public void setUp() throws Exception {
    reset();
  }

  @Test
  public void testBasic() {
    assertEquals(emptyList(), treeByLevels(null));
  }

  @Test
  public void shouldReturnJustTheCurrentNodeValue() {
    assertEquals(List.of(1), treeByLevels(new Node(null, null, 1)));
  }

  @Test
  public void shouldReturnTheCurrentNodePlusTheNextLeftNode() {
    assertEquals(List.of(1, 2), treeByLevels(new Node(new Node(null, null, 2), null, 1)));
  }

  @Test
  public void shouldReturnTheCurrentNodePlusTheNextRightNode() {
    assertEquals(List.of(1, 3), treeByLevels(new Node(null, new Node(null, null, 3), 1)));
  }

  @Test
  public void shouldReturnTheCurrentLeftRightInThatOrder() {
    assertEquals(List.of(1, 2, 3), treeByLevels(new Node(new Node(null, null, 2), new Node(null, null, 3), 1)));
  }

  @Test
  public void shouldReturnTheSecondLevelRightBeforeTheThirdLevelLeft() {
    assertEquals(List.of(1, 2, 3, 4),
      treeByLevels(
        new Node(
          new Node(
            new Node(null, null, 4),
            null,
            2),
          new Node(null, null, 3),
          1
        )
      )
    );
  }
}
