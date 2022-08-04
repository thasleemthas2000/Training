package org.example.mockito.module1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.example.ifaces.TaskRepository;
import org.example.model.Student;
import org.example.services.TaskService;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import static  org.mockito.ArgumentMatchers.anyInt;


@ExtendWith(MockitoExtension.class)
public class TaskTest {
	
	@Mock
	TaskRepository repo;
	
	@InjectMocks
	TaskService service;
	
	@DisplayName("verify if the value is not found it should throw ElementNotFoundException")
	@Test
	void testgetById() {
		Student thas=new Student(101,"Thas");
		Student thas2=new Student(102,"Nas");
		when(repo.getById(101)).thenReturn(Optional.of(thas));//stubbing
		Student actual = service.findById(101);
		//System.out.println(actual);

		assertEquals(thas,actual);
	}
	@Test
	void shouldThrowExceptionWhenElementNotFound() {
		Student stud=new Student(2022,"Ram");
		when(repo.getById(anyInt())).thenThrow(RuntimeException.class);
		assertThrows(NumberFormatException.class,()->
		service.findById(1000));
	}
	

	@Test
	@DisplayName("verify for delete Method")
	void testDeleteMethod() {
		Student hari=new Student(101,"Thas");
		Student hari2=new Student(102,"Nas");
		when(repo.deleteById(101)).thenReturn(Optional.of(hari));//stubbing
		Student expected=service.deleteById(101);
		assertEquals(expected,hari);
		
	}
	}

//	void testdeleteById() {
//
//		Student thas=new Student(101,"Thas");
//		Student thas2=new Student(102,"Nas");
//		 Mockito.when(repo.findById(102))
//         .thenReturn(thas);
//		 final boolean result = service.deleteById(102);
//		 Mockito.verify(repo, times(1))
//         .deleteById(thas);
// assertThat(result, equalTo(true));
//	}
//	private void assertThat(boolean result, Matcher<Boolean> equalTo) {
//		// TODO Auto-generated method stub
//		
//	}

