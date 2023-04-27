package com.maven.junitproject;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class FactorialTest {

	public int fact(int num) {
		int fact = 1;
		while (num != 0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}

	@Test
	public void test() {
		FactorialTest num = new FactorialTest();
		assertEquals(120, num.fact(5));
	}

class EvenOdd{

	public void  isEven(int num) {
		if (num % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
}
@Test
public void test1() {
	EvenOdd eo=new EvenOdd();
	assertEquals(2, eo.isEven(2));
}
}

