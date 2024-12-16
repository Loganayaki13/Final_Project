package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class FinalLogout extends ProjectSpecificationMethods {

	public FinalLogout(WebDriver driver) {
		this.driver = driver;
	}

	// Clicking the Logout Button
	public HomePage logoutChecking() {
		String expectedResult = "You have successfully logged out. Click here to login again";
		WebElement actualResult = driver.findElement(By.xpath("//td[contains(text(),'You have successfully logged out.')]"));
		Assert.assertEquals(actualResult.getText(), expectedResult);
		System.out.println(expectedResult);
		return new HomePage(driver);
	}
}
