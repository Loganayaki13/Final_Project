package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificationMethods;

public class ChangePassWord extends ProjectSpecificationMethods {

	public ChangePassWord(WebDriver driver) {
		this.driver = driver;
	}

	// Click the change password tab
	public ChangePassWord ChangePassWordLink() {
		driver.findElement(By.linkText("Change Password")).click();
		return this;
	}

	// Enter the ChangePassWord
	public ChangePassWord currentPassword() {
		driver.findElement(By.id("current_pass")).sendKeys("Logu@2024");
		return this;
	}

	// Enter the newPassword
	public ChangePassWord newPassword() {
		driver.findElement(By.id("new_password")).sendKeys("Logu@2024");
		return this;
	}

	// Enter the confirmPassword
	public ChangePassWord confirmPassword() {
		driver.findElement(By.id("re_password")).sendKeys("Logu@2024");
		return this;
	}

	// Click the clickSubmit
	public FinalLogout clickSubmit() {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		return new FinalLogout(driver);
	}
}
