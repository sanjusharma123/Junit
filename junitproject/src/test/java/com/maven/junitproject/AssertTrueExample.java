package com.maven.junitproject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTrueExample {

//	public boolean isEven(int no) {
//		boolean flag=false;
//		if(no%2==0) {
//			flag= true;
//		}
//		return flag;
//	}
	@Test
	public void evenTest() {
		//AssertTrueExample ast=new AssertTrueExample();
		assertTrue(EvenCheck.isEven(3));
	}
	
}
