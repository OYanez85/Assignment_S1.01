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

// Wind instrument class
class WindInstrument extends Instrument {
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    // Implement the abstract tocar() method
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
    
    // Static block for class loading demonstration
    static {
        System.out.println("WindInstrument class loaded.");
    }
}

// String instrument class
class StringInstrument extends Instrument {
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    // Implement the abstract tocar() method
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }

    static {
        System.out.println("StringInstrument class loaded.");
    }
}

// Percussion instrument class
class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    // Implement the abstract tocar() method
    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }

    static {
        System.out.println("PercussionInstrument class loaded.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Static block demo: Access a static member to trigger class loading
        System.out.println("Before creating instances...");

        // Create instances of different instruments
        WindInstrument flute = new WindInstrument("Flute", 150.0);
        flute.tocar();

        StringInstrument guitar = new StringInstrument("Guitar", 300.0);
        guitar.tocar();

        PercussionInstrument drum = new PercussionInstrument("Drum", 200.0);
        drum.tocar();
    }
}
