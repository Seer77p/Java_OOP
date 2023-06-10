package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList<>();
    @Override
    public void saveUser(String name, String lastName, long moneyAmount) {
        users.add(new User(name,lastName,moneyAmount));


    }

    @Override
    public void deleteUser(int index) {
        users.remove(index);

    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
