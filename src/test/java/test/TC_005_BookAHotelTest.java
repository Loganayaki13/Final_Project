package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_005_BookAHotelTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void data() throws IOException {

		testName = "SelectHotel Test";
		testDescription = "Testing the SelectHotel functionality";
		testAuthor = "Loganayaki";

	}

	@BeforeClass
	public void details() {

		testDetails();
		sheetName = "BookAHoteltestData";
	}

	@Test(dataProvider = "excelRead")
	public void bookAHotelTest(String userName, String password, String Location, String hotelName, String roomtype,
			String roomCount, String dateIn, String dateOut, String adultCount, String childrenCount, String firstname,
			String lastname, String billAddress, String cardNo, String cardType, String expMonth, String expYear,
			String cvvNo) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.clickLogin().loginUsername(userName).loginPassword(password).clickLoginButton().clickSearch()
				.location(Location).hotels(hotelName).roomType(roomtype).noOfRooms(roomCount).checkInDate(dateIn)
				.checkInOut(dateOut).adultsPerRoom(adultCount).childernPerRoom(childrenCount).searchClick()
				.selectTheHotel().continueClick().firstName(firstname).lastName(lastname).billingAddress(billAddress)
				.creditCardNo(cardNo).creditCardType(cardType).expiryMonth(expMonth).expiryYear(expYear).cvvNum(cvvNo)
				.clickBookNow();
	}

}
