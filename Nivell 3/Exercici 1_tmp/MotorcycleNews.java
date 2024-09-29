public class MotorcycleNews extends News {
    private String team;
    private boolean isHondaOrYamaha;

    // Constructor that takes a String team and initializes the boolean flag
    public MotorcycleNews(String headline, String team) {
        super(headline);
        this.team = team;

        // Initialize the boolean flag based on the team name
        this.isHondaOrYamaha = team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha");
    }

    // Constructor that takes a boolean flag directly
    public MotorcycleNews(String headline, boolean isHondaOrYamaha) {
        super(headline);
        this.isHondaOrYamaha = isHondaOrYamaha;
    }

    @Override
    public double calculatePrice() {
        double price = 100; // Base price for Motorcycle news

        // Use the boolean flag to determine if we add extra price for Honda/Yamaha
        if (isHondaOrYamaha) price += 50;

        return price;
    }

    // Rename this method to match the abstract method in the News class
    @Override
    public int calculateScore() {
        int score = 3; // Base score for Motorcycle news

        // Use the boolean flag to determine if we add extra score for Honda/Yamaha
        if (isHondaOrYamaha) score += 3;

        return score;
    }
}



 
