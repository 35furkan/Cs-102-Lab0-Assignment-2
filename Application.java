
import java.util.Random;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        int arraySize;
        int[] randArr; 
        Random r = new Random();

        Scanner in = new Scanner(System.in);

        System.out.print("Write the size of array: ");
        arraySize = in.nextInt();

        randArr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randArr[i] = r.nextInt(101);
        }
        
    }
    public int findMin(int[] randArr){
        int min = Integer.MAX_VALUE;
        for(int i= 0; i<randArr.length;i++){
            if(randArr[i]<min)
            min = randArr[i];
            

        }
        return min;
    }
    public int findMax(int[] randArr){
        int max = Integer.MIN_VALUE;
        for(int i= 0; i<randArr.length;i++){
            if(randArr[i]>max)
            max = randArr[i];
            

        }
        return max;
    }

    public static int findTheSumOfEvenIndexes ( int[] arrayToFindSum ){
        int result = 0;
        for (int i = 0; i < arrayToFindSum.length; i += 2){
            result += arrayToFindSum[i];
        }
        return result;
    }

    public static int findTheSumOfOddIndexes ( int[] arrayToFindSum ){
        int result = 0;
        for (int i = 1; i < arrayToFindSum.length; i += 2){
            result += arrayToFindSum[i];
        }
        return result;
    }


}
