package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.A2Zmatrimony_Register;


public class A2Zmatrimony_Registertest 
{
	WebDriver driver;
	@BeforeTest
	public void Web()
	{
		driver=new ChromeDriver();
		driver.get("https://www.a2zkeralawedding.com/Authenticate/register");
	}
	@Test
	
	public void Matrimony() throws InterruptedException, IOException 
	{
		A2Zmatrimony_Register mr=new A2Zmatrimony_Register(driver);
		mr.Drop_down();
		mr.Fullname("Rahul KR");
		mr.Gender();
		mr.Drop_down1();
		mr.Date_picker();
		mr.Drop_down2();
		mr.State();
		mr.District();
		mr.Nation();
		mr.Religion();
		mr.Caste();
		mr.Star();
		mr.Rasi();
		mr.Zodiac();
		mr.Jathakam();
		mr.Check_box();
		mr.Education();
		mr.Occupation();
		mr.Contact("9447513863","9447513863","rahulrk8991@gmail.com");
		mr.User("Rahulkr@1998", "Rahulkr@123", "Rahulkr@123");
		mr.Screen();
		mr.Submit();
	}
	@AfterTest
	public void Close()
	{
		driver.quit();
	}


}
