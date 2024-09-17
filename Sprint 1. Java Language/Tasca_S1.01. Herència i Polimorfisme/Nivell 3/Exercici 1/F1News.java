class F1News extends News {
    private String team;

    public F1News(String headline, String team) {
        super(headline);
        this.team = team;
    }

    @Override
    public double calculatePrice() {
        price = 100;
        if (team.equals("Ferrari") || team.equals("Mercedes")) price += 50;
        return price;
    }

    @Override
    public int calculateScore() {
        score = 4;
        if (team.equals("Ferrari") || team.equals("Mercedes")) score += 2;
        return score;
    }
}
 
