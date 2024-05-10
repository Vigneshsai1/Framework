package org.junit;


public class Junitframwork {
	
	
	@Test
	public void tc4() {
		System.out.println("test 4");
		
}
	@Test
	public void tc2() {
		System.out.println("test 2");

	}
	@After
	public void close() {
		System.out.println("closed");

	}
	
	@Test
	public void tc1() {
		System.out.println("test 1");

	}
	@Test
	public void tc3() {
		System.out.println("test 3");

	}
	@Before
	public void starts() {
		System.out.println("starts");

	}

}
