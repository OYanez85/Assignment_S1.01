import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Editor> editors = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            showMenu();
            option = scanner.nextInt();
            scanner.nextLine(); 
            switch (option) {
                case 1 -> addEditor();
                case 2 -> removeEditor();
                case 3 -> addNewsToEditor();
                case 4 -> removeNewsFromEditor();
                case 5 -> showNewsByEditor();
                case 6 -> calculateNewsScore();
                case 7 -> calculateNewsPrice();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    
    private static void showMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Add Editor");
        System.out.println("2. Remove Editor");
        System.out.println("3. Add News to Editor");
        System.out.println("4. Remove News from Editor");
        System.out.println("5. Show News by Editor");
        System.out.println("6. Calculate News Score");
        System.out.println("7. Calculate News Price");
        System.out.println("0. Exit");
    }

    
    private static void addEditor() {
        System.out.println("Enter editor's name:");
        String name = scanner.nextLine();

        System.out.println("Enter editor's DNI:");
        String dni = scanner.nextLine();  

        
        Editor newEditor = new Editor(name, dni);
        editors.add(newEditor);
        System.out.println("Editor added: " + name + " with DNI: " + dni);
    }

    
    private static void removeEditor() {
        System.out.println("Enter the editor's name to remove:");
        String name = scanner.nextLine();
        boolean removed = editors.removeIf(editor -> editor.getName().equals(name));
        if (removed) {
            System.out.println("Editor removed: " + name);
        } else {
            System.out.println("Editor not found.");
        }
    }

    
    private static void addNewsToEditor() {
        System.out.println("Enter editor's name to add news:");
        String name = scanner.nextLine();

        for (Editor editor : editors) {
            if (editor.getName().equals(name)) {
                System.out.println("Enter news title:");
                String title = scanner.nextLine();

                
                System.out.println("Enter type of news (1: Football, 2: Basketball, 3: Tennis, 4: Motorcycle, 5: F1):");
                int type = scanner.nextInt();
                scanner.nextLine(); 

                News news = null;
                switch (type) {
                    case 1 -> {
                        
                        System.out.println("Enter competition (e.g., Champions League):");
                        String competition = scanner.nextLine();
                        System.out.println("Enter club (e.g., Barça, Madrid):");
                        String club = scanner.nextLine();
                        System.out.println("Enter player (e.g., Ferran Torres, Benzema):");
                        String player = scanner.nextLine();
                        news = new FootballNews(title, competition, club, player);
                    }
                    case 2 -> {
                        
                        System.out.println("Is it Euroliga? (true/false):");
                        boolean isEuroliga = scanner.nextBoolean();
                        System.out.println("Is it Barça or Madrid? (true/false):");
                        boolean isBarcaOrMadrid = scanner.nextBoolean();
                        scanner.nextLine(); 
                        news = new BasketballNews(title, isEuroliga, isBarcaOrMadrid);
                    }
                    case 3 -> {
                        
                        System.out.println("Is it about a top player (Federer, Nadal, Djokovic)? (true/false):");
                        boolean isTopPlayer = scanner.nextBoolean();
                        scanner.nextLine(); 
                        news = new TennisNews(title, isTopPlayer);
                    }
                    case 4 -> {
                        
                        System.out.println("Is it Honda or Yamaha? (true/false):");
                        boolean isHondaOrYamaha = scanner.nextBoolean();
                        scanner.nextLine(); 
                        news = new MotorcycleNews(title, isHondaOrYamaha);
                    }
                    case 5 -> {
                        
                        System.out.println("Is it Ferrari or Mercedes? (true/false):");
                        boolean isFerrariOrMercedes = scanner.nextBoolean();
                        scanner.nextLine(); 
                        news = new F1News(title, isFerrariOrMercedes);
                    }
                    default -> System.out.println("Invalid news type.");
                }

                if (news != null) {
                    editor.addNews(news);
                    System.out.println("News added: " + title);
                }
                return;
            }
        }
        System.out.println("Editor not found.");
    }

    
    private static void removeNewsFromEditor() {
        System.out.println("Enter editor's name to remove news:");
        String name = scanner.nextLine();
        for (Editor editor : editors) {
            if (editor.getName().equals(name)) {
                System.out.println("Enter news title to remove:");
                String title = scanner.nextLine();
                boolean removed = editor.removeNews(title);
                if (removed) {
                    System.out.println("News removed: " + title);
                } else {
                    System.out.println("News not found.");
                }
                return;
            }
        }
        System.out.println("Editor not found.");
    }

    
    private static void showNewsByEditor() {
        System.out.println("Enter editor's name:");
        String name = scanner.nextLine();
        for (Editor editor : editors) {
            if (editor.getName().equals(name)) {
                System.out.println("News by " + name + ":");
                for (News news : editor.getNewsList()) {
                    System.out.println(news.getHeadline());
                }
                return;
            }
        }
        System.out.println("Editor not found.");
    }

    
    private static void calculateNewsScore() {
        System.out.println("Enter editor's name:");
        String name = scanner.nextLine();

        for (Editor editor : editors) {
            if (editor.getName().equals(name)) {
                int totalScore = 0;
                for (News news : editor.getNewsList()) {
                    totalScore += news.calculateScore();  
                }
                System.out.println("Total score of all news for " + name + ": " + totalScore);
                return;
            }
        }
        System.out.println("Editor not found.");
    }

    
    private static void calculateNewsPrice() {
        System.out.println("Enter editor's name:");
        String name = scanner.nextLine();

        for (Editor editor : editors) {
            if (editor.getName().equals(name)) {
                double totalPrice = 0;
                for (News news : editor.getNewsList()) {
                    totalPrice += news.calculatePrice();  
                }
                System.out.println("Total price of all news for " + name + ": $" + totalPrice);
                return;
            }
        }
        System.out.println("Editor not found.");
    }
}

 
