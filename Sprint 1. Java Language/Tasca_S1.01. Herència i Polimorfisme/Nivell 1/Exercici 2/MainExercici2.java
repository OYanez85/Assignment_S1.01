// MainExercici1.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Brand: " + Car.brand);

        // Create instances of Car
        Car car1 = new Car("Golf", 150);
        Car car2 = new Car("Tiguan", 200);
        Car car3 = new Car("Passat", 180);
        Car car4 = new Car("Polo", 120);
        Car car5 = new Car("T-Cross", 150);
        Car car6 = new Car("Arteon", 320);
        Car car7 = new Car("T-Roc", 300);
        Car car8 = new Car("Touareg", 462);
        Car car9 = new Car("ID.3", 204);
        Car car10 = new Car("ID.4", 204);

        System.out.println("Car 1 - Model: " + Car.model + ", Horsepower: " + car1.horsepower);
        System.out.println("Car 2 - Model: " + Car.model + ", Horsepower: " + car2.horsepower);
        System.out.println("Car 3 - Model: " + Car.model + ", Horsepower: " + car3.horsepower);
        System.out.println("Car 4 - Model: " + Car.model + ", Horsepower: " + car4.horsepower);
        System.out.println("Car 5 - Model: " + Car.model + ", Horsepower: " + car5.horsepower);
        System.out.println("Car 6 - Model: " + Car.model + ", Horsepower: " + car6.horsepower);
        System.out.println("Car 7 - Model: " + Car.model + ", Horsepower: " + car7.horsepower);
        System.out.println("Car 8 - Model: " + Car.model + ", Horsepower: " + car8.horsepower);
        System.out.println("Car 9 - Model: " + Car.model + ", Horsepower: " + car9.horsepower);
        System.out.println("Car 10 - Model: " + Car.model + ", Horsepower: " + car10.horsepower);

        // Call static method
        Car.braking();

        // Call non-static method
        car1.accelerating();
        car2.accelerating();
        car3.accelerating();
        car4.accelerating();
        car5.accelerating();
        car6.accelerating();
        car7.accelerating();
        car8.accelerating();
        car9.accelerating();
        car10.accelerating();
    }
}

