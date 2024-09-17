// Cotxe.java
public class Cotxe {
    // Attributes
    public static final String marca = "Volkswagen"; // static final, cannot be changed
    public static String model; // static, can be changed, shared among all instances
    public final int potencia; // final, must be initialized in constructor, unique per instance

    // Constructor
    public Cotxe(String model, int potencia) {
        Cotxe.model = model; // Since model is static, it is shared between all instances
        this.potencia = potencia; // potencia is final, can only be set once per instance
    }

    // Static method
    public static void frenar() {
        System.out.println("El vehicle està frenant.");
    }

    // Non-static method
    public void accelerar() {
        System.out.println("El vehicle està accelerant.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Demonstrating the static final, static, and final attributes
        System.out.println("Marca: " + Cotxe.marca); // static final, directly accessible via class name

        // Creating two instances of Cotxe
        Cotxe cotxe1 = new Cotxe("Golf", 150); // model = "Golf", potencia = 150
        Cotxe cotxe2 = new Cotxe("Tiguan", 200); // model = "Tiguan", potencia = 200

        // Displaying model and potencia for both instances
        System.out.println("Cotxe 1 - Model: " + Cotxe.model + ", Potència: " + cotxe1.potencia);
        System.out.println("Cotxe 2 - Model: " + Cotxe.model + ", Potència: " + cotxe2.potencia);

        // Static method invocation (no need for an instance)
        Cotxe.frenar();

        // Non-static method invocation (requires an instance)
        cotxe1.accelerar(); // Calls accelerar on cotxe1
        cotxe2.accelerar(); // Calls accelerar on cotxe2
    }
}

