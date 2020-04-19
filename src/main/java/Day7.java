import java.util.Scanner;

public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);


    public static void arrayResult() {
        System.out.println("Please enter number");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter number with space");
        for (int i = 0; i < n; i++) {
         arr[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        arrayResult();
    }
}
