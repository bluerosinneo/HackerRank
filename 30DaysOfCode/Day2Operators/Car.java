

public class Car{

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16.0;
    double currentFuel = 8.0;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn(){
        numberOfPeopleInCar = numberOfPeopleInCar + 1;
        // could have done numberOfPeopleInCar++ ("but some don't like that")
        // I don't
    }

    public void getOut(){
        numberOfPeopleInCar = numberOfPeopleInCar - 1;
        //
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillup(){
        return maxFuel * mpg;
    }

    public void changeCondition(){
        condition = 'C';
    }

    public static void main(String[] args){
        System.out.println("BirthdayCar v1");
        Car birthdayPresent = new Car(500, 5000.545, true);
        birthdayPresent.printVariables();

        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillup());
        System.out.println("BirthdayCar v2");
        birthdayPresent.printVariables();

        birthdayPresent.getOut();
        System.out.println("BirthdayCar v3");
        birthdayPresent.printVariables();
        // System.out.println("ChristmasCar");
        // Car christmasPresent = new Car(550, 2000, false);
        // christmasPresent.printVariables();
    }
}
