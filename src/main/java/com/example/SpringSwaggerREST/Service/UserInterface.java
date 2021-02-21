package com.example.SpringSwaggerREST.Service;

import com.example.SpringSwaggerREST.Model.User;

import java.util.List;

public interface UserInterface {
    // to save login details
    void  saveUser(User user);

    // to update login values
    User updateUser(User user);

    // to delete login values
    void  deleteUser(int id);

    //to fetch all login values
    List<User> findAllUsers();

}
