package extra;

public class ReverseName {

    public static void main(String[] args) {
        String myName = "Tim Kirves";

        for (int i = myName.length() - 1; i >= 0; i--) {
            System.out.print(myName.charAt(i));
        }
    }
}