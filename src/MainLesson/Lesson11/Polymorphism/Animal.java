package MainLesson.Lesson11.Polymorphism;

public class Animal extends Zoo {

    public Animal() {
        super(12);
        System.out.println("This is Animal constructor");
    }

    static {
        System.out.println(" Animal static block");
    }

    {
        System.out.println(" Animal normal block");
    }

    @Override
    public void getMessage() {
        System.out.println("hellloooooooo from Animal class");

    }

    public void getAnimalname() {
        System.out.println("Our animal name is Jaguar");
    }

}
