package test5;

/**
 * SingletonTest
 * Created by AbsentM on 16-8-10.
 */
public class SingletonTest {
    // use a var to buffer the created instance
    private static SingletonTest instance;

    // use private to hide class's constructor
    private SingletonTest() {
    }

    // ensure only create one instance
    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }

        return instance;
    }

    /**
     * test singleton
     */
    public static void test() {
        SingletonTest testInstance1 = SingletonTest.getInstance();
        SingletonTest testInstance2 = SingletonTest.getInstance();

        System.out.println("testInstance1 = testInstance2 ? : " +
                (testInstance1 == testInstance2));
    }
}
