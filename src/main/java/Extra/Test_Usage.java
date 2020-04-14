package Extra;

import java.util.Scanner;

public class Test_Usage {


    public static final Scanner scanner = new Scanner(System.in);



    private void enterNames(){
        System.out.println("Hello print your name here: ");

    }

    private void enterAge(){
        System.out.println("Now, please enter your age:");
    }


    public static void main(String[] args) {
        Test_Usage test_usage =  new Test_Usage();
        test_usage.enterNames();

        String userName =scanner.nextLine();
        System.out.println("Hello: " + userName);
        test_usage.enterAge();

        int age = scanner.nextInt();
        System.out.println(userName + " your age is: " + age);

    }
}
