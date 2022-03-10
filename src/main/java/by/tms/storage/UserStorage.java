package by.tms.storage;

import by.tms.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private final List<User> users = new ArrayList<>();

    public void save (User user) {
        users.add(user);
    }

    public User findByLogin(String login) {


//        User user1 = users.stream().filter(user -> user.getLogin().equals(login)).findFirst().get();
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public boolean isExistsByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }
        return false;
    }


}
