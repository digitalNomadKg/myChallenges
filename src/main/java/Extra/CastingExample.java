/*
# Java type casting
- widening casting(automatically): converting a smaller type to a large size
byte->short->char->int->long->float->double
- narrowing casting(manually): converting a larger type to a smaller type
double->float->long->int->char->short->byte
 */


package Extra;

public class CastingExample {

    int myInt = 9;
    double myDouble = myInt;

    public void printResult() {
        System.out.println(myInt);
        System.out.println(myDouble);
    }

    public static void main(String[] args) {
        CastingExample castingExample = new CastingExample();

        castingExample.printResult();
    }

    static class NarrowingCasting {
        private static double myDouble = 9.78;
        private static int myInt1 = (int) myDouble;

        public static void main(String[] args) {
            System.out.println(myDouble);
            System.out.println(myInt1);
        }


    }
}
