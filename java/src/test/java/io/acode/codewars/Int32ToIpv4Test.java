package io.acode.codewars;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Int32ToIpv4Test {

  static Map<Long, String> ipMapping;

  static {
    ipMapping = new HashMap<>();
    ipMapping.put(2154959208L, "128.114.17.104"); }

//  2146689
//  16641
  @Test
  public void testIpMapping() {
    ipMapping.forEach((key, value) -> assertEquals(value, Int32ToIpv4.longToIP(key)));
  }
}