package main.java.hw3;

public class User {

    private final String name;
    private String hashPassword;
    private boolean isAdmin;
    private boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.hashPassword = password + "12ab";
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean authenticate) {
        isAuthenticate = authenticate;
    }
}