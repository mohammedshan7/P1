package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By path1=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By firstname=By.xpath("//*[@id=\"input-firstname\"]");
	By lastname=By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By phone=By.xpath("//*[@id=\"input-telephone\"]");
	By password=By.xpath("//*[@id=\"input-password\"]");
	By conpassword=By.xpath("//*[@id=\"input-confirm\"]");
	By policy=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By continue1=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By continue2=By.xpath("//*[@id=\"content\"]/div/div/a");
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void click()
	{
		driver.findElement(path1).click();	
		}
	public void click2()
	{
		driver.findElement(register).click();
	}
	public void setvalues(String first, String last,String mail, String num, String pass1, String pass2)
	{
		driver.findElement(firstname).sendKeys(first);
		driver.findElement(lastname).sendKeys(last);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(phone).sendKeys(num);
		driver.findElement(password).sendKeys(pass1);
		driver.findElement(conpassword).sendKeys(pass2);
	}
	public void click3()
	{
		driver.findElement(policy).click();
	}
	public void click4()
	{
		driver.findElement(continue1).click();
	}
	public void click5()
	{
		driver.findElement(continue2).click();
	}
}



