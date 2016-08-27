package test04;

/**
 * TypeChangeTest
 * Created by AbsentM on 16-8-10.
 */
public class TypeChangeTest {
    public static void typeTest() {

        // primary type to wrapperClass
        int intNum = 15;
        Integer intObj = new Integer(intNum);
        System.out.println("intNum = " + intNum);
        System.out.println("intObj = " + intObj);

        // wrapperClass to primary type
        int intObjValue = intObj.intValue();
        System.out.println("intObjValue = " + intObjValue);

        // primary type to String
        int number = 11;
        String string = String.valueOf(number);
        System.out.println("number = " + number);
        System.out.println("string = " + string);

        // String to primary type
        String str = "123";
        int str2Value = Integer.parseInt(str);
        System.out.println("str = " + str);
        System.out.println("str2Value = " + str2Value);
    }
}
