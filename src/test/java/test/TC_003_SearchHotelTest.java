package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003_SearchHotelTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void data() throws IOException {

		testName = "SearhHotel Functionality";
		testDescription = "Testing the SearhHoteltEST functionality";
		testAuthor = "Loganayaki";

	}

	@BeforeClass
	public void details() {
		
		testDetails();
		sheetName = "SearchHotelTestData";
	}

	@Test(dataProvider = "excelRead")
	public void searchHotelTest(String userName, String password, String Location, String hotelName, String roomtype,
			String roomCount, String dateIn, String dateOut, String adultCount, String childrenCount)
			throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.clickLogin().loginUsername(userName).loginPassword(password).clickLoginButton().clickSearch()
				.location(Location).hotels(hotelName).roomType(roomtype).noOfRooms(roomCount).checkInDate(dateIn)
				.checkInOut(dateOut).adultsPerRoom(adultCount).childernPerRoom(childrenCount).searchClick();
	}

}