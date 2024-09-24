public class Car {
    // Attributes
    public static final String brand = "Volkswagen";
    public String model;  // Make model non-static
    public final int horsepower;

    // Constructor
    public Car(String model, int horsepower) {
        this.model = model;  // Use instance variable
        this.horsepower = horsepower;
    }

    // Static method
    public static void braking() {
        System.out.println("The vehicle is braking.");
    }

    // Non-static method
    public void accelerate() {
        System.out.println("The vehicle " + model + " is accelerating with " + horsepower + " horsepower.");
    }
}


