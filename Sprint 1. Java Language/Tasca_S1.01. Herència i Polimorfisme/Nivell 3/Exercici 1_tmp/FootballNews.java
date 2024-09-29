public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;
    private boolean isChampionsLeague;
    private boolean isBarcaOrMadrid;
    private boolean isFerranOrBenzema;

    // Constructor for String inputs
    public FootballNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;

        // Initialize boolean flags based on the values of the String inputs
        this.isChampionsLeague = competition.equalsIgnoreCase("Champions League");
        this.isBarcaOrMadrid = club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid");
        this.isFerranOrBenzema = player.equalsIgnoreCase("Ferran Torres") || player.equalsIgnoreCase("Benzema");
    }

    // Constructor for boolean inputs
    public FootballNews(String headline, boolean isChampionsLeague, boolean isBarcaOrMadrid, boolean isFerranOrBenzema) {
        super(headline);
        this.isChampionsLeague = isChampionsLeague;
        this.isBarcaOrMadrid = isBarcaOrMadrid;
        this.isFerranOrBenzema = isFerranOrBenzema;
    }

    @Override
    public double calculatePrice() {
        double price = 300; // Base price for football news

        // Use boolean flags to adjust the price
        if (isChampionsLeague) price += 100;
        if (isBarcaOrMadrid) price += 100;
        if (isFerranOrBenzema) price += 50;

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 5; // Base score for football news

        // Use boolean flags to adjust the score
        if (isChampionsLeague) score += 3;
        if (isBarcaOrMadrid) score += 1;
        if (isFerranOrBenzema) score += 1;

        return score;
    }
}

