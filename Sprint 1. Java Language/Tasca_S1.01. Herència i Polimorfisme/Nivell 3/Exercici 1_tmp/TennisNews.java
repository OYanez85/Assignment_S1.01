class TennisNews extends News {
    private String competition;
    private String player;

    public TennisNews(String headline, String competition, String player) {
        super(headline);
        this.competition = competition;
        this.player = player;
    }

    @Override
    public double calculatePrice() {
        price = 150;
        if (player.equals("Federer") || player.equals("Nadal") || player.equals("Djokovic")) price += 100;
        return price;
    }

    @Override
    public int calculateScore() {
        score = 4;
        if (player.equals("Federer") || player.equals("Nadal") || player.equals("Djokovic")) score += 3;
        return score;
    }
} 
