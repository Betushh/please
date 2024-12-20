package MainLesson.Lesson24;


import MentorLesson.Lesson4.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Human> human = List.of(
                new Human("Human1", 1),
                new Human("Human2", 2),
                new Human("Human3", 3),
                new Human("Human4", 2),
                new Human("Human5", 5)
        );

//        List<Human> humanList = human.stream().
//                filter(human1 ->human1.getId()<3).sorted(Comparator.comparing(human1 -> human1.getId())).toList();

        List<String> names = human.stream().map(human1 -> human1.getName()).toList();


//        for(Human human1 : human){
//            if(human1.getId()<3){
//                humanList.add(human1);
//            }
//        }
//
        //       humanList.forEach(human1 -> System.out.println(human1.getName()));// replaces for , we can loop our list with using this
        //      names.forEach(name-> System.out.println(name));


/*
        writeSth((name , secondName) ->{// if we have o parameter , we do not need the brackets
            System.out.println("Here is my name: " + name);
            System.out.println("Here is my second name: "+ secondName);
            return name +" "+ secondName;

        });// this is lambda

 */
/*
        Human oprtionalHuman;
        if(getHuman().isPresent()){
          oprtionalHuman  = getHuman().get();
            System.out.println(oprtionalHuman);
        }

 */

//        Human optionalHuman = getHuman().orElse(getDefaultHuman());
        Human optionalHuman = getHuman().orElseGet(Main::getDefaultHuman);// works with just methods
        Human throwableHuman = getHuman().orElseThrow(ArithmeticException::new);// we can throw exception to them
        System.out.println(optionalHuman);

    }

    static void writeSth(Writer writer) {

        writer.writeName("[y/n]", "hyuk min");
    }

    static Optional<Human> getHuman() {
        return Optional.of(new Human("Optional Human", 0));// of: cannot be null
        //   return Optional.ofNullable(new Human("Optional Human", 0));// ofNullable: can be null
        //  return Optional.empty();
    }

    static Human getDefaultHuman() {
        System.out.println("It is default human");
        return new Human("Default Human", 0);
    }


}