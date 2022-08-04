package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.Matchers.hasSize;

import com.example.demo.entity.CabDriver;
import com.example.demo.services.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc

   public class CabDriverTest {

    @Autowired
    MockMvc mock;

     @Autowired
     ObjectMapper mapper;

    @MockBean
    CabDriverService service;

     private CabDriver canna;
     private CabDriver damu;
     private CabDriver david; 
     private CabDriver thas;
     
   @BeforeAll
   void init() {
	
	   canna=new CabDriver(1010,"Kanna",8745,"Chennai",LocalDate.of(1997, 10, 11),4.5);
       damu=new CabDriver(1012,"Damu",8746,"Tirupathi",LocalDate.of(1998, 11, 10),3.5);
       david=new CabDriver(1015,"David",8775,"Madurai",LocalDate.of(1999, 10, 19),4.6);

   }
    @Test
    @DisplayName("Test find All Method return a array")
     void testFindAll() throws Exception {

   List<CabDriver> list=new ArrayList<>();
   list.add(canna);
   list.add(damu);
   list.add(david);

     given(service.findAll()).willReturn(list);

     mock.perform(MockMvcRequestBuilders
                         .get("/api/v1/cabdrivers")
                        .contentType(MediaType.APPLICATION_JSON))
                       .andExpect(status().isOk())
                      .andExpect(jsonPath("$",hasSize(3)))
                     .andExpect(jsonPath("$[1].driverName", is("Damu")));
          }
    @Test
    @DisplayName("Test post new method")
    public void createRecord_success() throws Exception {
    	thas = new CabDriver(1025,"thas",5075,"Mumbai",LocalDate.of(1995, 10, 8),4.6);


    	   given(service.save(thas)).willReturn(thas);
    	       mock.perform(MockMvcRequestBuilders.post("/api/v1/cabdrivers")
    	               .contentType(MediaType.APPLICATION_JSON)
    	       .content(asJsonString(thas)))
    	     .andExpect(status().isCreated())
   .andExpect(content().contentType(MediaType.APPLICATION_JSON)).andExpect(jsonPath("$.driverName", is("thas")));    
    	       }

    public static String asJsonString(CabDriver entity) {
    	try {
    	ObjectMapper objectMapper = new ObjectMapper();
    	return objectMapper.writeValueAsString(entity);
    	} catch(Exception e) {
    	throw new RuntimeException(e);
    	}
    }
    
   
    @Test
	@DisplayName("test findById method returns the element")
	void testFindById() throws Exception{
		Optional<CabDriver> element=Optional.of(thas);
		given(service.findById(1025)).willReturn(element);
		mock.perform(MockMvcRequestBuilders.get("/api/v1/cabdrivers/1025"))
		.andExpect(jsonPath("$.driverName", is("thas")));
	}
    }





