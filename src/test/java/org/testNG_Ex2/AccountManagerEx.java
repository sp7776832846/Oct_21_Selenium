package org.testNG_Ex2;    //[Date:- 10-02-22]

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManagerEx {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class-Account");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class-Account");
	}
	@Test
	public void umTest1() {
	System.out.println("Account Test 1");
	}
	@Test
	public void umTest2() {
	System.out.println("Account Test 2");
	}
	@Test
	public void umTest3() {
	System.out.println("Account Test 3");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test-Account");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test-Account");
	}
}
