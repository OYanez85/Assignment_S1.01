// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Static block demo: Access a static member to trigger class loading
        System.out.println("Before creating instances...");

        // Create instances of different wind instruments
        WindInstrument flute = new WindInstrument("Flute", 150.0);
        flute.tocar();

        WindInstrument clarinet = new WindInstrument("Clarinet", 150.0);
        clarinet.tocar();

        WindInstrument oboe = new WindInstrument("Oboe", 300.0);
        oboe.tocar();

        WindInstrument bassoon = new WindInstrument("Bassoon", 450.0);
        bassoon.tocar();

        WindInstrument trumpet = new WindInstrument("Trumpet", 250.0);
        trumpet.tocar();

        WindInstrument trombone = new WindInstrument("Trombone", 350.0);
        trombone.tocar();

        WindInstrument frenchHorn = new WindInstrument("French Horn", 500.0);
        frenchHorn.tocar();

        WindInstrument tuba = new WindInstrument("Tuba", 700.0);
        tuba.tocar();

        WindInstrument saxophone = new WindInstrument("Saxophone", 400.0);
        saxophone.tocar();

        // Create instances of different string instruments
        StringInstrument guitar = new StringInstrument("Guitar", 300.0);
        guitar.tocar();

        StringInstrument violin = new StringInstrument("Violin", 500.0);
        violin.tocar();

        StringInstrument cello = new StringInstrument("Cello", 700.0);
        cello.tocar();

        // Create instances of different percussion instruments
        PercussionInstrument drum = new PercussionInstrument("Drum", 200.0);
        drum.tocar();

        PercussionInstrument tambourine = new PercussionInstrument("Tambourine", 100.0);
        tambourine.tocar();

        PercussionInstrument xylophone = new PercussionInstrument("Xylophone", 350.0);
        xylophone.tocar();
    }
}
