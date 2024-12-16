package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass {

	@BeforeSuite
	public void reportInitilization() {
		String path = "C:\\Users\\Asus\\eclipse-workspace\\JATCapstoneProject-1-Version-1\\reports\\Adactin App\\AdactinReport.html";
		// To create report in the given location
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Adactin Report");

		// To capture test data
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	public void testDetails() {
		test = extent.createTest(testAuthor, testDescription);
		test.assignAuthor("Loganayaki");

	}

	// Launching the browser
	@Parameters({ "browser" })
	@BeforeMethod
	public void LaunchAndLoadURL(String browser) {
		browserLaunch(browser);
	}

	@DataProvider(name = "excelRead")
	public String[][] excelRead() throws IOException {
		return excelRead(sheetName);

	}

	// Closing the browser
	@AfterMethod
	public void closeBrowser() {
		browserClose();
	}

	@AfterSuite

	public void reportClose() {
		extent.flush();
	}
}
