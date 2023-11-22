package testcaseRepo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.Excelutility;
import GenericUtility.JavaUtility;
import objectRepository.CreateOrg;
import objectRepository.Home_Page_POM;

public class TC_03 extends BaseClass {

	@Test
public void organization2() throws Exception{
		
		JavaUtility JUTIL=new JavaUtility();
		int NUM=JUTIL.getRandomNumber();
		Home_Page_POM HP=new Home_Page_POM(driver);
		Excelutility EUTIL=new Excelutility();
		String ONAME=EUTIL.getDataFromExcel("Sheet1", 5, 2);
		HP.clickoperationOrganizations();
		CreateOrg COP=new CreateOrg(driver);
		COP.createorg(ONAME+NUM);
		
		WebElement element=driver.findElement(By.xpath("//select[@name='industry']"));
		element.click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Select s=new Select(element);
		//s.selectByIndex(2);
		driver.findElement(By.xpath("(//input[@value='  Save  '])[2]")).click();
        Thread.sleep(3000);
		
		
	}

}
