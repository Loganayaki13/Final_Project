package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class BookedItinerary extends ProjectSpecificationMethods {
	
	
	public BookedItinerary(WebDriver driver) {
		this.driver=driver;
		
	}
	//Select the orderId
	public BookedItinerary selectOrderId()
	{
		driver.findElement(By.xpath("//input[@name='ids[]']")).click();
		return this;
	}
		//Clicking the cancel selected button
	public BookedItinerary cancelButtonClick()
	{
		driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
		return this;
		
	}
	//Switch to alert for clicking cancel confirmation
	public BookedItinerary clickOkConfirm()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		return this;
		
	}
	//validation for confirming the alert
	public ChangePassWord confirmCancel() {
		expectedResult="Selected booking Are cancelled.";
		WebElement actualResult=driver.findElement(By.xpath("//label[contains(text(),'Selected booking Are cancelled.')]"));
		Assert.assertEquals(expectedResult, actualResult.getText());
		System.out.println("Cancalled the Booking");
		return new ChangePassWord(driver);
		
	}
}
