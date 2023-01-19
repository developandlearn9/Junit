package com.vicky.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class GreetingImplTest1 {
	
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


	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowExeceptionwhennameisnull(){
		//GreetingImpl greetingImpl = new GreetingImpl();
		greetingImpl.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowExeceptionwhennameisblank(){
		//GreetingImpl greetingImpl = new GreetingImpl();
		greetingImpl.greet("");
	}

	@Test(timeout = 500)
	public void greetShouldTimeOut() throws InterruptedException {
			Thread.sleep(400);
			assertEquals("Hello Junit", greetingImpl.greet("Junit"));
	}

	@Test
	public void TestAssertSame(){
		String a = new String("Junit");
		String b = new String("Junit");
		String c = a;
		assertSame(a,c);
	}
	@Test
	public void TestAsserNottSame(){
		String a = new String("Hello Junit");
		String b = new String("Hello Junit");
		assertNotSame(a,b);
	}

	@Test
	public void TestAssertArrayEquals(){
		int a[] = {1,2,3};
		int[] b = {1,2,3};
		assertArrayEquals(a,b);
	}


}
