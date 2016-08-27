package test12;

import java.lang.reflect.Method;

/**
 * ProcessorTest: AnnotationTestable and MethodCollection
 * Created by dm on 16-8-26.
 */
public class ProcessorTest {
    public static void process(String className) throws ClassNotFoundException {
        int passed = 0; // pass test count
        int failed = 0; // test failed count

        // visit all the method of className class
        for (Method method : Class.forName(className).getMethods()) {
            // if use the AnnotationTestable annotation
            if (method.isAnnotationPresent(AnnotationTestable.class)) {
                try {
                    method.invoke(null);
                    passed++;
                } catch (Exception e) {
                    System.out.println("The mothed: " + method + "run failed! and " +
                            "exception show: " + e.getCause());

                    // add failed
                    failed++;
                }
            }
        }

        // sum
        System.out.println("Total number of test motheds: " + (passed + failed));
        System.out.println("Passed: " + passed);
        System.out.println("failed: " + failed);

    }
}
