
class StringInstrument extends Instrument {
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    
    @Override
    public void tocar() {
        System.out.println("A string instrument is playing.");
    }

    static {
        System.out.println("StringInstrument class loaded.");
    }
}
