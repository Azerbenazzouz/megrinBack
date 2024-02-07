package com.azer.megrinBack.exception;

public class EmailExist extends RuntimeException{
    public EmailExist(String message) {
        super(message);
    }
}
