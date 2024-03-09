package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test
	@DataProvider
	public Object[][] Data(){
		Object[][] obj= new Object[2][2];
		obj[0][0]="Admin1";
		obj[0][1]="Manager1";
		obj[1][0]="Admin2";
		obj[1][1]="Manager2";
		return obj;	
	}
	@Test(dataProvider = "Data")
	public void singUp(String un,String pwd) {
		Reporter.log(un,true);
		Reporter.log(pwd,true);
		
	}
	
	
	
	
	

}
