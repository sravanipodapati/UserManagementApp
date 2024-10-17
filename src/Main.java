import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserList userList = new UserList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Search User by ID");
            System.out.println("4. Display Users (sorted by name)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter user email: ");
                    String email = scanner.nextLine();

                    User user = new User(id, name, email);
                    userList.addUser(user);
                    break;

                case 2:
                    System.out.print("Enter user id to remove: ");
                    int removeId = scanner.nextInt();
                    userList.removeUser(removeId);
                    break;

                case 3:
                    System.out.print("Enter user id to search: ");
                    int searchId = scanner.nextInt();
                    User foundUser = userList.getUserById(searchId);
                    if (foundUser != null) {
                        System.out.println("User found: " + foundUser);
                    }
                    break;

                case 4:
                    System.out.println("Users sorted by name:");
                    userList.sortUsersByName();
                    userList.displayUsers();
                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
