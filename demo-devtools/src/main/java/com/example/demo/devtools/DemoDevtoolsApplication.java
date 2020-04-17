package com.example.demo.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoDevtoolsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoDevtoolsApplication.class, args);
        System.out.println("test");
        System.out.println("1234567");
        System.in.read();
    }

}
