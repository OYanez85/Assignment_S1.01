public class TennisNews extends News {
    private String competition;
    private String player;
    private boolean isTopPlayer;

    // Constructor for String inputs (competition and player)
    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;

        // Initialize the boolean based on the player
        this.isTopPlayer = player.equalsIgnoreCase("Federer") ||
                player.equalsIgnoreCase("Nadal") ||
                player.equalsIgnoreCase("Djokovic");
    }

    // Constructor for boolean input (isTopPlayer)
    public TennisNews(String headline, boolean isTopPlayer) {
        super(headline);
        this.isTopPlayer = isTopPlayer;
    }

    @Override
    public double calculatePrice() {
        double price = 150; // Base price for tennis news
        if (isTopPlayer) price += 100;
        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; // Base score for tennis news
        if (isTopPlayer) score += 3;
        return score;
    }
}


