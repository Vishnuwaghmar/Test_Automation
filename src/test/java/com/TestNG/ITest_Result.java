package com.TestNG;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITest_Result extends Assert {
	@Test
	public void TestCaseFail() {
		fail();
		//assertTrue(true);
	} 
	@Test
	public void TestCasePass() {
		assertTrue(true);
	}
	public void GetStatus(ITestResult result) {
		if (result.getStatus()== ITestResult.SUCCESS ) {
			Reporter.log("Success = Method Name :" +result.getStatus()+"Method Name :"+result.getName(),true);
			
		}
		if (result.getStatus()== ITestResult.FAILURE) {
			Reporter.log("Success = Method Name :" +result.getStatus()+"Method Name :"+result.getName(),true);
			
		}
		
		
	}
	

}
