package com.unmsm.sistemas.monolith.paymentservice.utils;

public class Util {
    public static void logger() throws InterruptedException {
        int n = (int) (Math.random() * (28 - 20) + 20);
        Thread.sleep(50 * n);
    }
}
