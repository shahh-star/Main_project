package testcaseRepo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excelutility;
import objectRepository.CreateContacts;
import objectRepository.Home_Page_POM;

@Test
public class TC_02 extends BaseClass{
	
public void organization() throws Exception {
	Home_Page_POM HP=new Home_Page_POM(driver);
	HP.clickoperationOrganizations();
	Excelutility EUTIL=new Excelutility();
	String ONAME=EUTIL.getDataFromExcel("Sheet1", 5, 2);
	CreateContacts Con=new CreateContacts(driver);
	Con.createcontact(ONAME);
	
	driver.findElement(By.xpath("(//input[@value='  Save  '])[2]")).click();
}
	

}
