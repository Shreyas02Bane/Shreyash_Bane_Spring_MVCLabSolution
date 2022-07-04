package com.greatlearning.springcrud.service;

import java.util.List;

import com.greatlearning.springcrud.entity.Student;



public interface IStudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

}
