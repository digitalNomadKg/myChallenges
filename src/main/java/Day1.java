import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


        int i2 = 12;
        double d2 = 4.0;
        String s2 ="is the best place to learn and practice coding!";

        System.out.println("Please enter first number: 12");
        int ii = i + scan.nextInt();
        System.out.println("Next number should be decimal: 4.0");
        double dd = d + scan.nextDouble();
        System.out.println("Type this: is the best place to learn and practice coding!");
        String ss = s + scan.next() + scan.nextLine();
        System.out.println();
        System.out.println("Result:");

        System.out.println(ii + "\n" + dd + "\n" + ss);


//        System.out.println(i + i2);
//        System.out.println(d + d2);
//        System.out.println(s + s2);

        scan.close();
    }

}
