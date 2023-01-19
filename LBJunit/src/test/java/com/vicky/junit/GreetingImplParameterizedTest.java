package com.vicky.junit;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GreetingImplParameterizedTest {
	
	private static GreetingImpl greetingImpl;

	@BeforeClass
	public static void beforeClass(){
		greetingImpl = new GreetingImpl();
	}

	@Before
	public void setup(){
		System.out.println("This is before method");
	}

	@After
	public void cleanUp(){
		System.out.println("This is After method");
	}

	@AfterClass
	public static void clean1(){
		greetingImpl = null;
	}

	@Parameterized.Parameters
	public static Collection primeArguments() {
		return Arrays.asList(new Object[][] {
				{ "Junit",  "Hello Junit"},
				{ "Junit1", "Hello Junit1"}
		});
	}

	private String input;
	private String expected;

	public GreetingImplParameterizedTest(String input, String expected) {
		this.input = input;
		this.expected = expected;
	}


	@Test
	public void testGreet() {
		//GreetingImpl greetingImpl = new GreetingImpl();
		String result = greetingImpl.greet(input);
		assertEquals(result, expected);
	}
}
