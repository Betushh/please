package MentorLesson.Lesson4;


import java.util.Scanner;

public class MentorHomework4 {
    public static void main(String[] args) {
        int[] arr = {2,3,0,0,4,5,1};
        for(int i = 0; i< arr.length;i++){
            int[] a = traverseZeroes(arr);
            System.out.println(a[i]);
        }

        printPattern(5);
        int a = findNumberBinarySearch(arr,0);
        System.out.println(a);

    }
    private static int[] traverseZeroes(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        return arr;
    }

    private static void printPattern(int n){
        for(int i = 0; i<n;i++){
            for(int j = n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j = 0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int findNumberBinarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        for(int i = 0; i<arr.length;i++){
            int mid = (low + high)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                low = mid +1;
            }else{
                high=mid-1;
            }
        }
        return -1;
        }

    }





