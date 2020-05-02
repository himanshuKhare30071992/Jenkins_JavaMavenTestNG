package javaSeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaTestBase 
{
	public static WebDriver driver;
	
	public static WebDriver init()
	{
		//System.out.println(">>> init method called >>>");
		driver = new ChromeDriver();
		driver.get("https://www.covid19india.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String totalCase = driver.findElement(By.xpath("//div[@class='level-item is-cherry fadeInUp']//h1")).getText();
		System.out.println("===TOTAL POSITIVE CASES IN INDIA==="+totalCase);
		return driver;
		
	}

}
