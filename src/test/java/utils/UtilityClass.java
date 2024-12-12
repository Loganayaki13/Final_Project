package utils;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {
	
	public static WebDriver driver;
	public static WebElement ele;
	public static String expectedResult;	
	public static Properties prop;
	public static String expectedValue;
	public static String orderId;
	public static String sheetName;
	
	//public String filename;
	public void browserLaunch(String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void visibilityOfElement(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void sendKeysMethod(WebElement ele,String input)
	{
		ele.sendKeys(input);
	}
	public void logout()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	
	public void browserClose()
	{
		driver.close();
	}
	public static void readFromPropFile() throws IOException
	{
		FileReader file=new FileReader("C:\\Users\\Asus\\eclipse-workspace\\JATCapstoneProject-1-Version-1\\src\\test\\resources\\testData\\loginTestData.properties");
		prop=new Properties();
		prop.load(file);
	}

}
