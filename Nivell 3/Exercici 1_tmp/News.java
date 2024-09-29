// News.java
public abstract class News {
    protected String headline;

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    // Rename the abstract methods to use the English naming convention
    public abstract double calculatePrice();  // Changed from calcularPreuNoticia to calculatePrice

    public abstract int calculateScore();  // Changed from calcularPuntuacioNoticia to calculateScore
}  // Add this closing brace to complete the class
