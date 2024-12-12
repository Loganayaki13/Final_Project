package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_003_SearhHotelTest extends ProjectSpecificationMethods{
	
	//sheetName
		
		/*
		 * public void data() { sheetName = "SearchHotelTestData"; }
		 */

		@Test//(dataProvider = "excelRead")
		public void searchHotelTest() {
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
			.searchClick();		
		}

}
