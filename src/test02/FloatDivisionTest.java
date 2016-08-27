package test02;

/**
 * FloatDivisionTest
 * Created by AbsentM on 16-8-9.
 */
public class FloatDivisionTest {
    public static void floatTest() {
        System.out.println("19 / 4 = " + 19 / 4);
        System.out.println("19.0 / 4 = " + 19.0 / 4);
        System.out.println("19 / 4.0 = " + 19 / 4.0);
        System.out.println("19.0 / 4.0 = " + 19.0 / 4.0);

        // can get the
        // 19 / 0.0 = Infinity
        // -19 / 0.0 = -Infinity
        System.out.println("19 / 0.0 = " + 19 / 0.0);
        System.out.println("-19 / 0.0 = " + -19 / 0.0);

        // not allowed
        // System.out.println("19 / 0 = " + 19 / 0);

        System.out.println("19 % 4 = " + 19 % 4);

        // get the float value
        System.out.println("19 % 4.0 = " + 19 % 4.0);
        // get NaN
        System.out.println("19 % 0.0 = " + 19 % 0.0);
    }
}
