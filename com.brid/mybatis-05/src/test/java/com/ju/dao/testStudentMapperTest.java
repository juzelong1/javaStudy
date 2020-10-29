package com.ju.dao;

import com.ju.pojo.Student;
import com.ju.pojo.Teacher;
import com.ju.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class testStudentMapperTest {

    static Logger logger = Logger.getLogger(testStudentMapperTest.class);

    @Test
    public void testLog4j() {
        logger.info("info 进入了");
        logger.debug("debug 进入了");
        logger.error("error 进入了");
    }

    @Test
    public void testStudentList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudentList();

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();

    }

    @Test
    public void testGetStudentListWithTeacherName() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudentListWithTeacherName();

        for (Student student : students) {
            System.out.println(student);
        }

        sqlSession.close();

    }



}
