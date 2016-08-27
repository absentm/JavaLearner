package test13;

/**
 * FirstThreadTest: FirstThreadTest class cann't share the source of thread
 * Created by dm on 16-8-27.
 */
public class FirstThreadTest extends Thread {
    private int i;

    /**
     * override run to get the thread name
     */
    public void run() {
        this.setName("FirstThreadTest");    // set the name of current thread
        for (; i < 10; i++) {
            System.out.println("this.getName(): " + this.getName() + " " + i);
        }
    }

    public static void test() {
        for (int i = 0; i < 20; i++) {
            // get the current thread
            System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName() + " " + i);

            if (i == 10) {
                // create first thread
                new FirstThreadTest().start();

                // create second thread
                new FirstThreadTest().start();
            }
        }
    }
}
