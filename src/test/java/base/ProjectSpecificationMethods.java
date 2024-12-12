package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {
	//Launching the browser
	@Parameters({"browser"})
	@BeforeMethod
	public void LaunchAndLoadURL(String browser)
	{
		browserLaunch(browser);
	}
	//Closing the browser
    @AfterMethod
	public void closeBrowser()
	{
		browserClose();
	}
}
