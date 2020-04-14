
import java.util.*;


public class Day2 {


    public static void main(String[] args) {
        System.out.println("Please enter price 12, 10.5 or 15.5 or 20.75: ");
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Please enter tip amount 20, 15 or 17 or 10: ");
        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Please enter tax amount 5, 8 or 10 or 3: ");
        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("The result is: ");
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double totalCost = (meal_cost + (meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100));
        int roundTotalCost = (int) Math.round(totalCost);


        if (meal_cost != 12 && meal_cost != 15.5 && meal_cost != 10.25 && meal_cost != 20.75) {
            System.out.println("Incorrect price, please choose 10.5, 12 or 15,5 or 20.75");
        }
        {
            if (tip_percent != 20 && tip_percent != 15 && tip_percent != 17 && tip_percent != 10) {
                System.out.println("Incorrect tip, please choose 15,17 or 20");
            }
            if (tax_percent != 5 && tax_percent != 8 && tax_percent != 10 && tax_percent != 3) {
                System.out.println("Incorrect tax, choose 5,8 or 10");
            } else {
                System.out.println(roundTotalCost);
            }
        }
    }
}

