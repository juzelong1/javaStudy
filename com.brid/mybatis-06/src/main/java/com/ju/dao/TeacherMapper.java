package com.ju.dao;

import com.ju.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    Teacher getTeacher(@Param("id") int id);
}


