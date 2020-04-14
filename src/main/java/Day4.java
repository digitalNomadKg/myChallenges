import java.util.Scanner;

public class Day4 {

    private void personResult() {
        System.out.println("Please enter your age: ");
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            Day4Person day4Person = new Day4Person(age);
            day4Person.amIOld();
            for (int j = 0; j < 3; j++) {
                day4Person.yearPasses();
            }
            day4Person.amIOld();
            System.out.println();
        }
        scanner.close();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Day4 result = new Day4();
        result.personResult();
    }
}