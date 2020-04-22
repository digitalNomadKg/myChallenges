package extra;

public class FindingFibonacci {

    public long getNthFibonacci(long n) {
        long fibonacci1 = 1;
        long fibonacci2 = 1;
        long fibonacci3 = fibonacci1 + fibonacci2;

        if (n == 1 || n == 2) {
            return 1;
        }

        if (n == 3) {
            return fibonacci3;
        }

        int counter = 3;
        while (n >= counter) {
            fibonacci1 = fibonacci2 + fibonacci3;
            counter++;
            if (counter == n) {
                return fibonacci1;
            }

            fibonacci2 = fibonacci3 + fibonacci1;
            counter++;
            if (counter == n) {
                return fibonacci2;
            }

            fibonacci3 = fibonacci1 + fibonacci2;
            counter++;
            if (counter == n) {
                return fibonacci3;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        FindingFibonacci findingFibonacci = new FindingFibonacci();

        int nth = 15;
        long result = findingFibonacci.getNthFibonacci(nth);

        System.out.println(result);

        System.out.println();
        System.out.println("Integer max value : " + Integer.MAX_VALUE);
        System.out.println("Long max value    : " + Long.MAX_VALUE);
    }

}