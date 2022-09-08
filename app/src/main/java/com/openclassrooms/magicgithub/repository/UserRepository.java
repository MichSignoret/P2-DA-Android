package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser
    private List<User> userList;

    public UserRepository(ApiService apiService) {

        this.apiService = apiService;
    }

    public List<User> getUsers() {
        userList = apiService.getUsers();
        return userList;
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        apiService.deleteUser(user);
    }
}
