package io.acode.leetcode.trees;

import io.acode.leetcode.datastructures.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SerializeAndDeserializeTest {
  SerializeAndDeserialize target = new SerializeAndDeserialize();

  @Test
  public void testBasic() {
    assertEquals("#", target.serialize(null));
    assertEquals("1,#,#", target.serialize(new TreeNode(1)));
  }

  @Test
  public void testSmallTree() {
    assertEquals("1,2,#,#,#", target.serialize(new TreeNode(1, new TreeNode(2), null)));
  }

  @Test
  public void testLeetSerialize() {
    TreeNode test = new TreeNode(1,
      new TreeNode(2),
      new TreeNode(3,
        new TreeNode(4),
        new TreeNode(5)));
    assertEquals("1,2,#,#,3,4,#,#,5,#,#", target.serialize(test));
  }

  @Test
  public void basicDeserialize() {
    assertNull(target.deserialize("#"));
    assertEquals(new TreeNode(1), target.deserialize("1,#,#"));
  }

  @Test
  public void smallTreeDeserialize() {
    assertEquals(target.deserialize("1,2,#,#,#"), new TreeNode(1, new TreeNode(2), null));
  }

  @Test
  public void serializeDeserialize() {
    TreeNode test = new TreeNode(1,
      new TreeNode(2),
      new TreeNode(3,
        new TreeNode(4),
        new TreeNode(5)));
    TreeNode result = target.deserialize(target.serialize(test));
    assertEquals(test, result);
  }

  @Test
  public void leetFail() {
    String deserializeThis = "4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2";


  }
}
