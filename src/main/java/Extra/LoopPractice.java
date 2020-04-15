package extra;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 5) {
            System.out.println("The value of x is: " + x);
            x++;
        }
        System.out.println("This is the end of While loop");
    }

    public static void practiceDoWhileLoop() {
        int i = 0;
        do {
            System.out.printf("The value of x is: " + i);
        } while (i < 5);
        i++;
        System.out.println("This is the end of DoWhile loop");
    }

    public static void practiceForLoop() {
        for (int y = 0; y < 10; y++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(" " + y + " " + j + " ");
            }
        }
        System.out.println("This is the end");

    }


    public static void main(String[] args) {
        LoopPractice loopPractice = new LoopPractice();

//        practiceWhileLoop();
//        System.out.println("---------------------------------------------------------------");
//        practiceDoWhileLoop();
//        System.out.println("---------------------------------------------------------------");
        practiceForLoop();

    }


}
