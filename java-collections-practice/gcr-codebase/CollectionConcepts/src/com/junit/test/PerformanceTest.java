package com.junit.test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceTest {

    @Test
    @Timeout(2)
    void testLongRunningTask() throws InterruptedException {
        Thread.sleep(3000); // test will fail
    }
}
