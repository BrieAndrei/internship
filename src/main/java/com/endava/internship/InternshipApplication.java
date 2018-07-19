package com.endava.internship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternshipApplication.class, args);
    }

    public static void doSomething() {
        if (1 == 1) {
            System.out.println("Quick math");
        }
    }
}
