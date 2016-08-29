package test15.ProxyTest;

/**
 * HelloSpeaker
 * Created by dm on 16-8-29.
 */
public class HelloSpeaker implements SayHello {
    @Override
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }
}
