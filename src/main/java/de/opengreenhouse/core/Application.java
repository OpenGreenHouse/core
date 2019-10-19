package de.opengreenhouse.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = "de.opengreenhouse.core")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
