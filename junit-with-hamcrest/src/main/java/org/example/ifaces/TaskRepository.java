package org.example.ifaces;

import java.util.Optional;

import org.example.model.Student;

public interface TaskRepository {

	public Optional<Student> getById(int rollNumber);
	public Optional<Student> deleteById(int rollNumber);
	public Student add(Student entity);
	//public void deleteById(Student byRollNumber);
}
