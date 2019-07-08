package com.candres.java11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java11Application {

    public static void main(String[] args) {
        SpringApplication.run(Java11Application.class, args);

        var prueba = "prueba";
        var repeat = prueba.repeat(3);
        System.out.println(repeat);
    }

}