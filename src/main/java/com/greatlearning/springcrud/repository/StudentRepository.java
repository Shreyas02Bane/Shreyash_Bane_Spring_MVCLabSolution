package com.greatlearning.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.springcrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}