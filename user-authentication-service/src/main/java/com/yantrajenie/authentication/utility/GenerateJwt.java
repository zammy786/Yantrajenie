package com.yantrajenie.authentication.utility;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class GenerateJwt {

    //create a static method to return the token
    public static String getToken(String username){

        String sign = "loginkey for users";

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode(sign.getBytes());
        String s = new String(encode);
        Instant now = Instant.now();

        return Jwts.builder()
                .claim("username:", username)
                .setSubject(username)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(now.plus(5, ChronoUnit.MINUTES)))
                .signWith(
                SignatureAlgorithm.HS256,
                TextCodec.BASE64.decode(s)
                )
                .compact();
    }
}
