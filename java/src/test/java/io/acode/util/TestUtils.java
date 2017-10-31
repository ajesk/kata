package io.acode.util;

public class TestUtils {
    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + (System.nanoTime() - startTime) + "ns");
    }
}
