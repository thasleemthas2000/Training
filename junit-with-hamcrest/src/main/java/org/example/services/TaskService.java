package org.example.services;

import java.util.Optional;

import org.example.ifaces.TaskRepository;
import org.example.model.Student;


public class TaskService {

	private TaskRepository repo;

	public TaskService(TaskRepository repo) {
		super();
		this.repo = repo;
	}

	public Student findById(int rollNumber) {
				return this.repo.getById(rollNumber).get();
	}

	public Student deleteById(int rollNumber) {
		return this.repo.deleteById(rollNumber).get();
	}
		
//		  public boolean deleteById(int rollNumber) {
//		        final Student byRollNumber = repo.findById(rollNumber);
//		        if (byRollNumber != null) {
//		            repo.deleteById(byRollNumber);
//		        }
//		        final Student removed = repo.findById(rollNumber);
//		        if (removed != null) {
//		            return false;
//		        }
//		        return true;
//		    
//	}
	
	public Student add(Student entity) {
		return this.repo.add(entity);
	}
}
