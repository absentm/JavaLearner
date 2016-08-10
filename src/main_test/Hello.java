package main_test;

import test5.SingletonTest;

/**
 * main_test.Hello test
 * Created by AbsentM on 16-8-7.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");

//        System.out.println("switch test begin");
//        System.out.println("Please input number 1 or 2 or 3:");
//
//        // get the input from keyboard
//        Scanner input = new Scanner(System.in);
//        int inputValue1 = input.nextInt();

        // test case, value: 3 and 4
//        SwitchTest.switchTest1(inputValue1);
//        SwitchTest.switchTest2(inputValue1);
//        SwitchTest.switchTest3(inputValue1);
//        SwitchTest.switchTest4(inputValue1);
//        SwitchTest.switchTest5(inputValue1);
//        SwitchTest.switchTest6(inputValue1);
//
//        // we can get switch accept "String" type
//        // input: hello; output:I am in test6, here case1: hello
//        Scanner strInput = new Scanner(System.in);
//        String strValue = strInput.nextLine();
//        SwitchTest.switchTest7(strValue);

//        System.out.println("float test: ");
//        FloatDivisionTest.floatTest();

//        System.out.println("Arrays test: ");
//        ArraysTest.arraysTest();

//        System.out.println("Type test: ");
//        TypeChangeTest.typeTest();

        System.out.println("Singleton test: ");
        SingletonTest.test();

    }
}
