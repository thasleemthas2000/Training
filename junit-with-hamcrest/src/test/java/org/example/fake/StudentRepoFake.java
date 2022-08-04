package org.example.fake;

import java.util.ArrayList;
import java.util.List;

import org.example.ifaces.StudentRepository;
import org.example.model.Student;

public class StudentRepoFake implements StudentRepository {
	
	private List<Student> list;
	
	public StudentRepoFake() {
		super();
		list=new ArrayList<>();
	}

	@Override
	public Student add(Student entity) {
		// TODO Auto-generated method stub
		return list.add(entity)?entity:null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return this.list;
	}

}
