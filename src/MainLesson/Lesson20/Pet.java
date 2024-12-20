package MainLesson.Lesson20;

@MyAnnotation
@MyClassAnnotation
public class Pet {

    private int age;
    @MyFieldAnnotation
    private String name;
    public Pet(int age, String name){
        this.age = age;
        this.name = name;
    }

    @MyMethodAnnotation(count = 4)
    public void publicMethod(int count){
        System.out.println("it is public method."+ count);
    }
    protected void protectedMethod(){
        System.out.println("it is protected method.");
    }
     void defaultMethod(){
        System.out.println("it is default method.");
    }
    private void privateMethod(){
        System.out.println("it is private method.");
    }
}
