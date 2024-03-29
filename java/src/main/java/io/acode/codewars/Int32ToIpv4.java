package io.acode.codewars;

public class Int32ToIpv4 {
  public static String longToIP(long ip) {
    return String.format("%d.%d.%d.%d", ip >>> 24, (ip >> 16) & 0xff, (ip >> 8) & 0xff, ip & 0xff);
  }
}