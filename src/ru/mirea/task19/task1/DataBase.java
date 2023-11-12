package ru.mirea.task19.task1;

import java.util.*;

public class DataBase {
    HashSet<User> users = new HashSet<>();

    public void addUser(User user) {
        users.add(user);
    }

    public DataBase(User ... users_set) {
        users.addAll(Arrays.asList(users_set));
    }

    public String findUserINN(String name) {
        for (User user:users) {
            if (Objects.equals(user.getName(), name)) {
                return user.getINN();
            }
        }
        throw new NoSuchElementException("No user with such name in database");
    }

    public boolean checkUserINN(String name, String INN) {
        if(Objects.equals(findUserINN(name), INN)) {
            return true;
        }
        throw new VerifyError("User INN is not valid");
    }
}
