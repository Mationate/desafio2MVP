package com.mationate.desafio2mvp;

public class PasswordValidation {
    
    private PasswordCallback callback;

    public PasswordValidation(PasswordCallback callback) {
        this.callback = callback;
    }

    public void isValidated(String password){
        if (password.trim().length()>8){
            callback.validated();
        }else {
            callback.denegated();
        }
    
    }
    
}
