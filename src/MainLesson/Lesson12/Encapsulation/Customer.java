package MainLesson.Lesson12.Encapsulation;

public class Customer {
    private String name;
    private int age;

   public void setName(String name){
       this.name = name;
   }

   public String getName(){
       return name;
   }

   public void setAge(int age){
       this.age = age;
   }

   public int getAge(){
       return age;
   }

    @Override
    public String toString(){
        return "Custome: { name: "+getName()+", age: "+getAge()+" }";
    }
}
