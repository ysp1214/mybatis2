package com.yt.mybatis.dao;

import com.yt.mybatis.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0
 * @auther杨甜
 */
public interface StudentDao {
    List<Student> getStudentByName(@Param("name") String name);
    List<Student> getStudentByMajor(@Param("name") String name,@Param("major") String major);
    List<Student> getStudentById();
    List<Student> findByList(@Param("ids") List<Integer> ids);
}
