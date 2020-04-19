package extra;

public class Day7Example {
    public static void main(String[] args) {
        // the number of elements we want to hold
        final int arraySize = 9;

        // our array declaration
        String[] stringArray = new String[arraySize];

        for (int i = 0; i <arraySize; i++) {
            // assign value to index i
            stringArray[i] = "This is stored in index " + i;

            // print value saved in index i
            System.out.println(stringArray[i]);
        }
    }
}
