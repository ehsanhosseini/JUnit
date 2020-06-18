package com.test.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath mymath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public static void beforeClass() { // it is static because it is class level 
		System.out.println("befor class");
	}
	
	@AfterClass
	public static void afterClass() { // it is static because it is class level 
		System.out.println("after class");
	}
	
	
	@Test
	public void sumWithThreeNum() {
		System.out.println("Test 1");
		assertEquals(6, mymath.cal(new int[] {1,2,3}));
		
	}

	
	@Test
	public void sumWithOneNum() {
		System.out.println("Test 2");
		assertEquals(1, mymath.cal(new int[] {1}));
		
	}
}
