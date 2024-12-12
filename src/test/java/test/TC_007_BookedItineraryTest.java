package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_007_BookedItineraryTest extends ProjectSpecificationMethods {
	
	//sheetName
		//@BeforeTest
	/*
	 * public void data() { sheetName = "BookedItineraryTestData"; }
	 */

		@Test//(dataProvider = "excelRead")
		public void bookedItineraryTest() throws InterruptedException {
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
			.clickMyItinerary()
			.selectOrderId()
			.cancelButtonClick()
			.clickOkConfirm()
			.confirmCancel();
		}
	

}
