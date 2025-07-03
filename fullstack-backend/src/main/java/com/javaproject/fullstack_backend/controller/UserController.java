package com.javaproject.fullstack_backend.controller;

import com.javaproject.fullstack_backend.model.User;
import com.javaproject.fullstack_backend.exception.UserNotFoundException;
import com.javaproject.fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//file use to push data into database
@RestController
@CrossOrigin("http://localhost:3000") //code to connect frontend and backend
public class UserController {
    @Autowired //used to inject UserRepository interface aswell
    private UserRepository userRepository;

    //for posting the data
    @PostMapping("/user") // here user is path used in postman
    User newUser(@RequestBody User newUser){
       return userRepository.save(newUser); //returning saved data. post the data and return data which is posted
    }

    //Now we write code for get data from database
    @GetMapping("/users")
    List<User> getAllUsres(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser,@PathVariable Long id){
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deletuser(@PathVariable Long id){
        if (!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id " +id+ "has been deleted success.";
    }
}
