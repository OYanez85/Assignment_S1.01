// Smartphone class that extends Telèfon and implements Camera and Rellotge
public class Smartphone extends Telefon implements Camera, Rellotge {

    // Constructor that calls the superclass constructor
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    // Implementing the fotografiar method from Camera interface
    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    // Implementing the alarma method from Rellotge interface
    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }
}
