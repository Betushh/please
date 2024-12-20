package MainLesson.Lesson12.Encapsulation;


import MainLesson.Lesson12.Abstraction.Snake;
import MainLesson.Lesson12.Abstraction.Snake;

public class Lesson12 {

    public static void main(String[] args) {
  /*     Customer customer = new Customer();
        customer.name = "someone";
        System.out.println(customer.name +" "+customer.age);
        customer.setAge(6);
        System.out.println(customer.getAge());

        customer.setName("Kerim");
        System.out.println(customer.getName());

        System.out.println(customer);

   */

        Snake snake = new Snake() {
            @Override
            public void getColor() {
                System.out.println("Yellow");
            }
        };
        snake.getName();
        snake.getColor();

    }

}







