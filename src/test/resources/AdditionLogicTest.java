package test.devops.servlet;

import org.junit.Test;

import junit.framework.TestCase;

public class AdditionLogicTest extends TestCase {
	@Test	
	public final void testAddition() {
		AdditionLogic al=new AdditionLogic();
		assertEquals("10+30 must be 40",20, al.addition(10,30));
		assertEquals("30+30 must be 60",60, al.addition(30,30));
		assertEquals("0+30 must be 30",30, al.addition(0,30));	
		
	}

}
