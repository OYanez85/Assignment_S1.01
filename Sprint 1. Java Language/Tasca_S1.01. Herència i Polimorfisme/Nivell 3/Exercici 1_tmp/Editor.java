import java.util.ArrayList;

class Editor {
    private final String name;
    private final String dni;
    private static double salary = 1500;
    private ArrayList<News> newsList;

    public Editor(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.newsList = new ArrayList<>();
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double newSalary) {
        salary = newSalary;
    }

    public void addNews(News news) {
        newsList.add(news);
    }

    public void removeNews(String headline) {
        newsList.removeIf(news -> news.getHeadline().equals(headline));
    }

    public void showNews() {
        for (News news : newsList) {
            System.out.println(news.getHeadline());
        }
    }

    public News getNewsByTitle(String headline) {
        for (News news : newsList) {
            if (news.getHeadline().equals(headline)) {
                return news;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }
}
 
