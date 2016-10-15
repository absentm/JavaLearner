package test16;

/**
 * InitSequence:
 * java 静态变量,静态初始化块,普通变量,普通初始化块,子父类构造器的初始化顺序
 * Created by dm on 16-10-15.
 */
public class InitSequence {
    // 静态变量
    public static String staticField = "静态变量";

    // 变量
    public String field = "变量";

    // 静态初始化块
    static {
        System.out.println(staticField);
        System.out.println("静态初始化块");
    }

    // 初始化块
    {
        System.out.println(field);
        System.out.println("初始化块");
    }

    // 构造器
    public InitSequence() {
        System.out.println("构造器");
    }

    public static void InitSequenceTest() {
        new InitSequence();
    }

}
