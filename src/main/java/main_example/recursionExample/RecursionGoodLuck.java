package main_example.recursionExample;

public class RecursionGoodLuck {

    /*
     f(f(f(a))) --- a = 20
     f(a) = 5+a
     f(20) = 5+20 = 25
     f(f(f(20))) --- f(f(25)))
    f(25) = 5+25 = 30
     f(f(f(20))) --- f(f(25))) ---f(30)
    f(30) = 5+30 = 35
     f(f(f(20))) --- f(f(25))) ---f(30) --- 35

     Assignation of number (5)
     5+4+3+2+1+0;
     7+6+5+4+3+2+1+0;
    */

    public static int summation(int n) {
        //Base case
        if (n <= 0) {
            return 0; //additive identity property

            // Recursive case
        } else {
            //3+ Summation(2)
            //3+2+Summation(1)
            //3+2+1+Summation(0)
            //3+2+1+0=6
            return n + summation(n - 1);
        }
    }

    //5! --> 5*4*3*2*1; //Factorial
    public static int factorial(int i) {
        //base case
        if (i <= 0) {
            return 1;
        } else {
            // Factorial 4= 4 * Factorial(3)
            // 4 * 3 * Factorial(2)
            // 4 * 3 * 2 * Factorial(1)
            // 4 * 3 * 2 * 1;
            return i * factorial(i - 1);
        }
    }

    //5^3 = 5*5*5
    public static int exponentiation(int k, int j) {
        //Base case
        if (j <= 0) {
            return 1;
        } else {
            return k * exponentiation(k, j - 1);
        }

    }


    public static void main(String[] args) {
        summation(10);
        System.out.println();
        factorial(4);
        System.out.println();
        exponentiation(5, 6);
    }

}
