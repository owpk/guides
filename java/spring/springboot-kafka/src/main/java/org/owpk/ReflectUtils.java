package org.owpk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class ReflectUtils {
    private ReflectUtils(){}

    public static <T> List<Object> getAllValuesFromGetterMethods(List<Method> methods, T component) throws ClassNotFoundException {
        return methods.stream().map(x -> {
            try {
                return x.invoke(component);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
    }

    public static List<Method> getAllGetterMethods(Class<?> clazz) {
        return getAllMethodsWithFilter(clazz, x -> x.getName().startsWith("get"));
    }

    public static List<Method> getAllPublicMethods(Class<?> clazz) {
        return getAllMethodsWithFilter(clazz, x -> x.getModifiers() == Modifier.PUBLIC);
    }

    private static List<Method> getAllMethodsWithFilter(Class<?> clazz, Predicate<Method> predicate) {
        var methods = clazz.getDeclaredMethods();
        return Arrays.stream(methods).filter(predicate).collect(Collectors.toList());
    }
}
