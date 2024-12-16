package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethods;

public class SearchHotel extends ProjectSpecificationMethods {

	public SearchHotel(WebDriver driver) {
		this.driver = driver;
	}

	// Select the Location
	public SearchHotel location(String Location) {
		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s = new Select(ele);
		s.selectByValue(Location);
		return this;
	}

	// Select the hotels
	public SearchHotel hotels(String hotelName) {

		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select s = new Select(ele);
		s.selectByValue(hotelName);
		return this;
	}

	// Select the roomtype
	public SearchHotel roomType(String roomtype) {

		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select s = new Select(ele);
		s.selectByValue(roomtype);
		return this;
	}

	// Select the No of Rooms
	public SearchHotel noOfRooms(String roomCount) {

		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select s = new Select(ele);
		s.selectByVisibleText(roomCount);
		return this;
	}

	// Select the check-in date
	public SearchHotel checkInDate(String dateIn) {

		driver.findElement(By.id("datepick_in")).sendKeys(dateIn);
		return this;
	}

	// Select the check-out date
	public SearchHotel checkInOut(String dateOut) {
		driver.findElement(By.id("datepick_out")).sendKeys(dateOut);
		return this;
	}

	// Select the adults per room
	public SearchHotel adultsPerRoom(String adultCount) {
		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select s = new Select(ele);
		s.selectByVisibleText(adultCount);
		return this;

	}

	// Select the children per room
	public SearchHotel childernPerRoom(String childrenCount) {
		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select s = new Select(ele);
		s.selectByValue(childrenCount);
		return this;

	}

	public SelectHotel searchClick() {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();

		return new SelectHotel(driver);
	}

}
