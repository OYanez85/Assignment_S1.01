import java.util.ArrayList;

class Editor {
    private final String name;
    private final String dni;
    private ArrayList<News> newsList;

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.newsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public void addNews(News news) {
        newsList.add(news);
    }

    public boolean removeNews(String title) {
        return newsList.removeIf(news -> news.getHeadline().equals(title));
    }

    public ArrayList<News> getNewsList() {
        return newsList;
    }
}
