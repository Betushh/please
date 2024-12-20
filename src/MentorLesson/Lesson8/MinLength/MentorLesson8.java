package MentorLesson.Lesson8.MinLength;

import java.lang.reflect.Field;

public class MentorLesson8 {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("Someone");
        Class reflection = user.getClass();

        for(Field field:reflection.getDeclaredFields()){
            if(field.isAnnotationPresent(MinLength.class)){
                field.setAccessible(true);
                String ourName = (String) field.get(user);
                if(ourName.length() == field.getAnnotation(MinLength.class).value()){
                    System.out.println("Our value matches with given one");
                }else{
                    System.out.println("Our value does not match with given one");
                }

            }
        }


    }
}
