public class BasketballNews extends News {
    private boolean isEuroliga;
    private boolean isBarcaOrMadrid;

    
    public BasketballNews(String headline, boolean isEuroliga, boolean isBarcaOrMadrid) {
        super(headline);  
        this.isEuroliga = isEuroliga;
        this.isBarcaOrMadrid = isBarcaOrMadrid;
    }

    @Override
    public double calculatePrice() {
        double price = 250; 
        if (isEuroliga) price += 75;
        if (isBarcaOrMadrid) price += 75;
        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; 
        if (isEuroliga) score += 3;
        if (isBarcaOrMadrid) score += 1;
        return score;
    }
}


