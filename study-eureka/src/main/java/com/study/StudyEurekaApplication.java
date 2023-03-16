package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xkw
 * @since 2023/3/14 17:32
 */
@EnableEurekaServer
@SpringBootApplication
public class StudyEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyEurekaApplication.class, args);
    }
}
