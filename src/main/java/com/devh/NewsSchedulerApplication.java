package com.devh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewsSchedulerApplication {

    public static void main(String[] args) {
        /* Start as non-web applications */
        SpringApplication app = new SpringApplication(NewsSchedulerApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
//        SpringApplication.run(NewsSchedulerApplication.class, args);
    }

}
