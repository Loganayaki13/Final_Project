package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_009_FinalLogout extends ProjectSpecificationMethods {
	
	
	//sheetName
		//@BeforeTest
	/*
	 * public void data() { sheetName = "EndLogoutTestData"; }
	 */
		 
		@Test//(dataProvider = "excelRead")
		public void endLogoutTest() throws InterruptedException {
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
			.confirmCancel()
			.ChangePassWordLink()
			.currentPassword()
			.newPassword()
			.confirmPassword()
			.clickSubmit()
			.finalLogout();
		}

}
