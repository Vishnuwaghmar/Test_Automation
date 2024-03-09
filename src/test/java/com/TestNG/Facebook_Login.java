package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook_Login {
	@Test
	public void Login() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Admin12");
		driver.findElement(By.xpath(".//button[text()='Log in']")).submit();
		
		Assert.assertEquals(driver.getTitle(), "Facebook-log in or singn up");
	}

}
