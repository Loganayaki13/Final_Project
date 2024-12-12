package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecificationMethods;

public class SearchHotel extends ProjectSpecificationMethods {

	public SearchHotel(WebDriver driver) {
		this.driver = driver;
	}

	public SearchHotel location() {
		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s = new Select(ele);
		s.selectByValue("London");
		return this;
	}

	public SearchHotel hotels() {

		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select s = new Select(ele);
		s.selectByValue("Hotel Sunshine");
		return this;
	}

	public SearchHotel roomType() {

		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select s = new Select(ele);
		s.selectByValue("Standard");
		return this;
	}

	public SearchHotel noOfRooms() {

		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select s = new Select(ele);
		s.selectByVisibleText("3 - Three");
		return this;
	}

	public SearchHotel checkInDate() {

		driver.findElement(By.id("datepick_in")).sendKeys("11/12/2024");
		return this;
	}

	public SearchHotel checkInOut() {
		driver.findElement(By.id("datepick_out")).sendKeys("12/12/2024");
		return this;
	}

	public SearchHotel adultsPerRoom() {
		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select s = new Select(ele);
		s.selectByVisibleText("2 - Two");
		return this;

	}

	public SearchHotel childernPerRoom() {
		ele = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select s = new Select(ele);
		s.selectByVisibleText("1 - One");
		return this;

	}

	public SelectHotel searchClick() {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();

		return new SelectHotel(driver);
	}

}
