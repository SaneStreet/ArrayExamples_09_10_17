import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        System.out.println("__________________1__________________");
        //Array
        double[] myList = new double[10];

        // 1. Initializing array with input values:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();
        System.out.println("__________________2__________________");

        // 2. Initializing arrays with random values:
        for (int i = 0; i < myList.length; i++){
            myList[i] = Math.random() * 100;
            System.out.println(myList[i]);
        }

        System.out.println("__________________3__________________");

        // 3. Displaying arrays:
        for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        System.out.println("__________________4__________________");

        // 4. Summing all elements:
        double total = 0;
        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Det totale er: " + total);
        System.out.println("__________________5__________________");

        // 5. Finding the largest element:
        double max = myList[0];
        for (int i = 0; i < myList.length; i++){
            if (myList[i] > max)
                max = myList[i];
        }
        System.out.println("Det største tal er: " + max);
        System.out.println("__________________6__________________");

        // 6. Finding the smallest index of the largest element:
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max){
                max = myList[i];
                indexOfMax = 1;
            }
        }
        System.out.println("Det mindste index af det største element: ");
        System.out.println("__________________7__________________");
        // 7. Random shuffling:

    }
}
