package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
