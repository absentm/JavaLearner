package test18;

/**
 * OneSubClass
 * Created by dm on 16-10-31.
 */
public class OneSubClass {
    public OneSubClass(String name) {
        System.out.println(3);
        new OneParent(name + "1");
    }

    public OneSubClass() {
        System.out.println(4);
    }
}
