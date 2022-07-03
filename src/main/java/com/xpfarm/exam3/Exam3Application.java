package com.xpfarm.exam3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Exam3Application {
    public static void main(String[] args) {
        if(args.length > 0 && args[0].equals("run")) {
            System.out.println("CLI run");
        } else {
            System.out.println("REST run");
            SpringApplication.run(Exam3Application.class, args);
        }
    }
}
