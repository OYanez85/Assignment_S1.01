public class F1News extends News {
    private String team;
    private boolean isFerrariOrMercedes;

    // Constructor that takes a String team and initializes the boolean flag
    public F1News(String headline, String team) {
        super(headline);
        this.team = team;

        // Initialize the boolean flag based on the team name
        this.isFerrariOrMercedes = team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes");
    }

    // Constructor that takes a boolean flag directly
    public F1News(String headline, boolean isFerrariOrMercedes) {
        super(headline);
        this.isFerrariOrMercedes = isFerrariOrMercedes;
    }

    @Override
    public double calculatePrice() {
        double price = 100; // Base price for F1 news

        // Use the boolean flag to determine the price
        if (isFerrariOrMercedes) price += 50;

        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; // Base score for F1 news

        // Use the boolean flag to determine the score
        if (isFerrariOrMercedes) score += 2;

        return score;
    }
}


 
