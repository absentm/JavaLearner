package test01;

/**
 * SwitchTest.java
 * Created by AbsentM on 16-8-9.
 */
public class SwitchTest {
    /**
     * test01: automatch
     * @param value a int number
     */
    public static void switchTest1(int value) {
        switch (value) {
            case 1:
                System.out.println("I am in test01, here: " + value);
            case 2:
                System.out.println("I am in test01, here: " + value);
            case 3:
                System.out.println("I am in test01, here: " + value);
        }
    }

    /**
     * test02: automatch with default
     * if have not the break, it also will run in default
     * @param value a int number
     */
    public static void switchTest2(int value) {
        switch (value) {
            case 1:
                System.out.println("I am in test02, here: " + value);
            case 2:
                System.out.println("I am in test02, here: " + value);
            case 3:
                System.out.println("I am in test02, here: " + value);
            default:
                System.out.println("I am default test02: " + value);
        }
    }

    /**
     * test03: automatch with default and break
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest3(int value) {
        switch (value) {
            case 1:
                System.out.println("I am in test03, here: " + value);
                break;
            case 2:
                System.out.println("I am in test03, here: " + value);
                break;
            case 3:
                System.out.println("I am in test03, here: " + value);
                break;
            default:
                System.out.println("I am default test03: " + value);
        }
    }

    /**
     * test04: automatch with default in first line and break at end
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest4(int value) {
        switch (value) {
            default:
                System.out.println("I am default test04: " + value);
            case 1:
                System.out.println("I am in test04, here case1: " + value);
            case 2:
                System.out.println("I am in test04, here case2: " + value);
            case 3:
                System.out.println("I am in test04, here case3: " + value);
                break;
        }
    }

    /**
     * test05: automatch with default in first line and break at case2
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest5(int value) {
        switch (value) {
            default:
                System.out.println("I am default test05: " + value);
            case 1:
                System.out.println("I am in test05, here case1: " + value);
            case 2:
                System.out.println("I am in test05, here case2: " + value);
                break;
            case 3:
                System.out.println("I am in test05, here case3: " + value);
        }
    }

    /**
     * test06: automatch with default in first line and break at default
     * if with break, it also will run end with break
     * @param value a int number
     */
    public static void switchTest6(int value) {
        switch (value) {
            default:
                System.out.println("I am default test06: " + value);
                break;
            case 1:
                System.out.println("I am in test06, here case1: " + value);
            case 2:
                System.out.println("I am in test06, here case2: " + value);
            case 3:
                System.out.println("I am in test06, here case3: " + value);
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
     * test07: automatch with String input
     * @param value a String value
     */
    public static void switchTest7(String value) {
        switch (value) {
            case "hello":
                System.out.println("I am in test06, here case1: " + value);
                break;
            case "yes":
                System.out.println("I am in test06, here case2: " + value);
                break;
            case "no":
               System.out.println("I am in test06, here case3: " + value);
                break;
            default:
                System.out.println("I am default test06: " + value);
                break;
        }
    }
}
