package com.pentasoft.university_spring_boot_project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Boolean mandatory;
    private int credits;
    private int duration;

    @ManyToOne
    private Department department;

    @ManyToOne
    private Professor professor;

    @ManyToMany(mappedBy = "enrolledCourses")
    private List<Student> students;
}
