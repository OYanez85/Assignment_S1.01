// Car.java
public class Car {
    // Attributes
    public static final String brand = "Volkswagen";
    public static String model;
    public final int horsepower;

    // Constructor
    public Cotxe(String model, int horsepower) {
        Cotxe.model = model;
        this.horsepower = horsepower;
    }

    // Static method
    public static void braking() {
        System.out.println("The vehicle is braking.");
    }

    // Non-static method
    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }
}

