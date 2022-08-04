package org.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.model.Book;
import com.example.services.BookService;

public class BookServiceTest {
BookService service=null;
	
	@BeforeAll
	public static void init(TestInfo info) {
		System.out.println(info.getDisplayName()+"Called");
	}
	
	@BeforeEach
	public void setUp(TestInfo info) {
		service=new BookService();
		System.out.println(info.getDisplayName()+"Called");
		}

	@Test
	@DisplayName(value = "Get method should not return null value")
	void testGetBookMethod() {
		//BookService obj = new BookService();
		Object actual = service.getBookList();
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName(value="add Method should return 1 for success and 0 for failure to insert ")
	void testAddMethod() {
		//BookService obj = new BookService();
        Object actual = service.addBook(new Book(100, "thas", 50.0));
        int expected = 0;
        
        assertEquals(expected,(int)actual);
	}
	@Test
	@DisplayName(value="add Method should return 1 for success and 0 for failure to insert ")
	void testAddMethodReturn() {
		//BookService obj = new BookService();
        Object actual = service.addBook(new Book());
        int expected = 0;
        
        assertEquals(expected,actual);
	}
	@Test
	@DisplayName("addBook Method should not Accept Dupilcate")
	void testDuplicateNotAllowed() {
	//BookService obj=new BookService();
	Book Java=new Book(100, "Java", 50);
	Book Java1=new Book(100,"Java", 50 );
	int value = service.addBook(Java);
	int actual = service.addBook(Java1);
	int expected=0;
	assertEquals(expected, actual);

	}
	
	@Test
	@DisplayName(value = "If the element is not found in collection removeBook should return throw RunTimeException"
			+ "with message element is not found ")
	void testRemove() {
		Throwable exception=assertThrows(RuntimeException.class,()->
		service.removeBook(new Book(103,"Maths",800)));
		assertEquals("Element not found",exception.getMessage());
		
	} 
	
	@DisplayName(value = "Test if getBestBook Method has the value Head First Java three position")
    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    void testgetBestBooks(int idxPos) {
		System.out.println(System.getProperty("os.name"));
		assumeTrue(System.getProperty("os.name").equals("windows10"));
		assertEquals("Head First Java", service.getBestBooks().get(idxPos));
		
	}
    
}
