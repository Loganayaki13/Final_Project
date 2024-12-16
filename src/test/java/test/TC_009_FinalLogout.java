package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_009_FinalLogout extends ProjectSpecificationMethods {
	
	
	@BeforeTest
	public void data() throws IOException {

		testName = "FinalLogout Test";
		testDescription = "Testing the FinalLogout functionality";
		testAuthor = "Loganayaki";

	}

	@BeforeClass
	public void details() {

		testDetails();
		sheetName = "FinalLogoutTestData"; 
		}		 
		@Test(dataProvider = "excelRead")
		public void endLogoutTest(String userName, String password) throws InterruptedException {
			HomePage obj = new HomePage(driver);
			obj.clickLogin()
			.loginUsername(userName)
			.loginPassword(password)
			.clickLoginButton()
			.finalLogout()
			.logoutChecking();
		}

}
