package MainLesson.Lesson12;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Jeffrey");
        author.setSurname("Dahmer");
        author.setId(34);

        Book book = new Book();
        book.setGenre("Thriller");
        book.setPublishAmount(300);
        author.setBook(book);
        System.out.println(author);




//        int[] array ={23,12,2,78,345,22,0,1,77,24,78,22};
        //     System.out.println(array.length);
        int[] array = {5, 10, 2, 3, 4, 1};
        // 5 4 3 2 2 1
        int res = findByNumber(array, 4);
        System.out.println("res = " + res);


    }

    private static int findByNumber(int[] array, int number) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int newArray = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = newArray;


                }

            }

        }
        return array[array.length - number];
    }

}
