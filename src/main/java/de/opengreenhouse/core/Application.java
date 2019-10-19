package de.opengreenhouse.core;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAdminServer
@EnableScheduling
@SpringBootApplication(scanBasePackages = "de.opengreenhouse.core")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
