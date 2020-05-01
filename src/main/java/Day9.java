import java.util.Scanner;

public class Day9 {

    private static final Scanner sc = new Scanner(System.in);


    public static int factorial(int i) {

        System.out.println(i);


        if (i <= 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }

    }

    public static void main(String[] args) {
        factorial(sc.nextInt());

        sc.close();

    }
}
