
public abstract class News {
    protected String headline;

    public News(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    
    public abstract double calculatePrice();  

    public abstract int calculateScore();  
}  
