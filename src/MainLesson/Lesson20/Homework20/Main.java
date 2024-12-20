package MainLesson.Lesson20.Homework20;

import MainLesson.Lesson20.SetterAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

     //   setterOrGetter();
        valueSetter();


    }

    public static void setterOrGetter() throws InvocationTargetException, IllegalAccessException {
        SetterOrGetter so = new SetterOrGetter();
        Class reflection = so.getClass();

        for (Method method : reflection.getDeclaredMethods()) {
            int count = method.getParameterCount();
            if (count == 1 && method.getName().startsWith("set")) {
                System.out.println(method.getName());
            } else if (count == 0 && method.getName().startsWith("get")) {
                System.out.println(method.getName());
                System.out.println("-----------------------------");
            } else {
                System.out.println("There are no setter and getter method.");
            }

        }

        //
//        for (Method method : reflection.getDeclaredMethods()) {
//            if (method.isAnnotationPresent(SetterAnnotation.class)) {
//                System.out.println(method.getName());
//            } else if (method.isAnnotationPresent(GetterAnnotation.class)) {
//                System.out.println(method.getName());
//                System.out.println("-----------------------------");
//            } else {
//                System.out.println("There are no setter and getter method.");
//            }
//
//        }
    }

    public static void valueSetter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SetterOrGetter so = new SetterOrGetter();
        Class reflection = so.getClass();

        Method setterMethod = reflection.getMethod("setName", String.class);
        setterMethod.invoke(so, "Value in setter");

        Method getterMethod = reflection.getMethod("getName");


        System.out.println(getterMethod.invoke(so));

    }

}


