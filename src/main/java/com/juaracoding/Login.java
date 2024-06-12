package com.juaracoding;

public class Login {

    public boolean isLogin(String username, String password){

        boolean isLogin = username.equals("farhan") && password.equals("123");
        if (isLogin){
            return true;
        } else {
            return false;
        }
    }

}
