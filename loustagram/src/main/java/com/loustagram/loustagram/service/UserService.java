package com.loustagram.loustagram.service;
import com.loustagram.loustagram.entity.User;
import com.loustagram.loustagram.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public User getUserbyUsername(String username){
        return repository.findByUsername(username);
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "Product Removed" + id;
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setUsername(user.getUsername());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setBio(user.getBio());
        existingUser.setPassword(user.getPassword());
        return repository.save(existingUser);
    }
    
}
