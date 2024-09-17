class FootballNews extends News {
    private String competition;
    private String club;
    private String player;

    public FootballNews(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public double calculatePrice() {
        price = 300;
        if (competition.equals("Champions League")) price += 100;
        if (club.equals("Barça") || club.equals("Madrid")) price += 100;
        if (player.equals("Ferran Torres") || player.equals("Benzema")) price += 50;
        return price;
    }

    @Override
    public int calculateScore() {
        score = 5;
        if (competition.equals("Champions League")) score += 3;
        if (club.equals("Barça") || club.equals("Madrid")) score += 1;
        if (player.equals("Ferran Torres") || player.equals("Benzema")) score += 1;
        return score;
    }
} 
