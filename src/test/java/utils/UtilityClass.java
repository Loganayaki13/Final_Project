package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePage;

public class UtilityClass {

	public static WebDriver driver;
	public static WebElement ele;
	public static String expectedResult;
	public static Properties prop;
	public static String expectedValue;
	public static String orderId;
	public static String sheetName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName, testDescription, testAuthor;

	public void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public void visibilityOfElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void sendKeysMethod(WebElement ele, String input) {
		ele.sendKeys(input);
	}

	public void logout() {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

	}

	public HomePage clickLogout() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(5000);
		return new HomePage(driver);
	}

	public void browserClose() {
		driver.close();
	}

	public static void propFileData() throws IOException {
		FileReader file = new FileReader(
				"C:\\Users\\Asus\\eclipse-workspace\\JATCapstoneProject-1-Version-1\\src\\test\\resources\\testData\\loginTestData.properties");
		prop = new Properties();
		prop.load(file);
	}

	public static String[][] excelRead(String sheetName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook(
				"C:\\Users\\Asus\\eclipse-workspace\\JATCapstoneProject-1-Version-1\\src\\test\\resources\\testData\\AdactinHotel.xlsx");

		XSSFSheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount];

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}
		}
		book.close();
		return data;

	}

	public static String screenshot(String name) throws IOException {

		String path = "C:\\Users\\Asus\\eclipse-workspace\\JATCapstoneProject-1-Version-1\\ScreenShots\\" + name
				+ ".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		return path;

	}

}
