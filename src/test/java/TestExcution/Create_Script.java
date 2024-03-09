package TestExcution;

import org.openqa.selenium.By;

public class Create_Script extends Base_Script{
	public void Create() {
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manager");
		driver.findElement(By.name("lastname")).sendKeys("Admin");
		
	}

}
