package main_test;

import test13.JoinThreadTest;

/**
 * main_test.Hello test
 * Created by AbsentM on 16-8-7.
 */
public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
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
//        // input: hello; output:I am in test06, here case1: hello
//        Scanner strInput = new Scanner(System.in);
//        String strValue = strInput.nextLine();
//        SwitchTest.switchTest7(strValue);

//        System.out.println("float test: ");
//        FloatDivisionTest.floatTest();

//        System.out.println("Arrays test: ");
//        ArraysTest.arraysTest();

//        System.out.println("Type test: ");
//        TypeChangeTest.typeTest();

//        System.out.println("Singleton test: ");
//        SingletonTest.test();

//        System.out.println("abstract test: ");
//        Shape shape1 = new Triangle("red", 3, 4, 5);
//        Shape shape2 = new Circle("Yellow", 2.2);
//        System.out.println(shape1.getShapeType());
//        System.out.println(shape1.calPerimeter());
//        System.out.println(shape2.getShapeType());
//        System.out.println(shape2.calPerimeter());

//        System.out.println("anonymous test: ");
//        AnonymousClassTest.Anonymoustest1();
//        AnonymousTest.Anonymoustest2();

//        System.out.println("callback test: ");
//        TeaProgrammer.test();

//        System.out.println("collection test: ");
//        CollectionTest.test();
//        CollectionTest.iteratorTest();
//        TreeSetTest.test();
//        TreeSetTest.treeSetAddObjTest();
//        TreeSetTest.defineSortedTest();

//        System.out.println("Lunar test: ");
//        LunarCalendarTest.lunarTest();

//        System.out.println("three-fold foreach test: ");
//        JavaTest1.test1();
//        JavaTest2.test2();

//        System.out.println("Annotation test: ");
//        // please add package name first in process()
//        ProcessorTest.process("test12.MethodCollection");

        System.out.println("Thread test: ");
//        FirstThreadTest.test();
//        SecondThreadTest.test();
//        ThirdThreadTest.test();
        JoinThreadTest.test();
    }
}
