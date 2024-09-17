// Abstract class Instrument
abstract class Instrument {
    protected String name;
    protected double price;

    // Constructor to initialize name and price
    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract void tocar();
    
    // Static block to demonstrate class loading and initialization
    static {
        System.out.println("Instrument class loaded.");
    }

    // Non-static initialization block (executed before the constructor)
    {
        System.out.println("An instance of Instrument is being created.");
    }
}
