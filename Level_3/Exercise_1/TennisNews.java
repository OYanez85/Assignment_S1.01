public class TennisNews extends News {
    private String competition;
    private String player;
    private boolean isTopPlayer;

    // Constants for top players
    private static final String[] TOP_PLAYERS = {"Federer", "Nadal", "Djokovic"};
    
    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
        this.isTopPlayer = determineTopPlayer(player);
    }

    public TennisNews(String headline, boolean isTopPlayer) {
        super(headline);
        this.isTopPlayer = isTopPlayer;
    }

    private boolean determineTopPlayer(String player) {
        for (String topPlayer : TOP_PLAYERS) {
            if (player.equalsIgnoreCase(topPlayer)) {
                return true;
            }
        }
        return false;
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
