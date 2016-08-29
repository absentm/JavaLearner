package test15.baseTest;

import test15.ProxyTest.HelloSpeaker;
import test15.ProxyTest.LogHandler;
import test15.ProxyTest.SayHello;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ReflectionTest
 * Created by dm on 16-8-29.
 */
public class ReflectionTest {
    public static void basicTest1() {
        String name = "hello";
        Class strClass = name.getClass();

        System.out.println("class name: " + strClass.getName());
        System.out.println("isInterface: " + strClass.isInterface());
        System.out.println("isBaseType: " + strClass.isPrimitive());
        System.out.println("isArray: + " + strClass.isArray());
        System.out.println("parent name: " + strClass.getSuperclass().getName());
    }

    public static void basicTest2() {
        System.out.println("boolean.class: " + boolean.class);
        System.out.println("void.class: " + void.class);

        int[] iarr = new int[10];
        System.out.println("iarr.getClass().toString(): " + iarr.getClass().toString());

        double[] darr = new double[10];
        System.out.println("darr.getClass().toString(): " + darr.getClass().toString());
    }

    public static void forNameDemo() {
        System.out.println("please input class name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        try {
            Class c = Class.forName(input);
            System.out.println("class name: " + c.getName());
            System.out.println("isInterface: " + c.isInterface());
            System.out.println("isBaseType: " + c.isPrimitive());
            System.out.println("isArray: + " + c.isArray());
            System.out.println("parent name: " + c.getSuperclass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void simpleClassViewer() {
        // java.util.ArrayList
        System.out.println("please input class name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        try {
            Class c = Class.forName(input);
            Package p = c.getPackage();

            // get the package name
            System.out.println("package: " + p.getName());

            // get the basic info of class
            int m = c.getModifiers();
            System.out.print("Modifier.toString(m): " + Modifier.toString(m));
            if (Modifier.isInterface(m)) {
                System.out.print("Modifier.isInterface(m) is interface.");
            } else {
                System.out.print("Modifier.isInterface(m) is class.");
            }

            // get detail infos
            System.out.println(c.getName() + ": {");
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                // get the Modifier : public or protected or private
                System.out.print("\t" + Modifier.toString(field.getModifiers()));

                // show the type of field
                System.out.print(" " + field.getType().getName() + " ");

                // get the member name
                System.out.println(field.getName() + ";");
            }

            // get the constructor
            Constructor[] constructors = c.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // get the Modifier : public or protected or private
                System.out.print("\t" + Modifier.toString(constructor.getModifiers()));

                // get the constructor name
                System.out.println(" " + constructor.getName() + "();");
            }

            // get Method of class
            Method[] methods = c.getMethods();
            for (Method method : methods) {
                // get the Modifier : public or protected or private
                System.out.print("\t" + Modifier.toString(method.getModifiers()));

                // get the return type of method
                System.out.print(" " + method.getReturnType().getName() + " ");

                // show the name of method
                System.out.println(method.getName() + "();");
            }

            System.out.println("}");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void classLoaderDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input class path: ");
        String inputPath = scanner.next();
        System.out.println("please input class name: ");
        String inputClass = scanner.next();

        try {
            URL url1 = new URL(inputPath);
            ClassLoader classLoader1 = new URLClassLoader(new URL[]{url1});
            Class c1 = classLoader1.loadClass(inputClass);
            System.out.println("c1: " + c1);

            URL url2 = new URL(inputPath);
            ClassLoader classLoader2 = new URLClassLoader(new URL[]{url1});
            Class c2 = classLoader1.loadClass(inputClass);
            System.out.println("c2: " + c2);

            System.out.println("c1 is same to c2 ? : " + (c1 == c2));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void commandUtilsDemo() throws Exception {
        System.out.println("please input class name: ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();

        Map<String, String> request = new HashMap<>();
        request.put("name", "zhangsan");
        request.put("score", "99");
        Object object = CommandUtils.getCommand(request, className);
        System.out.println("object: " + object);
    }

    public static void ProxyDemo() {
        LogHandler handler = new LogHandler();
        SayHello speaker = new HelloSpeaker();

        // delegate speaker
        SayHello speakerProxy = (SayHello) handler.bind(speaker);
        speakerProxy.hello("AbsentM");
    }

}
