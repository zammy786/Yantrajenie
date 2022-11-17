package com.yantrajenie.authentication.services;

public class InvalidArgumentException extends RuntimeException{
    InvalidArgumentException(String message){
        super(message);
    }
}
