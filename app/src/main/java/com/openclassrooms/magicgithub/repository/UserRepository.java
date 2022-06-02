package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService; //

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {

        /* retourne la liste utilisateur */
        return this.apiService.getUsers();
    }

    public void generateRandomUser() {

        /* génère un utilisateur aléatoire à la liste */
        this.apiService.generateRandomUser();
    }

    public void deleteUser(User user) {

        /* supprime un utilisateur de la liste */
        this.apiService.deleteUser(user);
    }
}
