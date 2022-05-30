package io.acode.codewars;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryArrayToIntTest {
  @Test
  public void basicTest() {
    assertEquals(1, BinaryArrayToInt.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
    assertEquals(15, BinaryArrayToInt.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
    assertEquals(6, BinaryArrayToInt.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
    assertEquals(9, BinaryArrayToInt.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));

  }
}
