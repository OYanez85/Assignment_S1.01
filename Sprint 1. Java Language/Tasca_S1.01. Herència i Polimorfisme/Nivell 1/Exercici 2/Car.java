public class Car {
    
    public static final String brand = "Volkswagen";
    public String model;  
    public final int horsepower;

    
    public Car(String model, int horsepower) {
        this.model = model;  
        this.horsepower = horsepower;
    }

    
    public static void braking() {
        System.out.println("The vehicle is braking.");
    }

    
    public void accelerate() {
        System.out.println("The vehicle " + model + " is accelerating with " + horsepower + " horsepower.");
    }
}


