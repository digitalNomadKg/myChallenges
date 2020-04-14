package Extra;

import java.util.Random;

public class CoinToss {


    private void printingResult() {
        System.out.println(tossACoin());
    }

    private String tossACoin() {
        Random random = new Random();
        int toss = Math.abs(random.nextInt()) % 2;
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }

    }

    public static void main(String[] args) {
        CoinToss game = new CoinToss();

        game.printingResult();
        game.printingResult();
        game.printingResult();
        game.printingResult();
        game.printingResult();
        game.printingResult();

    }
}
