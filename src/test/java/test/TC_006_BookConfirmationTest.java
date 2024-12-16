package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_006_BookConfirmationTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void data() throws IOException {

		testName = "BookConfirmation Test";
		testDescription = "Testing the BookConfirmation functionality";
		testAuthor = "Loganayaki";

	}

	@BeforeClass
	public void details() {

		testDetails();
		sheetName = "BookConfirmationTestData";
	}

	@Test(dataProvider = "excelRead")
	public void bookingConfirmationTest(String userName, String password, String Location, String hotelName,
			String roomtype, String roomCount, String dateIn, String dateOut, String adultCount, String childrenCount,
			String firstname, String lastname, String billAddress, String cardNo, String cardType, String expMonth,
			String expYear, String cvvNo) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.clickLogin().loginUsername(userName).loginPassword(password).clickLoginButton().clickSearch()
				.location(Location).hotels(hotelName).roomType(roomtype).noOfRooms(roomCount).checkInDate(dateIn)
				.checkInOut(dateOut).adultsPerRoom(adultCount).childernPerRoom(childrenCount).searchClick()
				.selectTheHotel().continueClick().firstName(firstname).lastName(lastname).billingAddress(billAddress)
				.creditCardNo(cardNo).creditCardType(cardType).expiryMonth(expMonth).expiryYear(expYear).cvvNum(cvvNo)
				.clickBookNow().bookingConfirm().clickMyItinerary();
	}

}
