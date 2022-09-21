
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        int arraySize;
        int input;
        int[] randArr; 
        Random r = new Random();

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Write the size of array: ");
            arraySize = in.nextInt();
        } while (arraySize <= 0);

        randArr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            randArr[i] = r.nextInt(101);
        }

        boolean exitMenu = false;
        while (!exitMenu) {
            do {
                System.out.println();
                System.out.println("Enter choice");
                System.out.println("1- find the maximum ");
                System.out.println("2- find the minimum ");
                System.out.println("3- find the avarage");
                System.out.println("4- Find the sum ");
                System.out.println("5-exit");
                System.out.println();
                input = in.nextInt();
    
    
            }while( input < 1 || input > 5 );

            if (input == 5) {
                exitMenu = true;
            }
            else if (input == 1){
                System.out.println("Your array: " + Arrays.toString(randArr));
                System.out.print("maximum: ");
                System.out.println(findMax(randArr));

            }
            else if (input == 2){
                System.out.println("Your array: " + Arrays.toString(randArr));
                System.out.print("minimum: ");
                System.out.println(findMin(randArr));

            }
            else if (input == 3){
                System.out.println("Your array: " + Arrays.toString(randArr));
                System.out.println("The average is: " + findAverage(randArr) + " and differences are " + Arrays.toString(differenceFromAverage(randArr)));

            }
            else if  (input == 4){
                System.out.println("Your array: " + Arrays.toString(randArr));
                System.out.println("The summation of odd indexes: " + findTheSumOfOddIndexes(randArr));
                System.out.println("The summation of even indexes: " + findTheSumOfEvenIndexes(randArr));
            }
        }

        in.close();
        
    }
    public static int findMin(int[] randArr){
        int min = Integer.MAX_VALUE;
        for(int i= 0; i<randArr.length;i++){
            if(randArr[i]<min)
            min = randArr[i];
            

        }
        return min;
    }
    public static int findMax(int[] randArr){
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


    public static int findAverage(int[] intArray) {
        
        int average;
        int sum = 0;

        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }

        average = sum / intArray.length;

        return average;
    }

    public static int[] differenceFromAverage(int[] intArray) {
        int[] differenceFromAverage = new int[intArray.length];
        
        int average = findAverage(intArray);

        for (int i = 0; i < intArray.length; i++) {
            differenceFromAverage[i] = intArray[i] - average;
        }

        return differenceFromAverage;
    }


}

