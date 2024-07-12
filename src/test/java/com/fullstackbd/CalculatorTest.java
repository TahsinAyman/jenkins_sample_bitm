package com.fullstackbd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setup() {
		this.calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int result = this.calculator.add(1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void testSub() {
		int result = this.calculator.sub(3, 2);
		assertEquals(1, result);
	}
}
