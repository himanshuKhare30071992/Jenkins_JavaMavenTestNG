package coronaCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javaSeleniumCode.CoronaTestBase;

public class MH //extends CoronaTestBase
{
	WebDriver driver;
	
  @Test
  public void positiveCases()
  {
	  driver = CoronaTestBase.init(); 
	  System.out.println("============MAHARASHTRA============");
	  WebElement ele =	driver.findElement(By.xpath("//span[@class='actual__title-wrapper' and text()='Maharashtra']/../../..//span[@class='table__count-text'][1]"));
	  String positiveCount = ele.getText();
	  System.out.println(">>>>>>> Positive Corona Cases in MH  >>>>>>> "+positiveCount);
	  driver.quit();
  }

}

