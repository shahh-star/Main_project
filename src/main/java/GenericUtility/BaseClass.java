package GenericUtility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Home_Page_POM;
import objectRepository.LoginPagePom;

public class BaseClass {
	
	public DataBaseutility DUTIL=new DataBaseutility();
	public PropertiesUtility PUTIL =new PropertiesUtility();
	public Webdriverutility WUTIL=new Webdriverutility();
	public static WebDriver driver=null;

@BeforeSuite(alwaysRun=true)
public void dbConnectionEstablish() throws Exception
	{
	DUTIL.establishConnection();
	System.out.println("Connection established successfully");
	}
@BeforeClass(alwaysRun=true)
public void launchingBrowser() throws Exception
{
	String URL=PUTIL.getDataFromproperties("url");

	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(URL);
	WUTIL.implicitwaitinscript(driver);
	WUTIL.maximizeWindow(driver);
	System.out.println("Chrome Browser Launch successful");
	}
@BeforeMethod(alwaysRun=true)
public void loginOperation() throws Exception
{

	String USERNAME=PUTIL.getDataFromproperties("username");
	String PASSWORD=PUTIL.getDataFromproperties("password");
	LoginPagePom LP=new LoginPagePom(driver);
	LP.loginOperation(USERNAME, PASSWORD);
	System.out.println("Login done successfully");
	
}
@AfterMethod(alwaysRun=true)
public void logoutOperation() 
{
	Home_Page_POM HP=new Home_Page_POM(driver);
	HP.clickOperationAdministrator();
	HP.clickOnLogoutOperation();
	System.out.println("Logout done successfully");
	
}

@AfterClass(alwaysRun=true)
public void closeBrowserOperation() 
{
	driver.close();
	System.out.println("Browser closed successfully");
}
@AfterSuite
public void dbConnectionClosed() throws Exception
{
	DUTIL.closeConnection();
	System.out.println("Conection closed successfully");
}
}

