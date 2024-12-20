package MentorLesson.Lesson5;

public class MentorHomework5 {

    public static int findMissingNumber(int[] array, int number) {
        int totalSum = number*(number+1)/2;
        int arraySum = 0;
        for(int num: array){
            arraySum+=num;
        }
        return totalSum-arraySum;



    }
}
