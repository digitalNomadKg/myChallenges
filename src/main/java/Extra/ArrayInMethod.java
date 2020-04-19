package extra;

public class ArrayInMethod {


    public static void prinitingResult() {
        int[] bucket = {2, 4, 7, 13, 8, 10};

        change(bucket);

        for (int y : bucket) {
            System.out.println(y);
        }
    }

    public static void change(int[] x) {
        for (int counter = 0; counter < x.length; counter++) {
            x[counter]--;
        }
    }

    public static void main(String[] args) {
        prinitingResult();
    }
}
