package com.examplehub.basics.thread;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableExampleTest {
    @Test
    void test() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> result = executorService.submit(new CallableExample());
        int callableSum = result.get();
        Assertions.assertEquals(5050, callableSum);
        executorService.shutdown();
    }
}