package com.efrei.db;

import com.efrei.db.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class DbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L, "Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.APRIL, 5), 21
                )
        );
    }

}
