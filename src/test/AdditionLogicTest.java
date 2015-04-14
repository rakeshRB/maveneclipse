package test.devops.servlet;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionLogicTest {

	@Test
	public final void testAddition() {
		assertEquals("10+30 must be 40",20, AdditionLogic.addition(10,30));
		assertEquals("30+30 must be 60",60, AdditionLogic.addition(30,30));
		assertEquals("0+30 must be 30",30, AdditionLogic.addition(0,30));	
	}

}


