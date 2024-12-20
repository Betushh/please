package MentorLesson.Lesson8.EntityInfo;

import java.lang.reflect.Field;

public class EntityMain {
    public static void main(String[] args) throws IllegalAccessException {

        EntityUser entityUser = new EntityUser("hhhhh", 4);
        Class entity = entityUser.getClass();

        for (Field field : entity.getDeclaredFields()) {
            if (field.isAnnotationPresent(EntityInfo.class)) {
                field.setAccessible(true);
                System.out.println(field.get(entityUser));
                }
            }
        }
    }

