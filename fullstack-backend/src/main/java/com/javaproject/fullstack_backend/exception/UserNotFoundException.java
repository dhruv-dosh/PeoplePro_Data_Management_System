package com.javaproject.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Invalid Id "+id);
    }
}
