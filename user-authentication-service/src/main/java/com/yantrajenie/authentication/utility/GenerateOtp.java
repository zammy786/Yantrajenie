package com.yantrajenie.authentication.utility;

import java.util.function.Supplier;

public class GenerateOtp {

    //to generate the otp using supplier
    public static String getOtp(){
        //random class to generate the otp
        Supplier<String> otps = () -> {
            String otp = "";
            for(int i=0;i<6;i++){
                otp = otp + (int)(Math.random()*10);
            }
            return otp;
        };

        String otp = otps.get();
        return otp;
    }
}
