package com.techm.devopp.devopp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.techm.devopp.entity.Associate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevoppApplicationTests {

	@Autowired
	private Associate associate;
	
	@Before
	public void getMsg(){
		System.out.println("before test");
	}
	
	@After
	public void getMsgAfter(){
		System.out.println("after test");
	}
	
	@Test
	public void contextLoads() {
		System.out.println(associate.getFirstName());
		assertEquals("varun",associate.getFirstName());
	}
	
	

}
