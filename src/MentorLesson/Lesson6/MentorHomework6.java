package MentorLesson.Lesson6;


import java.util.Scanner;

public class MentorHomework6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        Product product = new Product("Telephone", 2000);

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("Please choose what you want to do:\n1. Enter your Product information\n2. Find Min Price among the Products\n3. Find Max Price among the Products\n" +
                    "4. Shut down the product identification process");
            System.out.println("-------------------------------------------------");
            if (Product.productlist == null) {
                throw new NullPointerException(" You don't have data. Please input information");
            }
            int index = scanner.nextInt();
            switch (index) {
                case (1):
                    System.out.println("Please give information about Product");
                    product.getData(product);
                    break;
                case (2):
                    String cheaperOne = product.getMinPrice(product);
                    System.out.println(cheaperOne);
                    break;
                case (3):
                    String expensiveOne = product.getMaxPrice(product);
                    System.out.println(expensiveOne);
                    break;
                case (4):
                    System.out.println("Product identification ended");
                    return;
                case(5):
                    product.getDatas();
                    break;
                default:
                    System.out.println("Identification is wrong. please select among 1, 2, 3, 4");
            }
        }


    }


}
