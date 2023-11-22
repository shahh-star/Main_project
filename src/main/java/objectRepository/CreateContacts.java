package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContacts {
	
@FindBy(xpath="//img[@alt='Create Contact...']")
private WebElement contact;

@FindBy(xpath="//input[@name='lastname']")
private WebElement lname;

@FindBy(xpath="(//input[@value='  Save  '])[2]")
private WebElement save;

public CreateContacts(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getContact() {
	return contact;
}

public WebElement getLname() {
	return lname;
}

public WebElement getSave() {
	return save;
}

public void createcontact(String LNAME)
{
	getContact().click();
	getLname().sendKeys(LNAME);
}

	}


