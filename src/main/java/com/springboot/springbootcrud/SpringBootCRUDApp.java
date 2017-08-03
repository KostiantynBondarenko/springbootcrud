package com.springboot.springbootcrud;

import com.springboot.springbootcrud.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


//http://websystique.com/spring-boot/spring-boot-angularjs-spring-data-jpa-crud-app-example/

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.springboot"})
public class SpringBootCRUDApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCRUDApp.class, args);
    }
}
