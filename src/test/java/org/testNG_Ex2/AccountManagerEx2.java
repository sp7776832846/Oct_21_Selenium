package org.testNG_Ex2;    //[Date:- 10-02-22]

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManagerEx2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class-Account2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class-Account2");
	}
	@Test
	public void acctest1() {
	System.out.println("Account2 Test 1");
	}
	@Test
	public void acctest2() {
	System.out.println("Account2 Test 2");
	}
	@Test
	public void acctest3() {
	System.out.println("Account2 Test 3");
	}
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("Before Test-Account");
//	}
//	@AfterTest
//	public void afterTest() {
//		System.out.println("After Test-Account");
//	}
}
