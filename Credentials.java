import java.util.Scanner;
import java.util.HashMap;

public class Credentials {
    boolean valid = true;
    Scanner scanner = new Scanner(System.in);

    HashMap<String, String> user = new HashMap<>();
    HashMap<String, String> employee = new HashMap<>();
    HashMap<String, String> admin = new HashMap<>();

    // Constructor to initialize HashMaps
    public Credentials() {
        user.put("user1", "password123");
        user.put("guest", "guestPass");

        employee.put("employee1", "empPass123");
        employee.put("worker", "workPass");

        admin.put("admin", "admin@2024");
        admin.put("superadmin", "superSecure");
    }

    // Method to check credentials
    public boolean checkCredentials(String role, String username, String password) {
        HashMap<String, String> selectedMap;

        // Switch for choosing the correct HashMap based on role
        switch (role.toLowerCase()) {
            case "user":
                selectedMap = user;
                break;
            case "employee":
                selectedMap = employee;
                break;
            case "admin":
                selectedMap = admin;
            default:
            return false;
        }

        return selectedMap.containsKey(username) && selectedMap.get(username).equals(password);
    }


    // Method to restart credential prompts
    public boolean passwordRestart () {
        boolean redo = false;
        boolean valid = true;

        
            System.out.println("\nWould you like to try again?\n0. No\n1. Yes\n");
            
        do {
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("\nExiting program...");
                    
                    System.exit(0);
                    break;
                case 1:
                    redo = true;
                    break;
                default:
                    System.out.println("\nInvalid selection. Enter either 0 or 1\n");
                    valid = false;
            }
        } while (!valid);

        return redo;
        
    }
}