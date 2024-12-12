package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_006_BookConfirmationTest extends ProjectSpecificationMethods {
	
	//sheetName
		//@BeforeTest
	/*
	 * public void data() { sheetName = "BookingConfirmationTestData"; }
	 */

		@Test//(dataProvider = "excelRead")
		public void bookingConfirmationTest() throws InterruptedException {
			HomePage obj = new HomePage(driver);
			obj.clickLogin()
			.loginUsername()
			.loginPassword()
			.clickLogin()
			.clickSearch()
			.location()
			.hotels()
			.roomType()
			.noOfRooms()
			.checkInDate()
			.checkInOut()
			.adultsPerRoom()
			.childernPerRoom()
			.searchClick()
			.selectTheHotel()
			.continueClick()
			.firstName()
			.lastName()
			.billingAddress()
			.creditCardNo()
			.creditCardType()
			.expiryMonth()
			.expiryYear()
			.cvvNum()
			.clickBookNow()
			.bookingConfirm()
			.clickMyItinerary();
		}

}
