package com.ju.dao;

import com.ju.pojo.Student;
import com.ju.pojo.Teacher;

import java.util.List;

public interface StudentMapper {
    List<Student> getStudentList();

    List<Student> getStudentListWithTeacherName();
}


