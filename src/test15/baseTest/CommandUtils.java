package test15.baseTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * CommandUtils
 * Created by dm on 16-8-29.
 */
public class CommandUtils {
    /**
     * give the Map object to produce Bean class
     *
     * @param requestMap   map
     * @param commandClass class name
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Object getCommand(Map requestMap, String commandClass)
            throws Exception {
        Class c = Class.forName(commandClass);
        Object o = c.newInstance();

        return updateCommand(requestMap, o);
    }

    /**
     * use reflect to auto find update properties
     *
     * @param requestMap
     * @param command
     * @return
     */
    public static Object updateCommand(Map requestMap, Object command)
            throws InvocationTargetException, IllegalAccessException {

        Method[] methods = command.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            // find startwith "set" method ignore private or protected
            if (!Modifier.isPrivate(methods[i].getModifiers()) &&
                    !Modifier.isProtected(methods[i].getModifiers()) &&
                    methods[i].getName().startsWith("set")) {
                String name = methods[i].getName().substring(3).toLowerCase();

                // if setter method name is same to map values
                // invoke setter method and set values
                if (requestMap.containsKey(name)) {
                    String param = (String) requestMap.get(name);
                    Object[] values = findoutParamValues(param, methods[i]);
                    methods[i].invoke(command, values);
                }
            }
        }

        return command;
    }

    /**
     * transfer to type value
     *
     * @param paramStr String
     * @param method   Method
     * @return
     */
    private static Object[] findoutParamValues(String paramStr, Method method) {
        Class[] params = method.getParameterTypes();
        Object[] objs = new Object[params.length];

        for (int i = 0; i < params.length; i++) {
            if (params[i] == String.class) {
                objs[i] = paramStr;
            } else if (params[i] == Short.TYPE) {
                short number = Short.parseShort(paramStr);
                objs[i] = new Short(number);
            } else if (params[i] == Integer.TYPE) {
                int number = Integer.parseInt(paramStr);
                objs[i] = new Integer(number);
            } else if (params[i] == Long.TYPE) {
                long number = Long.parseLong(paramStr);
                objs[i] = new Long(number);
            } else if (params[i] == Float.TYPE) {
                float number = Float.parseFloat(paramStr);
                objs[i] = new Float(number);
            } else if (params[i] == Double.TYPE) {
                double number = Double.parseDouble(paramStr);
                objs[i] = new Double(number);
            } else if (params[i] == Boolean.TYPE) {
                boolean number = Boolean.parseBoolean(paramStr);
                objs[i] = new Boolean(number);
            } else if (params[i] == Short.TYPE) {
                short number = Short.parseShort(paramStr);
                objs[i] = new Short(number);
            }
        }

        return objs;
    }
}
