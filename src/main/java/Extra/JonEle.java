package extra;

public class JonEle {

    public static void ageChecker() {
        String name = "Steve";
        int age = 10;

        System.out.println(age>5 && age<13 ? name +  " is a child" : name + " now can smoke");


//        if (age <= 5) {
//            System.out.println(name + " is a baby");
//        } else if (age > 5 && age < 13) {
//            System.out.println(name + " is a child");
//        } else if (age >= 13 && age <= 19) {
//            System.out.println(name + " is a teenager");
//        } else {
//            System.out.println(name + " is an adult");
//        }
    }

    static void printResult() {
        ageChecker();
    }

    public static void main(String[] args) {
        printResult();

    }
}
