package MainLesson.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
// Big O notation
      /*  int a = 3;
        int b = 4;
        int result = a + b;
        System.out.println(result); */
        // O1 notation

      /*  int n = 10;
        for(int i = 0; i< n; i++){}  */
        // On notation

        /*  int n = 10;
        for(int i = 0; i< n; i /=2){}  */
        // O(log(n)) notation

      /*  int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j /= 2) {
            }
        } */

       /* int n = 10;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j /= 2) {
                }
            }
        } */
        // O(n square m) notation


  /*      int[] array = new int[4];
        int[] array2 = {12, 34, 55,55};

        array[0] = 0;
        array[1] = 0;
        array[2] = 0;
        array[3] = 0;

        array[2] = 22;

        for(int i = 0; i<= array.length-1 ; i++){
            System.out.println("array [" + i+ "] = "+array[i]);
        }
    */
     /*   int[][] array3 = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = i + j;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

        int[][] array4 = {{0, 1, 2}, {1, 2, 3}};



        int[] array5 = {10, 20, 30, 40,}; // we can write it like that too
        for(int i : array5 ){
            System.out.println(i);
        }

        String[] array6 = {"Daniel", "Lando", "Oscar"};
        for(String i : array6){
            System.out.println(i);
        }
*/

    }
}
