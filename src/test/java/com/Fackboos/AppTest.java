package com.Fackboos;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * Hello world!
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
    
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
//	@Before
//	public
}
