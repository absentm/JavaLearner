package test13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ThirdThreadTest: use callable and Future
 * Created by dm on 16-8-27.
 */
public class ThirdThreadTest {
    public static void test() {
        FutureTask<Integer> integerFutureTask = new FutureTask<Integer>
                ((Callable<Integer>) () -> {
                    int i = 0;
                    for (; i < 10; i++) {
                        System.out.println("Thread.currentThread().getName() in test: " +
                                Thread.currentThread().getName() + " " + i);
                    }
                    return i;
                });

        for (int i = 0; i < 20; i++) {
            System.out.println("Thread.currentThread().getName() in test: " +
                    Thread.currentThread().getName() + " " + i);
            if (i == 10) {
                new Thread(integerFutureTask, "have return value thread: ").start();
            }
        }

        try {
            System.out.println("Sub thread returnValue: " + integerFutureTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
