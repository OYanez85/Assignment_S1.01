abstract class News {
    protected String headline;
    protected String text = "";
    protected double price;
    protected int score;

    public News(String headline) {
        this.headline = headline;
    }

    public abstract double calculatePrice();
    public abstract int calculateScore();

    public String getHeadline() {
        return headline;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
} 
