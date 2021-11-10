package com.examplehub.basics.thread;

import java.util.concurrent.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CallableExampleTest {

  @Test
  void testCallable() throws ExecutionException, InterruptedException {
    class ExampleCallable implements Callable<Integer> {

      @Override
      public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; ++i) {
          sum += i;
        }
        return sum;
      }
    }
    ExampleCallable exampleCallable = new ExampleCallable();
    FutureTask<Integer> futureTask = new FutureTask<>(exampleCallable);
    new Thread(futureTask).start();
    assertEquals(5050, futureTask.get());
  }

  @Test
  void testThreadPool() throws ExecutionException, InterruptedException {
    class ExampleCallable implements Callable<Integer> {

      @Override
      public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; ++i) {
          sum += i;
        }
        return sum;
      }
    }
    ExecutorService executorService = Executors.newFixedThreadPool(1);
    Future<Integer> result = executorService.submit(new ExampleCallable());
    int callableSum = result.get();
    Assertions.assertEquals(5050, callableSum);
    executorService.shutdown();
  }
}
