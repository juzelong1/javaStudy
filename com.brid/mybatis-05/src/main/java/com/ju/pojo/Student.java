package com.ju.pojo;

import lombok.Data;

@Data      // get set
public class Student {
    private int id;
    private String name;

    private Teacher teacher;
}
