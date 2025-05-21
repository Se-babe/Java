import java.util.Scanner;

public class Clients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mathematics Competition System");
        
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Register");
            System.out.println("2. View Challenges");
            System.out.println("3. Attempt Challenge");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    viewChallenges();
                    break;
                case 3:
                    attemptChallenge(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static void register(Scanner scanner) {
        // Implement registration logic here
    }
    
    private static void viewChallenges() {
        // Implement view challenges logic here
    }
    
    private static void attemptChallenge(Scanner scanner) {
        // Implement attempt challenge logic here
    }
}
