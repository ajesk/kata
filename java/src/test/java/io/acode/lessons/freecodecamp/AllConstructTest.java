package io.acode.lessons.freecodecamp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllConstructTest {
  AllConstruct target = new AllConstruct();

  public boolean listEquals(List<String> l1, List<String> l2) {
    return l1.size() == l2.size() && l1.containsAll(l2);
  }


  @Test
  void testBasic() {
    assertTrue(target.allConstruct("hello", new String[]{"cat", "dog"}).isEmpty());
    assertEquals(List.of(List.of("cat")), target.allConstruct("cat", new String[]{"cat", "dog"}));
  }

  @Test
  void testMoreOptions() {
     List<List<String>> result = target.allConstruct("catdog", new String[]{"cat", "dog", "ca", "tdog"});

     assertEquals(2, result.size());
     assertTrue(listEquals(List.of("cat", "dog"), result.get(0)));
     assertTrue(listEquals(List.of("ca", "tdog"), result.get(1)));
  }

  @Test
  void testLessonExample() {
     List<List<String>> result = target.allConstruct("abcdef", new String[]{"ab", "cd", "abc", "abcd", "c", "ef", "def"});

     assertEquals(4, result.size());
  }

  @Test
  void testLargeAndInCharge() {
    assertTrue(target.allConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
      new String[]{
        "e",
        "ee",
        "eee",
        "eeee",
        "eeeee",
        "eeeeee",
        "eeeeeee",
        "eeeeeeee",
        "eeeeeeeee",
        "eeeeeeeeee"
      }).isEmpty());
  }
}
