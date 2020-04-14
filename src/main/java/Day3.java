import java.util.Scanner;

public class Day3 {


    private String numberGenerator() {
        int N = scanner.nextInt();

        if (N % 2 == 1) {
            return "Weird";
        } else {
            if (N >= 2 && N <= 5)
                return "Not Weird";
            else if (N >= 6 && N <= 20)
                return "Weird";
            else if (N > 20)
                return "Not Weird";
        }return numberGenerator();

    }

    private void result() {
        System.out.println("Please enter your number:");
        System.out.println(numberGenerator());
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Day3 day3 = new Day3();

        day3.result();
        scanner.close();
    }
}
