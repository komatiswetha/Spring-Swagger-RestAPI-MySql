package com.example.SpringSwaggerREST.ServiceImplementation;

import com.example.SpringSwaggerREST.Model.User;
import com.example.SpringSwaggerREST.Repository.UserRepository;
import com.example.SpringSwaggerREST.Service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserInterface {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public void saveUser(User user) {

        userRepository.save(user);
    }

    public User updateUser(User user) {

        return userRepository.save(user);
    }


    public void deleteUser(int id) {
        userRepository.deleteById((long) id);
    }


    public List<User> findAllUsers() {

        return (List<User>) userRepository.findAll();
    }
}

