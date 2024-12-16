package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Enter login username
	public LoginPage loginUsername(String userName) {
		driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[1]")).sendKeys(userName);
		return this;
	}

	// Enter login password
	public LoginPage loginPassword(String password) {
		driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[2]")).sendKeys(password);
		return this;
	}

	// click the login button
	public HomePage clickLoginButton() throws InterruptedException {
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("//input[contains(@value,'Hello Loganayaki!')]"));
		Assert.assertTrue(ele.isDisplayed());
		return new HomePage(driver);
	}

}
