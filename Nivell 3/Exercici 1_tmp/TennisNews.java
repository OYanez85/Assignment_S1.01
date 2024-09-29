public class TennisNews extends News {
    private String competition;
    private String player;
    private boolean isTopPlayer;

    
    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;

        
        this.isTopPlayer = player.equalsIgnoreCase("Federer") ||
                player.equalsIgnoreCase("Nadal") ||
                player.equalsIgnoreCase("Djokovic");
    }

    
    public TennisNews(String headline, boolean isTopPlayer) {
        super(headline);
        this.isTopPlayer = isTopPlayer;
    }

    @Override
    public double calculatePrice() {
        double price = 150; 
        if (isTopPlayer) price += 100;
        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; 
        if (isTopPlayer) score += 3;
        return score;
    }
}


