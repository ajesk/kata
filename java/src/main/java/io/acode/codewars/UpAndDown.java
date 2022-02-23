package io.acode.codewars;

import java.util.Locale;

public class UpAndDown {
  public static String arrange(String str) {
    String[] split = str.split(" ");
    if (split.length == 1) return str;

    for (int i = 0; i < split.length; i++) {
      if (i < split.length - 1) {
        if (
          (i % 2 == 0 && split[i].length() > split[i + 1].length()) ||
            (i % 2 != 0 && split[i].length() < split[i + 1].length())
        ) {
          String holder = split[i];
          split[i] = split[i + 1];
          split[i + 1] = holder;
        }
      }

      if (i % 2 == 0) {
        split[i] = split[i].toLowerCase(Locale.ROOT);
      } else {
        split[i] = split[i].toUpperCase(Locale.ROOT);
      }

    }
    return String.join(" ", split);
  }
}
