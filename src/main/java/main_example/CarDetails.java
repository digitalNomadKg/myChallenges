package main_example;

public class CarDetails {

     int minSpeed = 0;
     int maxSpeed = 100;
     double weight = 2750;
     boolean isTheCarOn = false;
     char condition = 'A';
     String nameOfCar = "Honda Jazz";
     double maxFuel = 16.0;
     double currentFuel = 8.0;
     double mpg = 26.4;
     int numberOfPeopleInCar = 1;


     public int getMinSpeed() {
          return minSpeed;
     }

     public void setMinSpeed(int minSpeed) {
          this.minSpeed = minSpeed;
     }

     public int getMaxSpeed() {
          return maxSpeed;
     }

     public void setMaxSpeed(int maxSpeed) {
          this.maxSpeed = maxSpeed;
     }

     public double getWeight() {
          return weight;
     }

     public void setWeight(double weight) {
          this.weight = weight;
     }

     public boolean isTheCarOn() {
          return isTheCarOn;
     }

     public void setTheCarOn(boolean theCarOn) {
          isTheCarOn = theCarOn;
     }

     public char getCondition() {
          return condition;
     }

     public void setCondition(char condition) {
          this.condition = condition;
     }

     public String getNameOfCar() {
          return nameOfCar;
     }

     public void setNameOfCar(String nameOfCar) {
          this.nameOfCar = nameOfCar;
     }

     public double getMaxFuel() {
          return maxFuel;
     }

     public void setMaxFuel(double maxFuel) {
          this.maxFuel = maxFuel;
     }

     public double getCurrentFuel() {
          return currentFuel;
     }

     public void setCurrentFuel(double currentFuel) {
          this.currentFuel = currentFuel;
     }

     public double getMpg() {
          return mpg;
     }

     public void setMpg(double mpg) {
          this.mpg = mpg;
     }

     public int getNumberOfPeopleInCar() {
          return numberOfPeopleInCar;
     }

     public void setNumberOfPeopleInCar(int numberOfPeopleInCar) {
          this.numberOfPeopleInCar = numberOfPeopleInCar;
     }


}
