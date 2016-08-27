package test12;

/**
 * MethodCollection: AnnotationTestable
 * Created by dm on 16-8-26.
 */
public class MethodCollection {
    @AnnotationTestable
    public static void m1() {
    }

    public static void m2() {
    }

    @AnnotationTestable
    public static void m3() {
        throw new IllegalArgumentException("Argument error!");
    }

    public static void m4() {
    }

    @AnnotationTestable
    public static void m5() {
    }

    public static void m6() {
    }

    @AnnotationTestable
    public static void m7() {
        throw new RuntimeException("program task exception!");
    }

    public static void m8() {
    }
}
