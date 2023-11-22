package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_POM {
	
		@FindBy(xpath = "//a[text()='Calendar']")
		private WebElement Calendar;
		
		@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[1]/a/img")
		private WebElement Home;
		
		@FindBy(xpath = "//a[text()='Leads']")
		private WebElement Leads;
		
		@FindBy (xpath = "//a[text()='Organizations']")
		private WebElement Organizations;
		
		@FindBy (xpath = "//a[text()='Contacts']")//a[text()='Contacts']
		private WebElement Contacts;
		
		@FindBy(xpath = "//a[text()='Opportunities'")
		private WebElement Opportunities;
		
		@FindBy(xpath = "//a[text()='Products'")
		private WebElement Products;
		
		@FindBy(xpath="(//td[@class='small'])[2]")
		private WebElement Administrator;
		
		@FindBy(xpath = "//a[text()='Sign Out']")
		private WebElement Logout;
		
		public Home_Page_POM(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public WebElement getHome() {
			return Home;
		}

		public WebElement getAdministrator() {
			return Administrator;
		}
		
		public WebElement getCalendar()
		{
		return Calendar;
		}
		public WebElement getLeads()
		{
			return Leads;
		}
		public WebElement getOrganizations()
		{
			return Organizations;
		}
		public WebElement getContacts()
		{
			return Contacts;
		}
		public WebElement getOpportunities()
		{
			return Opportunities;
		}
		public WebElement getProducts()
		{
			return Products;
		}
		public WebElement getLogout()
		{
			return Logout;
		}
		
		

		/**
		 * business class for Calendar
		 */
		public void clickOperationCalendar() 
		{
			getCalendar().click();
		}

		
		/**
		 * business class for Leads
		 */
		public void clickOperationLeads() 
		{
			getLeads().click();
		}
		
		/**
		 * business class for Organizations
		 */
		public void clickoperationOrganizations()
		{
			getOrganizations().click();
		}
		
		/**
		 * business class for Contacts
		 */
		public void clickoperationContacts()
		{
			getContacts().click();
		}
		
		/**
		 * business class for Opportunities
		 */
		public void clickoperationOpportunities()
		{
			getOpportunities().click();
		}
		
		/**
		 * business class for Products
		 */
		public void clickoperationProducts()
		{
			getProducts().click();
		}
		
		/**
		 * business class for administrator
		 */
		public void clickOperationAdministrator()
		{
			getAdministrator().click();
		}
		
		/**
		 * business class for Signout
		 */
		public void clickOnLogoutOperation()
		{
			getAdministrator().click();
			getLogout().click();
		}
	

}
