package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal = new Calculator();

	@Test
	public void test_sum() {
		System.out.println("Hi");
		double s = cal.sum(2.0, 3.0);
		Assert.assertEquals(5.0, s,0);

	}

	@Test
	public void test_prod() {
		double p = cal.prod(2.0, 3.0);
		Assert.assertEquals(6, p,0);
		Assert.assertNotEquals(5, p);
	}

	@Test
	public void test_calculate() {
		double c = cal.calculate(10.0, 2.0);
		Assert.assertEquals(1.66, c, 0.1);
		
	}
	
	@Test
	public void test_calculate_with0value() {
		double c;
		try {
			c = cal.calculate(0.0, 0.0);
		} catch (Exception e) {
			Assert.assertEquals("invalid values",e.getMessage());
			Assert.assertTrue(e.getMessage().equalsIgnoreCase("Invalid Values"));
		}
		
		
	}
}
