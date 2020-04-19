package extra;

import java.util.Arrays;

public class ArrayPractice {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.print(item);
            if (i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        //Declaring, Allocating and Initializing
        int[] intArray1;
        int[] intArray2 = new int[4];
        printArray(intArray2);
        int[] intArray3 = {5, 2, 3, 5, 4};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        String[] shoppingList = {"bananas", "apples", "pears"};

        //Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println("-------------------------------------");
        //Custom print out arrrauy
        printArray(intArray2);
        printArray(intArray3);

        //|Retrive objects
        System.out.println(intArray2[3]);

        //Given functions
        Arrays.sort(intArray3);
    }
}
