package MentorLesson.Lesson10;

import MentorLesson.Lesson4.Student;
import MentorLesson.Lesson6.Product;
import MentorLesson.Lesson8.Book;
import MentorLesson.Lesson8.Genre;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // more than price 100
        List<Products> productList = List.of(
                new Products("Telephone", 2000),
                new Products("Car", 15000),
                new Products("pencil", 2)
        );

        productList.stream().peek(products -> {
            if(products.getPrice()>100){
              products.setName(products.getName().toUpperCase());
                System.out.println(products);
            }
        }).toList();

        System.out.println("==============================================");

        List<Students> studentList = List.of(
                new Students("Aytac", "Memmedova", "A"),
                new Students("Elizabeth", "Huseynli", "C"),
                new Students("Ada", "Hemkarli", "D"),
                new Students("John", "Aliyev", "A")
        );
// names which lengths more than 4
        studentList.stream().filter(students -> students.getName().length()>4).forEach(System.out::println);

        System.out.println("==============================================");

  //starts with A
        Optional<ArrayList<Students>> namesStartA = Optional.of(studentList.stream().filter(students -> students
                .getName().startsWith("A")).collect(Collectors.toCollection(ArrayList::new)));

        String s = Optional.ofNullable(namesStartA.get().getFirst().toString()).orElse("we do not have name like that");
        System.out.println(s);

        System.out.println("==============================================");


//group by grade
        Map<String, List<Students>> map = studentList.stream().collect(Collectors.groupingBy(Students::getGrade));
        System.out.println(map);

        System.out.println("==============================================");


        List<String> map1 = studentList.stream().map(Students::getGrade).sorted().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(map1);

        System.out.println("==============================================");

        //minus 1
        List<Integer> numbers =  Arrays.asList(12, 5, 67, 34, 8 ,90, 3 ,21 ,56, 43);
        ArrayList<Integer> n = numbers.stream().map(integer -> {
            if(integer%2!=0){
              return   integer-1;
            }
            return integer;
        }).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(n);

        System.out.println("==============================================");

        

        List<Authors> authorsList = List.of(new Authors("J.K. Rowling", List.of(new Book("Harry Potter and the Sorcerer's Stone",20, Genre.FICTION),
                new Book("Harry Potter and the Chamber of Secrets",25, Genre.FICTION),
                new Book("Very Good Lives",15, Genre.NONFICTION))),
                new Authors("George Orwell", List.of(new Book("1984", 20,Genre.FICTION ), new Book("Animal Farm", 23,Genre.FICTION))),
                        new Authors("Agatha Christie", List.of(new Book("Murder on the Orient Express",20,Genre.THRILLER),
                                new Book("Death on the Nile",12,Genre.THRILLER))));

      List<String> result =  authorsList.stream().flatMap(authors -> authors.getBookList().stream())
              .filter(book -> book.getGenre() == Genre.FICTION)
              .map(Book::getTitle).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);




    }


}
