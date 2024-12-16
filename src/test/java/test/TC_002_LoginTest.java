package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_002_LoginTest extends ProjectSpecificationMethods {

	@BeforeTest
	public void data() throws IOException {
		
		testName = "Login Functionality";
		testDescription = "Testing the login functionality";
		testAuthor = "Loganayaki";

	}

	@BeforeClass
	public void details()
	{
		testDetails();
		sheetName="LoginTestData"; 
	}

	@Test(dataProvider = "excelRead")
	public void loginTest(String userName, String password) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.clickLogin().loginUsername(userName).loginPassword(password).clickLoginButton().clickLogout();

	}

}
