package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class BookAHotel extends ProjectSpecificationMethods {

	public BookAHotel(WebDriver driver) {

		this.driver = driver;

	}

	// Enter the firstName
	public BookAHotel firstName(String firstname) {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		return this;
	}
	// Enter the lastName

	public BookAHotel lastName(String lastname) {
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		return this;
	}

	// Enter the billing address
	public BookAHotel billingAddress(String billAddress) {
		driver.findElement(By.id("address")).sendKeys(billAddress);
		return this;
	}

	// Enter the creditCardNo
	public BookAHotel creditCardNo(String cardNo) {
		driver.findElement(By.id("cc_num")).sendKeys(cardNo);
		return this;
	}

	// Enter the creditCardType
	public BookAHotel creditCardType(String cardType) {

		ele = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s = new Select(ele);
		s.selectByValue(cardType);
		return this;
	}

	// select the expiry date and year by using select class
	public BookAHotel expiryMonth(String expMonth) {
		ele = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s = new Select(ele);
		s.selectByVisibleText(expMonth);
		return this;
	}

	public BookAHotel expiryYear(String expYear) {
		ele = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s = new Select(ele);
		s.selectByValue(expYear);
		return this;
	}

	// Enter the cvvNum
	public BookAHotel cvvNum(String cvvNo) {
		driver.findElement(By.id("cc_cvv")).sendKeys(cvvNo);
		return this;
	}

	// click the BookNow button
	public BookingConfirmation clickBookNow() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("//td[contains(text(),'Booking Confirmation ')]"));
		Assert.assertTrue(ele.isDisplayed());
		Thread.sleep(5000);
		return new BookingConfirmation(driver);
	}

}
