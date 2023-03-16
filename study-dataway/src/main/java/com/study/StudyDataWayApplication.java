package com.study;

import net.hasor.spring.boot.EnableHasor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xkw
 * @since 2023/3/15 10:58
 */
@EnableHasor
//@EnableHasorWeb()
@EnableEurekaClient
@SpringBootApplication
public class StudyDataWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyDataWayApplication.class, args);
    }
}
