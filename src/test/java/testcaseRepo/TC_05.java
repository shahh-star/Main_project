package testcaseRepo;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excelutility;
import GenericUtility.JavaUtility;
import objectRepository.CreateContacts;
import objectRepository.Home_Page_POM;

public class TC_05 extends BaseClass {

@Test
public void contacts() throws Exception{

	JavaUtility JUTIL=new JavaUtility();
	int NUM=JUTIL.getRandomNumber();
	Excelutility EUTIL=new Excelutility();
	String LNAME=EUTIL.getDataFromExcel("Sheet1", 2, 3);
	
	Home_Page_POM HP=new Home_Page_POM(driver);
	CreateContacts Con=new CreateContacts(driver);
	HP.clickoperationContacts();
	Con.createcontact(LNAME+NUM);
	
	driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
    String parentID=driver.getWindowHandle();
    Set<String>childID= driver.getWindowHandles();
    for(String allID:childID) {
    	if(!parentID.equals(childID))
    	{    
    		
    		driver.switchTo().window(allID);
    	}
    	
    }
    driver.findElement(By.xpath("//a[@id='1']")).click(); 
    driver.switchTo().window(parentID);
    Con.getSave().click();
}
}
