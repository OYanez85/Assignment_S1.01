// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Brand: " + Car.brand);

        // Create instances of Cotxe
        Car car1 = new Car("Golf", 150);
        Car car2 = new Car("Tiguan", 200);

        System.out.println("Car 1 - Model: " + Car.model + ", Horsepower: " + car1.horsepower);
        System.out.println("Car 2 - Model: " + Car.model + ", Horsepower: " + car2.horsepower);

        // Call static method
        Car.breaking();

        // Call non-static method
        car1.accelerating();
        car2.accelerating();
    }
}

