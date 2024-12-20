package MainLesson.Lesson20;

import java.lang.reflect.*;

public class Lesson20 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //metadata

        @SuppressWarnings("no warning")
        Pet pet = new Pet(2, "Death");
        Class reflection = pet.getClass();
   /*
//For field
        for(Field field: reflection.getDeclaredFields()){
            if(field.isAnnotationPresent(MyFieldAnnotation.class)){
                int mod = field.getModifiers();
//            System.out.println(mod);
                System.out.println(Modifier.toString(mod));
                System.out.println(field.getName());

                field.setAccessible(true);
                Object object = field.get(pet);

                if(object instanceof String strValue){
                    System.out.println(strValue);
                }


            }
        }

    */

        for (Method method : reflection.getMethods()) {//only inheritance and public methods
            //  System.out.println(method.getName());
        }
        for (Method method : reflection.getDeclaredMethods()) {//all the methods methods

            if(method.isAnnotationPresent(MyMethodAnnotation.class)){
                System.out.println(method.getName());

                MyMethodAnnotation myMethodAnnotation = method.getAnnotation(MyMethodAnnotation.class);
                System.out.println(myMethodAnnotation.count());

                    method.invoke(pet, myMethodAnnotation.count());


            }



//            System.out.println(method.getModifiers());
//            System.out.println(Modifier.toString(method.getModifiers()));
//            System.out.println(method.getReturnType().getName());
//            method.setAccessible(true);
//            int par = method.getParameterCount();
//            if (par > 0) {
//                method.invoke(pet, 5);
//            } else {
//                method.invoke(pet);
//            }


        }



/*
        if(reflection.isAnnotationPresent(MyAnnotation.class)){

            System.out.println("Have it");
        }else{
            System.out.println("no");
        }

        for(Constructor constructor: reflection.getConstructors()){
            System.out.println(constructor.getParameterCount());
            int mod  = constructor.getModifiers();
            System.out.println(Modifier.toString(mod));
        }


        Test test = new Test(2);

        Class reflection = test.getClass();

        for (Method method : reflection.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyMethodAnnotation.class)) {
                method.setAccessible(true);

                System.out.println(method.getAnnotatedReturnType());
                System.out.println(method.getName());

                MyMethodAnnotation myMethodAnnotation = method.getAnnotation(MyMethodAnnotation.class);

                System.out.println(myMethodAnnotation.count());
                System.out.println(method.invoke(test, myMethodAnnotation.count()));
            }
        }

 */

    }
}
