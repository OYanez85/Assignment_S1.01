// Cotxe.java
public class Cotxe {
    // Attributes
    public static final String marca = "Volkswagen";
    public static String model;
    public final int potencia;

    // Constructor
    public Cotxe(String model, int potencia) {
        Cotxe.model = model;
        this.potencia = potencia;
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

