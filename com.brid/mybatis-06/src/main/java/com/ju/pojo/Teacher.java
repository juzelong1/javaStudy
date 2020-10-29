package com.ju.pojo;

import lombok.Data;

import java.util.List;

@Data      // get set
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
