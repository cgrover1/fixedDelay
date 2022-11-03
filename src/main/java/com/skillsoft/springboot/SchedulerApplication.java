package com.skillsoft.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("The application started at: " + dateFormat.format(new Date()));
        SpringApplication.run(SchedulerApplication.class, args);
    }
}
