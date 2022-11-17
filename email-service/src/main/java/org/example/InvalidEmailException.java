package org.example;

public class InvalidEmailException extends RuntimeException{
    InvalidEmailException(String message ){
        super(message);
    }
}
