package org.testNG_Ex1;   //[Date:- 08-02-22]

import org.testng.annotations.Test;

public class PriorityEx {
	
	@Test(priority = 3)
	public void updateTC() {
		System.out.println("updateTC");
	}
	@Test(priority = 4)
	public void deleteTC() {
		System.out.println("deleteTC");
	}
	@Test(priority = 5)
	public void logoutTC() {
		System.out.println("logoutTC");
	}
	@Test(priority = 1)
	public void loginTC() {    // TC - Test Case
		System.out.println("loginTC");
	}
	@Test(priority = 2)
	public void createTC() {
		System.out.println("createTC");
	}
}
