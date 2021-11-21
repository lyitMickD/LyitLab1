package devopslab;

import static org.junit.Assert.*;


import org.junit.Test;

public class CalulatorTest {

	@Test
	public void addtionTest() {
		Calculator cal = new Calculator();
		int actual = cal.addtion(4, 4);
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	@Test
	public void subtractionTest() {
		Calculator cal = new Calculator();
		int actual = cal.subtract(4, 4);
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multipleTest() {
		Calculator cal = new Calculator();
		int actual = cal.multiple(4, 4);
		int expected = 16;
		assertEquals(expected, actual);
	}
	
	@Test
	public void DivideTest() {
		Calculator cal = new Calculator();
		int actual = cal.divide(4, 4);
		int expected = 1;
		assertEquals(expected, actual);
	}
}
