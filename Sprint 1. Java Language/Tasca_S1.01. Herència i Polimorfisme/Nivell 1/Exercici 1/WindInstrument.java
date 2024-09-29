
class WindInstrument extends Instrument {
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    
    @Override
    public void tocar() {
        System.out.println("A wind instrument is playing.");
    }
    
    
    static {
        System.out.println("WindInstrument class loaded.");
    }
}
