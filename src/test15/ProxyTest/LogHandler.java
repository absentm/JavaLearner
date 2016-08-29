package test15.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * LogHandler
 * Created by dm on 16-8-29.
 */
public class LogHandler implements InvocationHandler {
    private Logger mLogger = Logger.getLogger(this.getClass().getName());
    private Object delegate;

    /**
     * bind to where to delegate
     *
     * @param delegate
     * @return
     */
    public Object bind(Object delegate) {
        this.delegate = delegate;

        return Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            mLogger.log(Level.INFO, "methed starts..." + method.getName());
            result = method.invoke(delegate, args);
            mLogger.log(Level.INFO, "methed ends..." + method.getName());
        } catch (Exception e) {
            mLogger.log(Level.INFO, e.toString());
        }

        return result;
    }
}
