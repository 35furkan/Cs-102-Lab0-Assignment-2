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
}
