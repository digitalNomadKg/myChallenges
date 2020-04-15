package main_example;

public class Car extends CarDetails {

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn, char customCondition,
               String customNameOfCar, double customMaxFuel, double customCurrentFuel,
               int customNumberOfPeopleInCar) {

        this.maxSpeed = customMaxSpeed;
        this.weight = customWeight;
        this.isTheCarOn = customIsTheCarOn;
        this.condition = customCondition;
        this.nameOfCar = customNameOfCar;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.numberOfPeopleInCar = customNumberOfPeopleInCar;
    }


    private void printVariables() {
        System.out.println("MaxSpeed is: " + maxSpeed);
        System.out.println("MinSpeed is: " + minSpeed);
        System.out.println("The weight of the car is: " + weight);
        System.out.println("The car is working? " + isTheCarOn);
        System.out.println("What is the condition of the car? " + condition);
        System.out.println("The name of the car is: " + nameOfCar);
        System.out.println("The maxLevel of fueltank is: " + maxFuel);
        System.out.println("The level of the fuel now is: " + currentFuel);
        System.out.println("Amount of the passengers: " + numberOfPeopleInCar);
        System.out.println("howManyMilesTillOutOfGas: " + howManyMilesTillOutOfGas());
        System.out.println("maxMilesPerFillUp: " + maxMilesPerFillUp());

    }

    public void getIn() {
        int maxNumberOfPeopleInCar = 6;
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar) {
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else {
            System.out.println("The car is full: " + numberOfPeopleInCar + "=" + maxNumberOfPeopleInCar);
        }
    }

    private void getOut() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is the car" + numberOfPeopleInCar);
        }
    }

    private double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    private double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    private void turnTheCarOn() {
        if (!isTheCarOn) {  //!isTheCarOn
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on" + true);
        }
    }


    public static void main(String[] args) {
        Car birthdayPresent = new Car(900, 1500, false, 'B',
                "Mercedes-Benz", 45, 32, 1);
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getOut();
        birthdayPresent.printVariables();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        Car christmasPresent = new Car(650, 1250, true, 'A',
                "Lamborgini", 60, 55, 3);
        christmasPresent.printVariables();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");


        Car familyCar = new Car(120, 4500, true, 'A',
                "Toyota Sequoia", 80, 45, 5);
        familyCar.printVariables();
    }
}
