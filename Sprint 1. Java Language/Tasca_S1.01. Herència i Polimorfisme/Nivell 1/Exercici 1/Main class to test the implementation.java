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
