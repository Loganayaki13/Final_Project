package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class BookingConfirmation extends ProjectSpecificationMethods {

	public BookingConfirmation(WebDriver driver) {

		this.driver = driver;
	}

	// Verify the Booking Confirmation
	public BookingConfirmation bookingConfirm() {
		expectedResult = "Booking Confirmation";
		WebElement actualResult = driver.findElement(By.xpath("//td[contains(text(),'Booking Confirmation ')]"));
		Assert.assertEquals(expectedResult, actualResult.getText());
		System.out.println("Booking Confirmed");
		return this;
	}

	public BookedItinerary clickMyItinerary() {
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		return new BookedItinerary(driver);
	}
}
