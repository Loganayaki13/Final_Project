package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethods;

public class BookAHotel extends ProjectSpecificationMethods {

	public BookAHotel(WebDriver driver) {

		this.driver = driver;

	}

	// Enter the firstName
	public BookAHotel firstName() {
		driver.findElement(By.id("first_name")).sendKeys("Logi");
		return this;
	} 
	// Enter the lastName

	public BookAHotel lastName() {
		driver.findElement(By.id("last_name")).sendKeys("p");
		return this;
	}

	// Enter the billing address
	public BookAHotel billingAddress() {
		driver.findElement(By.id("address")).sendKeys("2/297,London");
		return this;
	}

	// Enter the creditCardNo
	public BookAHotel creditCardNo() {
		driver.findElement(By.id("cc_num")).sendKeys("1234567890987654");
		return this;
	}

	//// Enter the creditCardType
	public BookAHotel creditCardType() {

		ele=driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select s=new Select(ele);
		s.selectByValue("VISA");
		return this;
	}

	// select the expiry date and year by using select class
	public BookAHotel expiryMonth() {
		ele=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s=new Select(ele);
		s.selectByVisibleText("March");
		return this;
	}

	public BookAHotel expiryYear() {
		ele=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s=new Select(ele);
		s.selectByValue("2013");
		return this;
	}

	// Enter the cvvNum
	public BookAHotel cvvNum() {
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		return this;
	}

	// click the BookNow button
	public BookingConfirmation clickBookNow() {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		return new BookingConfirmation(driver);
	}

}
