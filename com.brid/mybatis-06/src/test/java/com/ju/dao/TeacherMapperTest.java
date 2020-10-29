package com.ju.dao;

import com.ju.pojo.Teacher;
import com.ju.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class TeacherMapperTest {

    static Logger logger = Logger.getLogger(TeacherMapperTest.class);

    @Test
    public void testLog4j() {
        logger.info("info 进入了");
        logger.debug("debug 进入了");
        logger.error("error 进入了");
    }

    @Test
    public void testGetTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher1 = mapper.getTeacher(1);

        System.out.println(teacher1);


        sqlSession.close();
    }




}
