package com.student.efrei.db.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor
public class Student implements Serializable {
    private @Id Long id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    private Integer age;

    public Student(Long id, String name, String email, LocalDate dateOfBirth, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }
}
