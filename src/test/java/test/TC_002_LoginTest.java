package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_002_LoginTest extends ProjectSpecificationMethods {
	
	
	/*
	 * @BeforeTest public void data() { sheetName = "LoginTestData"; }
	 */
		@Test//(dataProvider = "excelRead")
		public void loginTest() throws InterruptedException {
			HomePage obj = new HomePage(driver);
			obj.clickLogin()
			.loginUsername()
			.loginPassword()
			.clickLogin();
			
			
		}

}
