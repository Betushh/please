package MentorLesson.Lesson1;

import java.util.Scanner;

public class MentorLessonOne {
    public static void main(String[] args) {

 /*      // 3 eded beraberterefli beraberyanli
        int a = 12;
        int b = 13;
        int c = 13;
        if(a == b && a == c){
            System.out.println(" This triangle is beraberterfli");
        } else if ((a == b) || (a == c) || (b == c)){
            System.out.println(" This triangle is beraberyanli");
        }else {
            System.out.println(" This triangle is muxtelifterefli");
        }

        Scanner scanner = new Scanner(System.in);
        int customerValue = scanner.nextInt();
        if(customerValue > 100){
            int endirim = customerValue / 10;
            System.out.println(customerValue - endirim);
        }else{
            System.out.println(customerValue);
        }

        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b =scanner1.nextInt();
        int c = scanner1.nextInt();

       if (((a%2 == 0) && (b%2 ==0) && (c%2 == 0)) || (a%2 != 0) && (b%2 !=0) && (c%2 != 0)){
            System.out.println("No");
        }else {
            System.out.println("YES");
        }

        Scanner scanner2 = new Scanner(System.in);
        int eded = scanner2.nextInt();
        int s = 1;
        for(int t = 1 ; t <=eded ; t++ ){
            s *= t;
        }
        System.out.println(s);
*/

   /*     // 111   1 + 1 + 1
    int remain = 0;
        for( int i = 0 ; eded !=0 ; eded/10){
            remain += i;
        }
        System.out.println(remain);

        }

        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
        int remain = 0;
        while(eded > 0){
            remain += eded%10 ;
            eded /=10;
        }
        System.out.println(remain);

        //SADE olanlari tap

           */
        Scanner scanner = new Scanner(System.in);
        int ededBase = scanner.nextInt();
        int ededPower = scanner.nextInt();
        int eded = 1;
        //
        for(int i = 0 ; i< ededPower; i++){
            eded *= ededBase;
        }
        System.out.println(eded);

    }
}
