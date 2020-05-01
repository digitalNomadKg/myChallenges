import java.util.Scanner;

public class Day10 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void result() {
        System.out.println("Please enter number decimal number:");
        calculation();

    }

    public static void calculation() {
        int n = scanner.nextInt();

        int sum = 0;
        int max = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);

        scanner.close();
    }


    public static void main(String[] args) {
        result();

    }
}

