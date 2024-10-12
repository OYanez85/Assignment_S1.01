public class FootballNews extends News {
    private String competition;
    private String club;
    private String player;
    private boolean isChampionsLeague;
    private boolean isBarcaOrMadrid;
    private boolean isFerrariOrBenzema;

    private static final double CHAMPIONS_LEAGUE_PRICE = 100;
    private static final double BARCA_OR_MADRID_PRICE = 100;
    private static final double BENZEMA_PRICE = 50;

    public FootballNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
        this.isChampionsLeague = competition.equalsIgnoreCase("Champions League");
        this.isBarcaOrMadrid = club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Real Madrid");
        this.isFerrariOrBenzema = player.equalsIgnoreCase("Ferrari Torres") || player.equalsIgnoreCase("Benzema");
    }

    public FootballNews(String headline, boolean isChampionsLeague, boolean isBarcaOrMadrid, boolean isFerrariOrBenzema) {
        super(headline);
        this.isChampionsLeague = isChampionsLeague;
        this.isBarcaOrMadrid = isBarcaOrMadrid;
        this.isFerrariOrBenzema = isFerrariOrBenzema;
    }

    @Override
    public double calculatePrice() {
        double price = 300;
        if (isChampionsLeague) price += CHAMPIONS_LEAGUE_PRICE;
        if (isBarcaOrMadrid) price += BARCA_OR_MADRID_PRICE;
        if (isFerrariOrBenzema) price += BENZEMA_PRICE;
        return price;
    }

    @Override
    public int calculateScore() {
        int score = 5;
        if (isChampionsLeague) score += 3;
        if (isBarcaOrMadrid) score += 1;
        if (isFerrariOrBenzema) score += 1;
        return score;
    }
}
