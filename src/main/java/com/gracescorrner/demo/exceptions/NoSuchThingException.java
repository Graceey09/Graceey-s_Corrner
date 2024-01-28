package com.gracescorrner.demo.exceptions;

public class NoSuchThingException extends RuntimeException{
    public NoSuchThingException(String message){
        super(message);
    }
}
