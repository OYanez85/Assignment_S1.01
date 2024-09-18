// Wind instrument class
class WindInstrument extends Instrument {
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    // Implement the abstract tocar() method
    @Override
    public void tocar() {
        System.out.println("A wind instrument is playing.");
    }
    
    // Static block for class loading demonstration
    static {
        System.out.println("WindInstrument class loaded.");
    }
}
