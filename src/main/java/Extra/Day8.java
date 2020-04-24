package extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {


    public static void phoneBookFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to see those contact");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            // Write code here

        }
        while (scanner.hasNext()) {
            String s = scanner.next();
            // Write code here
        }
        scanner.close();

    }

    public static void printingResult() {
        phoneBookFunction();
    }


    public static void main(String[] arg) {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        phoneBook.put("sam", 99912222);
        phoneBook.put("tom", 11122222);
        phoneBook.put("harry", 12299933);
        phoneBook.put("sam", null);
        phoneBook.put("edward", null);
        phoneBook.put("harry", null);


        printingResult();

    }
}