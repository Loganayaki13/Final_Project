package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//login username
	public LoginPage loginUsername() {
		driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[1]")).sendKeys("Loganayaki");
		return this;
	}
	
	//login password
	public LoginPage loginPassword() {
		driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[2]")).sendKeys("Logu@2024");
		return this;
	}
	
	//click the login button
	public HomePage clickLogin() {
		driver.findElement(By.className("login_button")).click();
		return new HomePage(driver);
	}
	
	//logout
	public HomePage clickLogout() {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		return new HomePage(driver);
	}


}
