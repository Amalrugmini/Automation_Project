package page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class A2Zmatrimony_login 
{
	WebDriver driver;
	By Email=By.xpath("//*[@id=\"Email\"]");
	By Pswd=By.xpath("//*[@id=\"UserKey\"]");
	By Login=By.xpath("//*[@id=\"Loginbtn\"]");
	By Register=By.xpath("//*[@id=\"headlogin\"]/div[2]/div[2]/a");
	By Skipp=By.xpath("//*[@id=\"wappModal\"]/div/div/a");
    By Logo=By.xpath("//*[@id=\"header\"]/div/div[1]/div/div/div/div[1]/a/img");
    By Search=By.xpath("//*[@id=\"msearch\"]/a");
	By As=By.xpath("//*[@id=\"msearch_adv\"]/a");
	By Photo=By.xpath("//*[@id=\"ms_gal\"]");
	By File=By.xpath("//*[@id=\"file\"]");
	By Btn=By.xpath("//*[@id=\"bgalsetting\"]");
	By Upload=By.xpath("//*[@id=\"btnupload\"]");
	By Alert=By.xpath("//*[@id=\"page-content\"]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/a");
	By Log=By.xpath("//*[@id=\"header\"]/div/div[1]/div/div/div/div[3]/div/a");
	By Log1=By.xpath("//*[@id=\"header\"]/div/div[1]/div/div/div/div[3]/div/ul/li[3]/a");
    public A2Zmatrimony_login (WebDriver driver)
    {
	   this.driver=driver;
    }
    public void Skipp()
    {
    	driver.findElement(Skipp).click();
    }
    public void Title()
	{

		String expected="Kerala Matrimony Site-Marriage Bureau- A2Z Kerala Wedding";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
    public void Logo()
	{
		boolean logo=driver.findElement(Logo).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is Present");
		}
		else
		{
			System.out.println("Logo is Not Present");
		}
	}
    public void Broken_link()
	{
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  System.out.println("Total N.of Links:"+links.size());
	  for(WebElement link:links)
	    {
			String s=link.getAttribute("href");
			System.out.println(s+"   "+link.getText());
	try
	{
	HttpURLConnection h=(HttpURLConnection)(new URL(s).openConnection());	
	h.connect();
	if(h.getResponseCode()>=400)
	{
		System.out.println("Broken Links");
	}
	else
	{
		System.out.println("Valid Links");
	}
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	   
	}
}
    public void Mouse_hover() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement e=driver.findElement(Search);
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		Thread.sleep(5000);
		driver.findElement(As).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}	
    public void User(String mail,String pwd)
    {
    	driver.findElement(Email).sendKeys(mail);
    	driver.findElement(Pswd).sendKeys(pwd);
    }
    public void Login()
    {
       driver.findElement(Login).click();
    }
	public void File_upload() throws InterruptedException  
	{
		driver.findElement(Photo).click();
		driver.findElement(File).sendKeys("C:\\Users\\user\\Downloads\\Rahulkr.png");
		driver.findElement(Upload).click();
		Thread.sleep(5000);
	}
	public void Logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(Log).click();
		driver.findElement(Log1).click();
	}
	
    

}
