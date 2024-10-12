
abstract class Instrument {
    protected String name;
    protected double price;

    
    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    public abstract void tocar();
    
    
    static {
        System.out.println("Instrument class loaded.");
    }

    
    {
        System.out.println("An instance of Instrument is being created.");
    }
}
