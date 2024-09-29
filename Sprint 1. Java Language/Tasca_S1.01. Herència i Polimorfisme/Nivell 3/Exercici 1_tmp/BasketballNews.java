public class BasketballNews extends News {
    private boolean isEuroliga;
    private boolean isBarcaOrMadrid;

    // Constructor that takes headline, isEuroliga, and isBarcaOrMadrid as arguments
    public BasketballNews(String headline, boolean isEuroliga, boolean isBarcaOrMadrid) {
        super(headline);  // Call the constructor of the superclass News
        this.isEuroliga = isEuroliga;
        this.isBarcaOrMadrid = isBarcaOrMadrid;
    }

    @Override
    public double calculatePrice() {
        double price = 250; // Base price for basketball news
        if (isEuroliga) price += 75;
        if (isBarcaOrMadrid) price += 75;
        return price;
    }

    @Override
    public int calculateScore() {
        int score = 4; // Base score for basketball news
        if (isEuroliga) score += 3;
        if (isBarcaOrMadrid) score += 1;
        return score;
    }
}


