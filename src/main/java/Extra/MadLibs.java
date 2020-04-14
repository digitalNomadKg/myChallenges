package Extra;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    MadLibs_User madLibsUser = new MadLibs_User();
    private static final Scanner scanner = new Scanner(System.in);
    public final Random random = new Random();

    //Print instructions to the player
    public void printInstructions() {
        System.out.println("Welcome to the Madlibs game. If you type in words, we'll give you a story "
                + "Start by typing in a name!" + " Hooray, let's go:");
    }

    //Get data from a player
    public void enterName() {
        System.out.println("Please enter your name: ");
        madLibsUser.setName(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("now enter noun_1: ");
        madLibsUser.setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("now enter noun_2: ");
        madLibsUser.setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("now enter noun_3: ");
        madLibsUser.setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Please enter Adjective_1: ");
        madLibsUser.setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Please enter Adjective_2: ");
        madLibsUser.setAdjective2(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Enter adverb");
        madLibsUser.setAdverb(scanner.nextLine());
    }


    public  void putTogetherTheStory() {
        String story = "Jesse and her best friend " + madLibsUser.getName() + " went to Disney World today! "
                + "They saw a " + madLibsUser.getNoun1() + " in a show at the Magic Kingdom "
                + "and ate a " + madLibsUser.getAdjective1() + " feast for the dinner. The next day I "
                + " ran " + madLibsUser.getAdverb() + " to meet Mickey mouse in his " + madLibsUser.getNoun2() + " "
                + "and then that night I gazed at the " + madLibsUser.getRandomNum() + " "
                + madLibsUser.getAdjective2() + " fireworks shooting from the " + madLibsUser.getNoun3() + ".";
        madLibsUser.setStory(story);

    }

    public void play() {
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
    }


    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();

    }

}
