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
            scanner.nextLine(); // Clear buffer
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

    public static void showMenu() {
        System.out.println("1. Add Editor");
        System.out.println("2. Remove Editor");
        System.out.println("3. Add News to Editor");
        System.out.println("4. Remove News");
        System.out.println("5. Show News by Editor");
        System.out.println("6. Calculate News Score");
        System.out.println("7. Calculate News Price");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    // Implement the methods like addEditor(), removeEditor(), addNewsToEditor(), etc.
    // These methods should handle creating editors and news, as well as performing the necessary actions on them.
}
 
