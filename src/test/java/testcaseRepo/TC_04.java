package testcaseRepo;

import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.Excelutility;
import GenericUtility.JavaUtility;
import objectRepository.CreateContacts;
import objectRepository.Home_Page_POM;

public class TC_04 extends BaseClass{
	
@Test
public void contact() throws Exception{

JavaUtility JUTIL=new JavaUtility();
int NUM=JUTIL.getRandomNumber();
Excelutility EUTIL=new Excelutility();

String LNAME=EUTIL.getDataFromExcel("Sheet1", 2, 3);	
Home_Page_POM HP=new Home_Page_POM(driver);
CreateContacts Con=new CreateContacts(driver);
HP.clickoperationContacts();
Con.createcontact(LNAME+NUM);
Con.getSave().click();

}

}
