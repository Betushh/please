package MainLesson.Lesson13.Homework13;

public interface Religion extends Believer  {

     String name = "Islam"; //static final public

     void Buddhism();

     default void Christian(String name){
          System.out.println("Book name");
     }

     static String Islam(String name){
          if(name.equalsIgnoreCase("Quran")){
               return "Islam book name is "+name.toLowerCase();
          }
          return "You give us wrong book";
     }

     default void getName(){
          System.out.println("Religion");
     }
}
