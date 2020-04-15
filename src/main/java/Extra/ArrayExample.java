package extra;

public class ArrayExample {

    private String[] cars = {"Audi", "BMW", "Honda Jazz"};
    private int[] carYear = {1987, 2001, 2020};

    public void chooseCar() {
        System.out.println(cars[0] + " " + carYear[2]);
        System.out.println(cars[2] + " " + carYear[0]);
        System.out.println(cars[1] + " " + carYear[1]);
    }

    public static void main(String[] args) {
        ArrayExample n = new ArrayExample();
        n.chooseCar();
    }
}
