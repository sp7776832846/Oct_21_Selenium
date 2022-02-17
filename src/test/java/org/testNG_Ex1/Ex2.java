package org.testNG_Ex1;   //[Date:- 08-02-22]

import org.testng.annotations.Test;

public class Ex2 {
	@Test
	public void test1() {
		System.out.println("Test 1");
		test2();						//here called the test2(),it is executed but
	}										// not count and show the test case result.
	public void test2() {
		System.out.println("Test 2");
		test3();
	}
	public void test3() {
		System.out.println("Test 3");
	}
	@Test
	public void test4() {
		System.out.println("Test 4");
	}
}
