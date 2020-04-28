package main_example.recursionExample;

public class RecursionExample {

    //Method1
    public static void reduceByOne(int n) {
        if (n >= 0) {
            reduceByOne(n - 1);
        }
        System.out.println("Completed call: " + n);
    }

    //Method2
    public static void printNumbers(int num) {
        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            printNumbers(num - 1);
        }
    }


    public static void main(String[] args) {
        reduceByOne(10);
        System.out.println(" ");
        printNumbers(10);
    }
}


