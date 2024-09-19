// Base class Telèfon
public class Telefon {
    private String marca;
    private String model;

    // Constructor to initialize the brand and model
    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    // Method to simulate making a phone call
    public void trucar(String numero) {
        System.out.println("S'està trucant al número: " + numero);
    }
}
