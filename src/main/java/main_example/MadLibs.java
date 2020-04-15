package main_example;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    MadLibs_User madLibsUser = new MadLibs_User();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    //Print instructions to the player
    public void printInstructions() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Welcome to the Madlibs game. If you type in words, we'll give you a story "
                + "Start by typing in a name!" + " Hooray, let's go:");
        System.out.println("-------------------------------------------------------------------------");
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


    public void putTogetherTheStory() {
        String story;

        int num = Math.abs(random.nextInt()) % 2;
        if (num == 0) {
            story = "Jesse and her best friend " + madLibsUser.getName() + " went to Disney World today! "
                    + "They saw a " + madLibsUser.getNoun1() + " in a show at the Magic Kingdom "
                    + "and ate a " + madLibsUser.getAdjective1() + " feast for the dinner. The next day I "
                    + " ran " + madLibsUser.getAdverb() + " to meet Mickey mouse in his " + madLibsUser.getNoun2() + " "
                    + "and then that night I gazed at the " + madLibsUser.getRandomNum() + " "
                    + madLibsUser.getAdjective2() + " fireworks shooting from the " + madLibsUser.getNoun3() + ".";
            madLibsUser.setStory(story);
        } else {
            story = "Amanda and her frenemy " + madLibsUser.getName() + " went to the zoo last summer. "
                    + "They saw a huge " + madLibsUser.getNoun1() + " and a tiny little " + madLibsUser.getNoun2() + " That night"
                    + " they decided to climb " + madLibsUser.getAdverb() + " into the " + madLibsUser.getNoun3() + " to get closer look."
                    + " The zoo was " + madLibsUser.getAdjective1() + " at night, but they did not care..."
                    + " until " + madLibsUser.getRandomNum() + " " + madLibsUser.getAdjective2() + " apes yelled their faces, making"
                    + " Amanda and " + madLibsUser.getName() + " sprint all the way back home";
        }
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
        madLibsUser.setRandomNum();
        putTogetherTheStory();
        System.out.println(madLibsUser.getStory());
    }

    public static void main(String[] args) {
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();

    }
}
