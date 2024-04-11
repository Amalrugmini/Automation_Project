package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.A2Zmatrimony_login;


public class A2Zmatrimony_logintest 
{
	WebDriver driver;
	@BeforeTest
	public void Web()
	{
		driver=new ChromeDriver();
		driver.get("https://www.a2zkeralawedding.com/");
	}
	@Test
	public void Matrimonytest() throws Throwable 
	{
		A2Zmatrimony_login am=new A2Zmatrimony_login(driver);
		am.Skipp();
		am.Title();
		am.Logo();
		am.Broken_link();
		am.Mouse_hover();
		am.User("Rahulkr@1998", "Rahulkr@123");
		am.Login();
		am.File_upload();
		am.Logout();
	}
	@AfterTest
	public void Close()
	{
		driver.quit();
	}

}
