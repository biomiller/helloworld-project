package helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	

	
	@Test
	
	public void test1() {
		
		App app1 = new App();
		
		app1.newEntry("Steve", "Developer");
		
		assertEquals("Developer",app1.getEntry("Steve"));
	}
	
	@Test
	public void test2() {
		
		App app1 = new App();
		
		assertEquals("Hello world to the standard out.",app1.hello());
	}
	
	

}
