package main.java.hw3;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    protected List<User> loggedUsersList = new ArrayList<>();
    protected List<User> usersList = new ArrayList<>();

    public UserRepository(List<User> loggedUsersList, List<User> usersList) {
        this.loggedUsersList = loggedUsersList;
        this.usersList = usersList;
    }

    public List<User> getLoggedUsersList() {
        return loggedUsersList;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void addNewUser(User user) {
        usersList.add(user);
    }

    public void authenticate(String userName, String password) {
        User userFound = findByName(userName, usersList);
        if (userFound != null && userFound.getHashPassword().equals(password + "12ab")) {
            userFound.setAuthenticate(true);
            loggedUsersList.add(userFound);
        }
    }

    public User findByName(String username, List<User> dataList ) {
        for (User user : dataList) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void unloginAllUsersExceptAdmins() {
        int size = loggedUsersList.size();
        for (int i = 0; i < size; i++) {
            if (!loggedUsersList.get(i).isAdmin()) {
                loggedUsersList.get(i).setAuthenticate(false);
                loggedUsersList.remove(i);
            }
        }
    }
}