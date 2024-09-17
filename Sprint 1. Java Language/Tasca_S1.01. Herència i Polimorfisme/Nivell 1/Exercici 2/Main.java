// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Marca: " + Cotxe.marca);

        // Create instances of Cotxe
        Cotxe cotxe1 = new Cotxe("Golf", 150);
        Cotxe cotxe2 = new Cotxe("Tiguan", 200);

        System.out.println("Cotxe 1 - Model: " + Cotxe.model + ", Potència: " + cotxe1.potencia);
        System.out.println("Cotxe 2 - Model: " + Cotxe.model + ", Potència: " + cotxe2.potencia);

        // Call static method
        Cotxe.frenar();

        // Call non-static method
        cotxe1.accelerar();
        cotxe2.accelerar();
    }
}

