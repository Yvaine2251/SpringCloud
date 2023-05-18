package com.yvaine.repository;

import com.yvaine.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author Yvaine
 * @date 2023/05/17/19:56
 * @description
 */
public interface StudentRepository {
    public Collection<Student> findAll();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}
