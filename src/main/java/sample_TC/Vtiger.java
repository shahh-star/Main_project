package sample_TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import GenericUtility.PropertiesUtility;
import GenericUtility.Webdriverutility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPagePom;


public class Vtiger {
	
@Test	
public void checklogin() throws Exception{
	
	PropertiesUtility PUTIL =new PropertiesUtility();
	String URL     =PUTIL.getDataFromproperties("url");
	String USERNAME=PUTIL.getDataFromproperties("username");
	String PASSWORD=PUTIL.getDataFromproperties("password");
	
	Webdriverutility WUTIL= new Webdriverutility();
	
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64(119)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	WUTIL.implicitwaitinscript(driver);
	driver.get(URL);
	WUTIL.maximizeWindow(driver);
	LoginPagePom LPM=new LoginPagePom(driver);
	LPM.loginOperation(USERNAME, PASSWORD);
	driver.findElement(By.xpath("(//a[text()='Opportunities'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/Home.PNG']")).click();
	//driver.close();
	
	
}

}
