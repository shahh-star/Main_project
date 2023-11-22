package testcaseRepo;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import objectRepository.Home_Page_POM;

public class TC_01 extends BaseClass {

@Test

public void calendarMod() throws Exception{
		Home_Page_POM HP=new Home_Page_POM(driver);
		HP.clickOperationCalendar();
	}
	
	
}
