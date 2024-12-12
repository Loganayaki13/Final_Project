package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class SelectHotel extends ProjectSpecificationMethods {

	public SelectHotel(WebDriver driver) {
		
		this.driver=driver;
		
	}
	public SelectHotel selectTheHotel()
	{
		driver.findElement(By.id("radiobutton_0")).click();
		return this;
	}
	public BookAHotel continueClick()
	{
		driver.findElement(By.id("continue")).click();
		return new BookAHotel(driver);
	}
	

}
