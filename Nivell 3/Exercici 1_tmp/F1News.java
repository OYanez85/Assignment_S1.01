public class F1News extends News {
    private String team;
    private boolean isFerrariOrMercedes;

    
    public F1News(String headline, String team) {
        super(headline);
        this.team = team;

        
        this.isFerrariOrMercedes = team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes");
    }

    
    public F1News(String headline, boolean isFerrariOrMercedes) {
        super(headline);
        this.isFerrariOrMercedes = isFerrariOrMercedes;
    }

    @Override
    public double calculatePrice() {
        double price = 100; 

        
        if (isFerrariOrMercedes) price += 50;

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; 

        
        if (isFerrariOrMercedes) score += 2;

        return score;
    }
}


 
