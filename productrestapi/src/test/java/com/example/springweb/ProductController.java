/*package com.example.springweb;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.springweb.controllers.ProductRestController;
import com.example.springweb.entities.Product;
import com.example.springweb.repos.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
@RunWith(MockitoJUnitRunner.class)
public class ProductController {

	private MockMvc mockMvc;
	ObjectMapper objectMapper =new ObjectMapper();
	ObjectWriter objectWriter =objectMapper.writer();
	@Mock
	private ProductRepository productRepository;
	@InjectMocks
	private ProductRestController  productRestController;
	
	Product p1=new Product(1,200,"this is perplexed");
	Product p2=new Product(1,2000,"this is perplexing");
	private ProductController testClass;
	
	@Before 
	public void setUp() {
		MockitoAnnotations.initMocks(mockMvc);
		this.mockMvc=MockMvcBuilders.standaloneSetup(productRestController).build();
	}
} */
