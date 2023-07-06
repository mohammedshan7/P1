package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page1.Loginpage;



public class Testpage {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() throws InterruptedException
	{
		Loginpage id=new Loginpage(driver);
		Thread.sleep(3000);
		id.click();
		Thread.sleep(3000);
		id.click2();
		Thread.sleep(3000);
		id.setvalues("mohammed", "sha", "mohammedsha236@gmail.com", "8089773703", "shan@09", "shan@09");
		Thread.sleep(3000);
		id.click3();
		Thread.sleep(3000);
		id.click4();
		Thread.sleep(3000);
		id.click5();
		
	}

	}



