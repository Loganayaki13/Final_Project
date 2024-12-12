package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterPage extends ProjectSpecificationMethods {

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

	}

	public RegisterPage userName(String name) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
		return this;

	}

	public RegisterPage passWord(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		return this;
	}

	public RegisterPage confirmPassword(String confPass) {
		driver.findElement(By.id("re_password")).sendKeys(confPass);
		return this;
	}

	public RegisterPage fullName(String fullname) {
		driver.findElement(By.id("full_name")).sendKeys(fullname);
		return this;
	}

	public RegisterPage emailId(String email) throws InterruptedException {
		driver.findElement(By.id("email_add")).sendKeys(email);
		Thread.sleep(1000);
		return this;
	}

	public RegisterPage termsAndConditions() {
		driver.findElement(By.xpath("//input[@id='tnc_box']")).click();
		return this;
	}
  public RegisterPage registerButton()
  {
	  driver.findElement(By.id("Submit")).click();
	  return this;
	 
  }
	public LoginPage backToLoginPage() {
		driver.findElement(By.linkText("Go back to Login page")).click();
		return new LoginPage(driver);
	}

}
