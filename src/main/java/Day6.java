import java.util.Scanner;

public class Day6 {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Please number for interval:");
        int N = scanner.nextInt();
        System.out.println("Please enter word");
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String string = scanner.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }
        scanner.close();
    }
}
