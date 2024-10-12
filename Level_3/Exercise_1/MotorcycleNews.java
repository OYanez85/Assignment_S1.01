public class MotorcycleNews extends News {
    private String team;
    private boolean isHondaOrYamaha;

    
    public MotorcycleNews(String headline, String team) {
        super(headline);
        this.team = team;

        
        this.isHondaOrYamaha = team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha");
    }

    
    public MotorcycleNews(String headline, boolean isHondaOrYamaha) {
        super(headline);
        this.isHondaOrYamaha = isHondaOrYamaha;
    }

    @Override
    public double calculatePrice() {
        double price = 100; 

        
        if (isHondaOrYamaha) price += 50;

        return price;
    }

    
    @Override
    public int calculateScore() {
        int score = 3; 

        
        if (isHondaOrYamaha) score += 3;

        return score;
    }
}



 
