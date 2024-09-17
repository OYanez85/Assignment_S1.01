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
