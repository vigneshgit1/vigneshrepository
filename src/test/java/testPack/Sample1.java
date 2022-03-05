package testPack;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.manage().window().maximize();
	}
	@BeforeMethod 
	private void startTime()
	{
		Date d=new Date();
		System.out.println(d);
		driver.get("https://www.bestbuy.com/#?intl=nosplash");
	}
	
	
	@Test
	private void run() throws InterruptedException {
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("(//a[@class='canada-link'])[1]"));
		c.click();
//			driver.findElement(By.xpath("//button[@class='c-close-icon c-modal-close-icon']")).click();
		
		
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.xpath("//input[@class='textField_XaJoz']"));
		d.sendKeys("iphone13");
		driver.findElement(By.xpath("//button[@class='searchButton_2mES- fitContainer_2HpHA']")).click();
		
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	private void endTime() {
		Date d=new Date();
		System.out.println(d);

	}

	@AfterClass
	private void close(){

//		driver.close();

	}


}
