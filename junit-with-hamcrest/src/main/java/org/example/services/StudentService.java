package org.example.services;

import java.util.List;


import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentService {

	private StudentRepository repo;
	
	public Student add(Student entity) {
		return this.repo.add(entity);
	}
	public List<Student> findAll(){
		return this.repo.findAll();
	}
	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}
	public int findStudentSize() {
		return this.repo.findAll().size();
	}
	public Student addWithRollNumCompare(Student entity) {
		Student added = null;
		if(entity.getRollNumber()>=2000) {
			repo.add(entity);
			added = entity;
		}
		return added;
	}
}