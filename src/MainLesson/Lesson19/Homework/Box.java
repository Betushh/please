package MainLesson.Lesson19.Homework;

import MainLesson.Lesson19.Day;

public final class Box {
   private final String name;
   private final Day day;

   public Box(String name, Day day){
       this.name = name;
       this.day = day;
   }

    public String getName(){
        return name;
    }

    public Day getDay(){
       return this.day;
    }
}

