package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameters {
  @org.testng.annotations.Parameters({"un","pwd"})
  @Test
	public void data(String un,String pwd) {
		Reporter.log(un,true);
		Reporter.log(pwd,true);
	}

}
