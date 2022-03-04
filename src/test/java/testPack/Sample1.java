package testPack;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static WebDriver driver;

	@BeforeClass
	private void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@BeforeMethod 
	private void startTime()
	{
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test(groups="smoke",priority=1,invocationCount=3)
	private void tc1()

	{
		System.out.println("TestCase 1");
	}

	@AfterMethod
	private void endTime() {
		Date d=new Date();
		System.out.println(d);

	}

	@AfterClass
	private void close(){

		driver.close();

	}


}
