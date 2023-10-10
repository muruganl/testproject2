package com.example.testproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Testproject2Application {

    public static void main(String[] args) {
        SpringApplication.run(Testproject2Application.class, args);
    }

}
