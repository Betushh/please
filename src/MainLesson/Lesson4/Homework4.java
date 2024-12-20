package MainLesson.Lesson4;

public class Homework4 {
    public static void main(String[] args) {

        // Task 0
    /*    int[] array = {12, 23, 36, 47};
        int[] array2 = new int[array.length + 1];

        for(int i = 0 ; i< array.length; i++){
            array2[i] = array[i];
            System.out.println(array[i]);
        }
        Scanner scanner = new Scanner(System.in);
        int el = scanner.nextInt();
        array2[array.length] = el;

        for( int i :array2){
            System.out.println(i);
        }
    }*/


        //task 1  //47 36 23 12  Sort array reversed
    /*    int[] array = {12, 23, 36, 47};
       for(int i = array.length-1;i>=0;i--){
           System.out.println(array[i]);
        }
*/

        //task 2 max 47    min 12  Find array max and min element
 /*       int[] array = {12, 23, 36, 47};
        int min = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(array[i] < min){
                min = array[i];

            }
        }
        System.out.println(" Min = "+ min);

        // Max 47
        int max = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(array[i] > max){
                max = array[i];

            }
        }
        System.out.println(" Max = "+ max);

  */
        // task 3  23  Find second max element in array
 /*       int[] array = {12, 23, 36, 47};
        int max = array[0];
        int secondMax = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(array[i] > max) {
                max = array[i];
            }
            }
            for(int i = 0 ; i < array.length; i++){
            if(array[i] < max && array[i] > secondMax){
                secondMax = array[i];
            }
        }
        System.out.println(" Second Max = "+ secondMax);
*/

        //task 4  Multidimensional array diagonal 1 and 0
        int[][] array = new int[3][3];
    for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j ) {
                    array[i][j] = 1;
                }
            }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();

            }






        // task 5  Multidimensional array reverse order
  /*     int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println(" ");

        for(int i = array.length-1;i>=0;i--){
            for(int j = array.length - 1 ;j >= 0 ; j--){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }




        //task 6 Multidimensional array mirror
        int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length/2; j++) {
                int a = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = a;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array[i].length/2); j++) {
                int a = array[i][j];
                array[i][j] = array[i][array.length - 1 - j];
                array[i][array.length - 1 - j] = a;

            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }




 //task 6 Multidimensional array 90 degree
   /*     int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length/2; j++) {
                int a = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = a;
            }
        }

    */

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < (array[i].length/2); j++) {
//                int a = array[i][j];
//                array[i][j] = array[i][array.length - 1 - j];
//                array[i][array.length - 1 - j] = a;
//
//            }
//
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }




    }
}
