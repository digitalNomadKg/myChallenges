/*loops
    Hackerrank loop example solution
 */

import java.util.Scanner;

public class Day5 {

    public static void result() {
        System.out.println("Please enter your number");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        result();
        scanner.close();
    }
}