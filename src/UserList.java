import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserList {
    private List<User> users;

    // Constructor
    public UserList() {
        this.users = new ArrayList<>();
    }

    // Add a new user
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    // Remove a user by id
    public boolean removeUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                System.out.println("User removed: " + user);
                return true;
            }
        }
        System.out.println("User with id " + id + " not found.");
        return false;
    }

    // Retrieve a user by id
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        System.out.println("User with id " + id + " not found.");
        return null;
    }

    // Sort users by name
    public void sortUsersByName() {
        Collections.sort(users, Comparator.comparing(User::getName));
    }

    // Display all users
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users to display.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}

