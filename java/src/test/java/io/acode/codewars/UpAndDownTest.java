package io.acode.codewars;

import org.junit.Test;

import static io.acode.codewars.UpAndDown.arrange;
import static org.junit.Assert.assertEquals;

public class UpAndDownTest {
  @Test
  public void testBase() {
    assertEquals("i", arrange("i"));
  }

  @Test
  public void test2Strings() {
    assertEquals("i AM", arrange("i am"));
    assertEquals("i AM", arrange("am I"));
  }

  @Test
  public void test3Strings() {
    assertEquals("i SWEET pie", arrange("i sweet pie"));
    assertEquals("i SWEET pie", arrange("i pie sweet"));
    assertEquals("i SWEET pie", arrange("sweet I pie"));
  }

  private static void testing(String actual, String expected) {
    assertEquals(expected, actual);
  }

  @Test
  public void test() {
    System.out.println("Fixed Tests arrange");

    testing(UpAndDown.arrange("who hit retaining The That a we taken"),
      "who RETAINING hit THAT a THE we TAKEN"); // 3
    testing(UpAndDown.arrange("on I came up were so grandmothers"),
      "i CAME on WERE up GRANDMOTHERS so"); // 4
    testing(UpAndDown.arrange("way the my wall them him"),
      "way THE my WALL him THEM"); // 1
    testing(UpAndDown.arrange("turn know great-aunts aunt look A to back"),
      "turn GREAT-AUNTS know AUNT a LOOK to BACK"); // 2

  }
}
