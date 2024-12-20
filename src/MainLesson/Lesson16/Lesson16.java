package MainLesson.Lesson16;

public class Lesson16 {
    public static void main(String[] args) {

//Integer cache
        Integer a = 10;//Byte, Long, Short. not Double
        Integer b = 10;

        Integer c = 1000;
        Integer d = 1000;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(c == d);
        System.out.println(c.equals(d));

//        int s = 122;
//        getValue(s);

  /*      int a = 12;
        Integer a1 = 12;
        Integer a2 = a;//boxing

        System.out.println(a1 == a);

        Long l1 =  (long) a;
        Long l2  = Long.valueOf(a);

        int p = a2;// unboxing

        double b = 1.5d;
        Double b1 = 1.5d;
        Long l = 1231L;
        Float f = 0.1f;
        Boolean bo = true;
        Boolean bl = null;
        Short s = 23;
        Byte by = 1;

   */

    }

    static void getValue(long i) {//widening
        System.out.println("int");
    }

    static void getValue(Integer i) {//boxing
        System.out.println("Integer i");
    }

    static void getValue(Integer... i) {//varargs
        System.out.println("int...i");
    }
}
