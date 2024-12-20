package MainLesson.Lesson5;

public class Lesson5 {

    int sum(int n){
        int sum = 0;
//        for(int i = 1;i<=n;i++){
//            sum +=i;
//        }
        if(n==1){
            return 1;
        }
        return sum(n-1) +n;
    }

    public static void main(String[] args) {
    /*    Lesson.Fruit fruit = new Lesson.Fruit();
        System.out.println(fruit.name);
        System.out.println(fruit.weight);
        System.out.println(fruit.color);

        Lesson.Fruit fruit1 = new Lesson.Fruit();
        fruit1.name = "banana";
        fruit1.weight = 2;
        fruit1.color = "yellow";

        System.out.println(fruit1.name);
        System.out.println(fruit1.weight);
        System.out.println(fruit1.color);

        Lesson.Fruit fruit3 = new Lesson.Fruit();
        fruit3.sayHello();

        String country = fruit3.getCountry();
        System.out.println(country );

        int multiple = fruit3.getCalorie(2,5) ;
        System.out.println(multiple);

     */
        int n = 5;
        Lesson5 lesson5 = new Lesson5();
        int sum = lesson5.sum(n);
        System.out.println(sum);

    }
}
