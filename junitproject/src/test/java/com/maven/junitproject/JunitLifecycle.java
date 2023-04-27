package com.maven.junitproject;

import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class JunitLifecycle {

	ArrayList<String> al;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("  @BeforeClass executed before all testcases: ");

	}

	@Before
	public void before() {
		al = new ArrayList<String>();
		System.out.println("@before executed before each testcase");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("  @AfterClass executed @After all testcases: ");

	}

	@After
	public void after() {
		System.out.println("@After executed After each testcase");
	}

	@Test
	public void test1() {
		al.add("simran");
		al.add("siny");
		assertFalse(al.isEmpty());
		assertEquals(2, al.size());
		System.out.println("Test Method @Test Called");
	}

	@Test(timeout = 1000)
	public void test2() {
		int num = 2;
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		assert (true);
		System.out.println("Test Method @Test Called");

	}

}
