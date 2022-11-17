package com.yantrajenie.authentication.services;

public class Validations {//use to validate all the credential given by the users via bloom rpc or postman or front end

    //validate password
    public static boolean validatePassword(String password){
        try{
            if(password.matches("^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$")){
                return true;
            }else{
                throw new InvalidArgumentException("Invalid email");
            }
        }catch (InvalidArgumentException e){
            e.printStackTrace();
            return false;
        }
    }

    //validate email
    public static boolean validateEmail(String email){
        try {
            if(email.matches("^[a-z0-9.]+@[A-Za-z0-9-]+[.][A-Za-z]{2,}$"))
                return true;

            else
                throw new InvalidArgumentException("Invalid Email");
        }catch (InvalidArgumentException e){
            System.out.println(e);
            return false;
        }
    }

    //Name validation for firstname, lastname, username
    public static boolean validateName(String name){
        try {
            if(name.matches("^[a-zA-Z]*$"))
                return true;
            else
                throw new InvalidArgumentException("Invalid Name");
        }catch (InvalidArgumentException e){
            System.out.println(e);
            return false;
        }
    }

    //contact no validation
    public static boolean validateContactNo(String mobile){
        try {
            if(mobile.matches("^[0-9]*$")){
                return true;
            }else {
                throw new InvalidArgumentException("Invalid mobile number");
            }
        }catch (InvalidArgumentException e){
            System.out.println(e);
            return false;
        }
    }
}
