package com.maven.junitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MavenAddition {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public int multiply(int a,int b) {
		return a*b;
	}

	@Test
	public void addTest() {
		assertEquals(4, add(2, 2));
	}
	@Test
	public void mulTest1() {
		MavenAddition ma=new MavenAddition();
		assertEquals(6,ma.multiply(3, 2));
		
	}

}
