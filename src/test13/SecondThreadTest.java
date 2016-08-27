package test13;

/**
 * SecondThreadTest: implements Runnable
 * this class can share the source of thread
 * Created by dm on 16-8-27.
 */
public class SecondThreadTest implements Runnable {
    private int i;

    /**
     * override run to get the thread name
     */
    public void run() {
        for (; i < 10; i++) {
            System.out.println("Thread.currentThread().getName() in run: " + Thread.currentThread().getName() + " " + i);
        }
    }

    public static void test() {
        for (int i = 0; i < 20; i++) {
            // get the current thread
            System.out.println("Thread.currentThread().getName() in test: " + Thread.currentThread().getName() + " " + i);

            if (i == 10) {
                SecondThreadTest secondThreadTest = new SecondThreadTest();
                // create first thread
                new Thread(secondThreadTest, "second1").start();

                // create second thread
                new Thread(secondThreadTest, "second2").start();
            }
        }
    }
}