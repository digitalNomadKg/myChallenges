package Extra;

import java.util.Scanner;

public class Testing_Scanner {

    private static final Scanner scanner = new Scanner(System.in);

    private void printingResult() {
        Testing_Scanner_User testingScannerUser = new Testing_Scanner_User(0, "defaultName", 0, 0);

        System.out.println("Please enter your name:");
        testingScannerUser.setUserName(scanner.next().toUpperCase());
        System.out.println("Please enter your age:");
        testingScannerUser.setUserAge(scanner.nextInt());
        System.out.println("Please enter you ID number:");
        testingScannerUser.setId(scanner.nextInt());
        System.out.println("Please enter your phone number:");
        testingScannerUser.setUserPhone(scanner.nextInt());

        System.out.println("Welcome: " + testingScannerUser.getUserName());
        System.out.println("Your age is: " + testingScannerUser.getUserAge());
        System.out.println("Your id is: " + testingScannerUser.getId());
        System.out.println("Your phone number is: " + testingScannerUser.getUserPhone());
    }

    public static void main(String[] args) {
        Testing_Scanner testing_scanner = new Testing_Scanner();

        testing_scanner.printingResult();
        scanner.close();

    }
}



