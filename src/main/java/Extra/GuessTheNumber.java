package extra;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private int theNumber;
    private static final Scanner scanner = new Scanner(System.in);


    public GuessTheNumber() {
        Random random = new Random();
        int max = 100;
        theNumber = Math.abs(random.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big: " + "another number please");
            } else if (move < theNumber) {
                System.out.println("Your number is too small: " + "try again");
            } else {
                System.out.println("YO YO YOU GOT IT BRO!");
                break;
            }
        }
    }

    private void printingResult() {
        System.out.println("Please enter your number:");

    }


    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();

        game.printingResult();
        game.play();
    }
}


//    private static void howBigIsMyNumber(int x) {
//
//        if (x >= 0 && x <= 10) {
//            System.out.println("Our number is pretty small");
//        } else if (x >= 11 && x <= 100) {
//            System.out.println("Our number is pretty big");
//        } else {
//            System.out.println("Our number is out of range");
//        }
//    }