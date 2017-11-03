package io.acode.util;

public class TestUtils {
    private long startTime;

    protected void start() {
        startTime = System.nanoTime();
    }

    protected void stop() {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + (System.nanoTime() - startTime) + "ns");
    }

    protected void tprint(String line) {
        System.out.println(line);
    }
}
