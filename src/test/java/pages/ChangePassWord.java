package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class ChangePassWord extends ProjectSpecificationMethods {

	public ChangePassWord(WebDriver driver) {
		this.driver = driver;
	}

	// Enter the ChangePassWord
	public ChangePassWord currentPassword(String currentPass) {
		driver.findElement(By.id("current_pass")).sendKeys(currentPass);
		return this;
	}

	// Enter the newPassword
	public ChangePassWord newPassword(String newPass) {
		driver.findElement(By.id("new_password")).sendKeys(newPass);
		return this;
	}

	// Enter the confirmPassword
	public ChangePassWord confirmPassword(String confirmPass) {
		driver.findElement(By.id("re_password")).sendKeys(confirmPass);
		return this;
	}

	// Click the clickSubmit
	public FinalLogout clickSubmit() {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		String expectedResult = "Your Password is successfully updated!!!";
		WebElement actualResult = driver
				.findElement(By.xpath("//span[contains(text(),'Your Password is successfully updated!!!')]"));
		Assert.assertEquals(actualResult.getText(), expectedResult);
		System.out.println(expectedResult);
		return new FinalLogout(driver);
	}
}
