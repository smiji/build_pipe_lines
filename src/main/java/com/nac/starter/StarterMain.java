package com.nac.starter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterMain implements CommandLineRunner {
    public static void main(String[] args) {
        System.out.println("Hello world! before");
        SpringApplication.run(StarterMain.class, args);
        System.out.println("Hello world! after");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started..");
    }
}