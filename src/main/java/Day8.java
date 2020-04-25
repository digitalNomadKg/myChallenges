import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void hashMapMethod() {

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number, to set number of contacts in phone book");
        int n = scanner.nextInt();
        System.out.println("Please set name and phone number");

        scanner.nextLine();

        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            scanner.nextLine();
            phoneBook.put(name, phone);
        }
        System.out.println("Please choose name from phonebook");
        while (scanner.hasNext()) {
            String s = scanner.next();
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        scanner.close();
    }

    public static void main(String[] arg) {
        hashMapMethod();

    }
}



