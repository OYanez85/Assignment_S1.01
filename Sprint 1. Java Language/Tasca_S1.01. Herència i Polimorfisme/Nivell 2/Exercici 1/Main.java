// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create a Smartphone object
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        // Call the trucar method
        smartphone.trucar("123-456-789");

        // Call the fotografiar method
        smartphone.fotografiar();

        // Call the alarma method
        smartphone.alarma();
    }
}
