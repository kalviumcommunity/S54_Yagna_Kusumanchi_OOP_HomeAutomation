package project;

public class User {
    private String name; // Encapsulation
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Public getters
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void displayUserInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User Role: " + role);
    }
}
