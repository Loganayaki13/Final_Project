package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_001_RegisterTest extends ProjectSpecificationMethods {
	@BeforeTest
		public void data() throws IOException {
		propFileData();
		testName="Registration Test";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Loganayaki";
       	
    }
	
	@BeforeClass
	public void details()
	{
		testDetails();
		
	}
	
    @Test(priority=0)
	public void registerTest() throws InterruptedException, IOException {
    	
    	
		HomePage obj = new HomePage(driver);
		obj.registerClick()
		.userName(prop.getProperty("validusername"))
		.passWord(prop.getProperty("validpassword"))
		.confirmPassword(prop.getProperty("validconfirmpassword"))
		.fullName(prop.getProperty("validfullname"))
		.emailId(prop.getProperty("validemailid"))
		.termsAndConditions()
		.registerButton()
		.backToLoginPage();

	}
    
    @Test(priority=1)
	public void regTestInvalidTestData() throws InterruptedException, IOException {
    	
		HomePage obj = new HomePage(driver);
		obj.registerClick()
		.userName(prop.getProperty("invalidusername"))
		.passWord(prop.getProperty("invalidpassword"))
		.confirmPassword(prop.getProperty("invaildconfirmpassword"))
		.fullName(prop.getProperty("invalidfullname"))
		.emailId(prop.getProperty("invalidemailaddress"))
		.termsAndConditions()
		.registerButton()
		.backToLoginPage();
	}

}
