import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "Female", "Toronto", "Ontario", "Canada");
        User user = new User(person);
        Employee employee = new Employee(person);
        Admin admin = new Admin(person);
        Credentials credentials = new Credentials();

        // Created a HashMap to store role mappings
        HashMap<String, Methods> roleMap = new HashMap<>();
        roleMap.put("User", user);
        roleMap.put("Employee", employee);
        roleMap.put("Admin", admin);

        int choice;
        boolean valid = true;
        String role = "";
        boolean correct;
        boolean redo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my User Management System\n");
        
        System.out.println("Select a role:");

        do {
            System.out.println("1. User\n2. Employee\n3. Admin\n");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    role = "User";
                    break;
                case 2:
                    role = "Employee";
                    break;
                case 3:
                    role = "Admin";
                    break;
                default:
                    valid = false;
                    break;
            }

            if (!valid) {
                System.out.println("Invalid selection. Please select one of the following roles:");
            }
        } while (!valid);

        System.out.println("\nYou selected: " + role + " role");

        
        do {
            System.out.println("\nEnter your username:");
            String username = scanner.nextLine();

            System.out.println("\nEnter your password:");
            String password = scanner.nextLine();

            correct = credentials.checkCredentials(role, username, password);
            redo = false;

            if (!correct) {
                System.out.println("\nInvalid username or password");
                redo = credentials.passwordRestart();
            }

        } while (redo);
        

        // Retrieving the object based on the selected role
        Methods selectedRole = roleMap.get(role);

        if (selectedRole != null) {
            System.out.println("\nWhat would you like to do?\n1. Change name\n2. View total number of users\n3. View total number of employees\n");

            choice = scanner.nextInt();
            scanner.nextLine();

            // Testing method accessibility with switch. eg. user should not be able to access methods in cases 2 and 3
            switch(choice) {
                case 1:
                    System.out.println("\nEnter a name:");
                    String name = scanner.nextLine();
                    selectedRole.setName(name);
                    break;
                case 2:
                    selectedRole.getUserStatus();
                    break;
                case 3:
                    selectedRole.getTotalEmployees();
                    break;
                default:

            }
            
        }    
        scanner.close();
    }
}
