package Extra;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalExample {

    private static DecimalFormat df2 = new DecimalFormat("#");

    public static void main(String[] args) {

        double input = 3.14159265359;
        System.out.println("double : " + input);
        System.out.println("double : " + df2.format(input));    //3.14

        // DecimalFormat, default is RoundingMode.HALF_EVEN
        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\ndouble : " + df2.format(input));  //3.14

        df2.setRoundingMode(RoundingMode.UP);
        System.out.println("double : " + df2.format(input));    //3.15

    }

}