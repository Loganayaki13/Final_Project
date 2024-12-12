package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPage registerClick() {
		driver.findElement(By.linkText("New User Register Here")).click();
		return new RegisterPage(driver);
	}

	public LoginPage clickLogin() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
		return new LoginPage(driver);
	}

	public SearchHotel clickSearch() {
		driver.findElement(By.partialLinkText("Search Hotel")).click();
		return new SearchHotel(driver);
	}

}
