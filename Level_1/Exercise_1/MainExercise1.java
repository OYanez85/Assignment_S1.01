
public class MainExercise1 {
    public static void main(String[] args) {
        
        System.out.println("Before creating instances...");

        
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

        

        StringInstrument guitar = new StringInstrument("Guitar", 300.0);
        guitar.tocar();

        StringInstrument viola = new StringInstrument("Viola", 600.0);
        viola.tocar();

        StringInstrument violin = new StringInstrument("Violin", 500.0);
        violin.tocar();

        StringInstrument cello = new StringInstrument("Cello", 700.0);
        cello.tocar();

        StringInstrument doubleBass = new StringInstrument("doubleBass", 800.0);
        doubleBass.tocar();

        StringInstrument harp = new StringInstrument("Harp", 1000.0);
        harp.tocar();

        

        PercussionInstrument timpani = new PercussionInstrument("Timpani", 900.0);
        timpani.tocar();

        PercussionInstrument snaredrum = new PercussionInstrument("Snare drum", 150.0);
        snaredrum.tocar();

        PercussionInstrument bassdrum = new PercussionInstrument("Bass drum", 300.0);
        bassdrum.tocar();

        PercussionInstrument cymbal = new PercussionInstrument("Cymbals", 200.0);
        cymbal.tocar();

        PercussionInstrument triangle = new PercussionInstrument ("Triangle", 50.0);
        triangle.tocar();

        PercussionInstrument marimba = new PercussionInstrument ("Marimba", 600.0);
        marimba.tocar();
        
        PercussionInstrument drum = new PercussionInstrument("Drum", 200.0);
        drum.tocar();

        PercussionInstrument tambourine = new PercussionInstrument("Tambourine", 100.0);
        tambourine.tocar();

        PercussionInstrument gong = new PercussionInstrument("Gong", 400.0);
        gong.tocar();

        PercussionInstrument xylophone = new PercussionInstrument("Xylophone", 350.0);
        xylophone.tocar();
    }
}
