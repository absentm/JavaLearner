package test13;

/**
 * JoinThreadTest
 * Created by dm on 16-8-27.
 */
public class JoinThreadTest extends Thread {
    public JoinThreadTest(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("this.getName(): " + this.getName() + " " + i);
        }
    }

    public static void test() {
        // launch the sub thread
        new JoinThreadTest("join thread").start();
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                JoinThreadTest joinThreadTest = new JoinThreadTest("by Joined thread");
                joinThreadTest.start();

                try {
                    // main thread call join(),
                    // main thread will wait for the joinThreadTest thread stop
                    joinThreadTest.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread.currentThread().getName() in test: " + Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
