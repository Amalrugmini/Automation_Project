package page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class A2Zmatrimony_Register 
{
	WebDriver driver;
	By DD=By.xpath("//*[@id=\"CreatedForID\"]");
	By Fname=By.xpath("//*[@id=\"FirstName\"]");
	By Gen=By.xpath("//*[@id=\"Gender\"]");
	By DD1=By.xpath("//*[@id=\"MaritalStatusID\"]");
	By Date=By.xpath("//*[@id=\"Dob\"]");
	By Month=By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]");
	By Year=By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]");
	By Prev=By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[1]");
	By Month1=By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[contains(text(),'Jul')]");
	By Day=By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[contains(text(),'7')]");
	By Lang=By.xpath("//*[@id=\"MotherTongueLingualID\"]");
	By State=By.xpath("//*[@id=\"ddstate\"]");
	By Dstr=By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/form/div/div[7]/div[2]/div/select");
	By Nation=By.xpath("//*[@id=\"CCodeJson\"]");
	By Rel=By.xpath("//*[@id=\"ddLReligion\"]");
	By Caste=By.xpath("//*[@id=\"ddLCaste\"]");
	By Star=By.xpath("//*[@id=\"StarID\"]");
	By Rasi=By.xpath("//*[@id=\"RaasiID\"]");
	By Zo=By.xpath("//*[@id=\"ZodiacID\"]");
	By Su=By.xpath("//*[@id=\"regform\"]/div/div[13]/div[1]/div/select");
	By Check=By.xpath("//*[@id=\"AUserFKey_AUserReligion_MarryOtherCommunity\"]");
	By Edu=By.xpath("//*[@id=\"ddLEdu\"]");
	By Ocu=By.xpath("//*[@id=\"ddLOcu\"]");
	By Contact=By.xpath("//*[@id=\"ContactNo\"]");
	By Mobile=By.xpath("//*[@id=\"MobileNo\"]");
	By Email=By.id("EmailAddress");
	By Un=By.xpath("//*[@id=\"UserName\"]");
	By Pass=By.xpath("//*[@id=\"userKey\"]");
	By Cpass=By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/form/div/div[17]/div[2]/div/input");
	By Sub=By.xpath("//*[@id=\"regform\"]/div/div[18]/div/input");
	public A2Zmatrimony_Register(WebDriver driver)
	 {
	   this.driver=driver;
	 }
	public void Drop_down()
	{
		WebElement create=driver.findElement(DD);
		Select createelement=new Select(create);
		createelement.selectByIndex(1);
	}
	public void Fullname(String name)
	{
		driver.findElement(Fname).sendKeys(name);
	}
	public void Gender()
	{
		driver.findElement(Gen).click();
	}
	public void Drop_down1()
	{
		WebElement marital=driver.findElement(DD1);
		Select maritalelement=new Select(marital);
		maritalelement.selectByIndex(4);
		
	}
	public void Date_picker() throws InterruptedException
	{
		driver.findElement(Date).click();
		driver.findElement(Month).click();
		String year="1998";
		Thread.sleep(2000);
		while(true)
		{
			String Actyear=driver.findElement(Year).getText();
			if(Actyear.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement(Prev).click();
			}
		}
		driver.findElement(Month1).click();
		driver.findElement(Day).click();
		
	}
	public void Drop_down2()
	{
		WebElement language=driver.findElement(Lang);
		Select languageelement=new Select(language);
		languageelement.selectByIndex(7);
	}
	public void State()
	{
		WebElement state=driver.findElement(State);
		Select stateelement=new Select(state);
		stateelement.selectByVisibleText("Kerala");
	}
	public void District() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement district=driver.findElement(Dstr);
		Select districtelement=new Select(district);
		districtelement.selectByIndex(3);
		//driver.findElement(Dstr).click();
		//driver.findElement(Value).click();
	}
	public void Nation()
	{
		WebElement nationality=driver.findElement(Nation);
		Select nationalityelement=new Select(nationality);
		nationalityelement.selectByVisibleText("India");
	}
	public void Religion()
	{
		WebElement religion=driver.findElement(Rel);
		Select religionelement=new Select(religion);
		religionelement.selectByIndex(4);
	}
	public void Caste() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement caste=driver.findElement(Caste);
		Select casteelement=new Select(caste);
		casteelement.selectByVisibleText("SC");
	}
	public void Star()
	{
		WebElement ss=driver.findElement(Star);
		Select starselement=new Select(ss);
		starselement.selectByVisibleText("Pooram");
	}
	public void Rasi()
	{
		WebElement rasi=driver.findElement(Rasi);
		Select rasielement=new Select(rasi);
		rasielement.selectByVisibleText("Makaram");
	}
	public void Zodiac()
	{
		WebElement zodiac=driver.findElement(Zo);
		Select zodiacelement=new Select(zodiac);
		zodiacelement.selectByVisibleText("Leo");
	}
	public void Jathakam()
	{
		WebElement jathakam=driver.findElement(Su);
		Select jathakamelement=new Select(jathakam);
		jathakamelement.selectByIndex(0);
	}
	public void Check_box()
	{
		driver.findElement(Check).click();
	}
	public void Education()
	{
		WebElement education=driver.findElement(Edu);
		Select educationelement=new Select(education);
		educationelement.selectByVisibleText("Under Graduation");
	}
	public void Occupation()
	{
		WebElement occupation=driver.findElement(Ocu);
		Select occupationelement=new Select(occupation);
		occupationelement.selectByVisibleText("Assistant");
	}
	public void Contact(String contact,String Mob,String mail)
	{
		driver.findElement(Contact).sendKeys(contact);
		driver.findElement(Mobile).sendKeys(Mob);
		driver.findElement(Email).sendKeys(mail);
	}
	public void User(String uname,String pswd,String pwd)
	{
		driver.findElement(Un).sendKeys(uname);
		driver.findElement(Pass).sendKeys(pswd);
		driver.findElement(Cpass).sendKeys(pwd);
	}
	public void Screen() throws IOException
	{
		File SS=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(SS, new File("C:\\Users\\user\\Desktop\\Git\\Register.png"));
	}
	
	public void Submit()
	{
		driver.findElement(Sub).click();
	}

}
