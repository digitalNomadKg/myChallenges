import java.util.Scanner;

public class Day12 {

    private static void printResult(){
        System.out.println("hello world dear");
        System.out.println("Please enter your name:");
        String nameGenerator = scanner.nextLine();
        nameGenerator.toUpperCase();
        System.out.println("Please enter your family name");
        scanner.nextLine();
        System.out.println(nameGenerator);


    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        printResult();

    }
}
