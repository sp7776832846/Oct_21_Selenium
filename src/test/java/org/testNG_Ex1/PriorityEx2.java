package org.testNG_Ex1;   //[Date:- 09-02-22]

import org.testng.annotations.Test;

public class PriorityEx2 {
	
	@Test(priority = 3)
	public void updateTC() {
		System.out.println("updateTC");
	}
	@Test(priority = 3)
	public void deleteTC() {
		System.out.println("deleteTC");
	}
	@Test(priority = 0)
	public void logoutTC() {
		System.out.println("logoutTC");
	}
	@Test(priority = -100)
	public void loginTC() {    
		System.out.println("loginTC");
	}
	@Test(priority = 2)
	public void createTC() {
		System.out.println("createTC");
	}
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
}
