package MainLesson.Lesson11.Polymorphism;

public class Zoo {


    static {
        System.out.println(" Zoo static block");
    }

    {
        System.out.println(" Zoo normal block");
    }

    public Zoo(){
        System.out.println("This is Zoo constructor");
    }

    public Zoo(int a){
        System.out.println("Zoo 1 arg constructor");
    }
    public void getMessage(){
        System.out.println("This is Zoo park method with no arg");
    }

    public void getMessage(String message){   //overLoading
        System.out.println("This is Zoo park method with 1 arg");
    }

}
