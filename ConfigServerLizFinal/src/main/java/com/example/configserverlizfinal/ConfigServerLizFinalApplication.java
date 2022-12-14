package com.example.configserverlizfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerLizFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerLizFinalApplication.class, args);
    }

}
