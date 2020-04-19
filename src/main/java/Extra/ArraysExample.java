package extra;

public class ArraysExample {
}

class Y {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Porshe", "Honda Jazz"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + ",");
        }
    }

}

class X {
    //for each loop
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Porshe", "Honda Jazz"};
        for (String i : cars) {
            System.out.print(i +",");
        }
        System.out.println(" ");
        System.out.println("The are " + cars.length +  " elements in cars array");
    }


}

/*
The example above can be read like this: for each String
element (called i - as in index) in cars, print out the value of i.

If you compare the for loop and for-each loop,
you will see that the for-each method is easier to write,
it does not require a counter (using the length property),
and it is more readable.
 */





