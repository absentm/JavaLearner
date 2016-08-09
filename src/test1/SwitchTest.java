package test1;

/**
 * SwitchTest.java
 * Created by AbsentM on 16-8-9.
 */
public class SwitchTest {
    /**
     * test1: automatch
     * @param value a int number
     */
    public static void switchTest1(int value) {
        switch (value) {
            case 1:
                System.out.println("I am in test1, here: " + value);
            case 2:
                System.out.println("I am in test1, here: " + value);
            case 3:
                System.out.println("I am in test1, here: " + value);
        }
    }

    /**
     * test2: automatch with default
     * if have not the break, it also will run in default
     * @param value a int number
     */
    public static void switchTest2(int value) {
        switch (value) {
            case 1:
                System.out.println("I am in test2, here: " + value);
            case 2:
                System.out.println("I am in test2, here: " + value);
            case 3:
                System.out.println("I am in test2, here: " + value);
            default:
                System.out.println("I am default test2: " + value);
        }
    }

    /**
     * test3: automatch with default and break
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest3(int value) {
        switch (value) {
            case 1:
                System.out.println("I am in test3, here: " + value);
                break;
            case 2:
                System.out.println("I am in test3, here: " + value);
                break;
            case 3:
                System.out.println("I am in test3, here: " + value);
                break;
            default:
                System.out.println("I am default test3: " + value);
        }
    }

    /**
     * test4: automatch with default in first line and break at end
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest4(int value) {
        switch (value) {
            default:
                System.out.println("I am default test4: " + value);
            case 1:
                System.out.println("I am in test4, here case1: " + value);
            case 2:
                System.out.println("I am in test4, here case2: " + value);
            case 3:
                System.out.println("I am in test4, here case3: " + value);
                break;
        }
    }

    /**
     * test5: automatch with default in first line and break at case2
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest5(int value) {
        switch (value) {
            default:
                System.out.println("I am default test5: " + value);
            case 1:
                System.out.println("I am in test5, here case1: " + value);
            case 2:
                System.out.println("I am in test5, here case2: " + value);
                break;
            case 3:
                System.out.println("I am in test5, here case3: " + value);
        }
    }

    /**
     * test6: automatch with default in first line and break at default
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest6(int value) {
        switch (value) {
            default:
                System.out.println("I am default test6: " + value);
                break;
            case 1:
                System.out.println("I am in test6, here case1: " + value);
            case 2:
                System.out.println("I am in test6, here case2: " + value);
            case 3:
                System.out.println("I am in test6, here case3: " + value);
        }
    }

    /*
     * =====================================================================
     * compare 4, 5 and 6, we can see: if put the default in the first line
     * the default statement cann't run, it run along the line end with the
     * first break statement and regardless of the "case" statement.
     *
     * so, suggest key in code which can be readable
     *=====================================================================*/

    /**
     * test7: automatch with String input
     * @param value a String value
     */
    public static void switchTest7(String value) {
        switch (value) {
            case "hello":
                System.out.println("I am in test6, here case1: " + value);
                break;
            case "yes":
                System.out.println("I am in test6, here case2: " + value);
                break;
            case "no":
               System.out.println("I am in test6, here case3: " + value);
                break;
            default:
                System.out.println("I am default test6: " + value);
                break;
        }
    }
}
