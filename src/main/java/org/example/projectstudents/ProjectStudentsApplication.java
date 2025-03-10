package org.example.projectstudents;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ProjectStudentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectStudentsApplication.class, args);
    }

}
