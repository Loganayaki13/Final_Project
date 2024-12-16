package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class RegisterPage extends ProjectSpecificationMethods {

	public RegisterPage(WebDriver driver) {
		this.driver = driver;

	}

	// Enter the userName
	public RegisterPage userName(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		return this;

	}

	// Enter the password
	public RegisterPage passWord(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	// Enter the Confirm Password
	public RegisterPage confirmPassword(String confirmPass) {
		driver.findElement(By.id("re_password")).sendKeys(confirmPass);
		return this;
	}

	// Enter the FullName
	public RegisterPage fullName(String fullname) {
		driver.findElement(By.id("full_name")).sendKeys(fullname);
		return this;
	}

	// Enter the EmailId
	public RegisterPage emailId(String emailid) throws InterruptedException {
		driver.findElement(By.id("email_add")).sendKeys(emailid);
		Thread.sleep(1000);
		return this;
	}

	// Click the termsAndConditions CheckBox
	public RegisterPage termsAndConditions() {
		driver.findElement(By.xpath("//input[@id='tnc_box']")).click();
		return this;
	}

	// Click the registerButton
	public RegisterPage registerButton() {
		driver.findElement(By.id("Submit")).click();
		return this;

	}

	public LoginPage backToLoginPage() {
		driver.findElement(By.linkText("Go back to Login page")).click();
		return new LoginPage(driver);
	}

}
