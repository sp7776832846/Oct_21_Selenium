package org.testNG_Ex2;  //[Date:- 10-02-22]

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserManagerEx {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class-User");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class-User");
	}
	@Test
	public void umTest1() {
	System.out.println("User Test 1");
	}
	@Test
	public void umTest2() {
	System.out.println("User Test 2");
	}
	@Test
	public void umTest3() {
	System.out.println("User Test 3");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-Users");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test-Users");
	}

}
