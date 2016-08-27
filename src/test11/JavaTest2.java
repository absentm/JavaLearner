package test11;

/**
 * JavaTest2
 * Doc-links: https://absentm.github.io/2016/08/27/%E5%85%B3%E4%BA%8E3%E5%B1%82for%E5%BE%AA%E7%8E%AF%E4%BC%98%E5%8C%96%E9%97%AE%E9%A2%98%E7%9A%84%E8%AE%A8%E8%AE%BA/
 * Created by dm on 16-8-25.
 */
public class JavaTest2 {
    private static long count = 0L;
    private static long startTime = System.currentTimeMillis();

    public static void test2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 1000; k++) {
                    function(i, j, k);
                }
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nJava Test2 count: " + count);
        System.out.println("\nJava test02 time: " + (endTime - startTime));
    }

    private static void function(int i, int j, int k) {
        ++count;
    }
}
