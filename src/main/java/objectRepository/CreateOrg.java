package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateOrg {
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement org;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;
	
	
	public WebElement getOrg() {
		return org;
	}
	public WebElement getOrgname() {
		return orgname;
	}
public CreateOrg(WebDriver driver)	{
	PageFactory.initElements(driver, this);;
}

public void createorg(String ONAME) throws Exception {
	getOrg().click();
	getOrgname().sendKeys(ONAME);
}
}
