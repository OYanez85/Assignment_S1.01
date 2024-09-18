class MotorcycleNews extends News {
    private String team;

    public MotorcycleNews(String headline, String team) {
        super(headline);
        this.team = team;
    }

    @Override
    public double calculatePrice() {
        price = 100;
        if (team.equals("Honda") || team.equals("Yamaha")) price += 50;
        return price;
    }

    @Override
    public int calculateScore() {
        score = 3;
        if (team.equals("Honda") || team.equals("Yamaha")) score += 3;
        return score;
    }
}
 
