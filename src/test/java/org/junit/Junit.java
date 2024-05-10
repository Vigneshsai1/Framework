package org.junit;

public class Junit {
	@BeforeClass
	public static void startclass() {
		System.out.println("startclass");

	}
	
	@Before
	public void start() {
		System.out.println("starting time");

	}
	@Ignore
	@Test
	public void tc1() {
		System.out.println("Test 1");

	}
	@Test
	public void tc2() {
		System.out.println("Test 2");

	}
	@After
	public  void clos() {
		System.out.println("close Time");
		

	}
	@AfterClass
	public static void end() {
		System.out.println("end time");

	}

}
