package test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC_008_ChangePassword extends ProjectSpecificationMethods {

	@BeforeTest
	public void data() throws IOException {

		testName = "ChangePassword Test";
		testDescription = "Testing the ChangePassword functionality";
		testAuthor = "Loganayaki";

	}

	@BeforeClass
	public void details() {

		testDetails();
		sheetName = "ChangePasswordTestData";
	}

	@Test(dataProvider = "excelRead")
	public void changePasswordTest(String userName, String password,String currentPass, String newPass, String confirmPass) throws InterruptedException {
		HomePage obj = new HomePage(driver);
		obj.clickLogin().loginUsername(userName).loginPassword(password).clickLoginButton().ClickChangePassWordLink().currentPassword(currentPass).newPassword(newPass)
				.confirmPassword(confirmPass).clickSubmit();
	}

}
