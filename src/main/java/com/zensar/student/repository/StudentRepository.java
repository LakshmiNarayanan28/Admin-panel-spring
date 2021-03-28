package com.zensar.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.student.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

	
}
