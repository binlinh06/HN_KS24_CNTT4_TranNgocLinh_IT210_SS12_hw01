package org.example.it210_ss12_hw01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class It210Ss12Hw01Application {

    public static void main(String[] args) {
        SpringApplication.run(It210Ss12Hw01Application.class, args);
        System.out.println("Hospital Web Service is ready on Embedded Tomcat!");
    }

}
