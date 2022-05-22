package com.ufcg.backend.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Config {

    public static String secret;

    @Autowired
    public Config(Environment environment){
        secret = environment.getProperty("app.secret");
    }
}

