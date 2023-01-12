package com.vicky.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.*;

public class GreetingImplTest {
	
	private static GreetingImpl greetingImpl;

	@BeforeClass
	public static void beforeClass(){
		greetingImpl = new GreetingImpl();
	}

	@Before
	public void setup(){
		System.out.println("This is before method");
	}

	@Test
	public void testGreet() {
		//GreetingImpl greetingImpl = new GreetingImpl();
		String result = greetingImpl.greet("Junit");
		assertNotNull(result);
		//assertNull(result);
		//assertEquals("Hello Junit", result);
		assertNotEquals("Hello Junit1", result);
		//assertTrue(true);
		//ddd();
	}
	@After
	public void cleanUp(){
		System.out.println("This is After method");
	}

	@AfterClass
	public static void clean1(){
		greetingImpl = null;
	}
	/*@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowExeceptionwhennameisnull(){
		//GreetingImpl greetingImpl = new GreetingImpl();
		greetingImpl.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowExeceptionwhennameisblank(){
		//GreetingImpl greetingImpl = new GreetingImpl();
		greetingImpl.greet("");
	}*/





}
