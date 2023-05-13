package org.example.exception;

public class NotACarException extends RuntimeException{
    public NotACarException(String msg){
        super(msg);
    }
}
