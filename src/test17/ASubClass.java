package test17;

/**
 * ASubClass
 * Created by dm on 16-10-16.
 */
public class ASubClass extends AParentClass {
    int x = 30;

    public static void MulSisTest() {
        AParentClass aParentClass = new ASubClass();
        ASubClass aSubClass = new ASubClass();
        System.out.println("aParentClass.x + aSubClass.x = " + (aParentClass.x + aSubClass.x));
    }
}
