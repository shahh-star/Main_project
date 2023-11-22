package GenericUtility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Webdriverutility {
	/*
	 * this method is used to maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/*
	 * this method is to perform implicit wait operation
	 * 
	 * @param driver
	 */
	public void implicitwaitinscript(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * this method is used to wait for a particular webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void explicitwait(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * this method is used to wait to perform click operation on a particular
	 * webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void explicitwaitforclickOnAnElement(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
//dropdown handling methods

	/**
	 * this methods is used to select dropdown by index value
	 * 
	 * @param element
	 * @param indexvalue
	 */
	public void selectOption(WebElement element, int indexvalue) {
		Select s = new Select(element);
		s.selectByIndex(indexvalue);
	}

	/**
	 * this method is used to select dropdown by string value
	 * 
	 * @param element
	 * @param value
	 */
	public void selectOption(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	/**
	 * this method is used to select dropdown by Visible text
	 * 
	 * @param element
	 * @param value
	 */
	public void selectOptionByVisibleText(WebElement element, String VisibleText) {
		Select s = new Select(element);
		s.selectByValue(VisibleText);
	}

	/**
	 * this method is used to deselect dropdown by Index value
	 * 
	 * @param element
	 * @param value
	 */
	public void deselectOption(WebElement element, int indexValue) {
		Select s = new Select(element);
		s.deselectByIndex(indexValue);
	}

	/**
	 * this method is used to deselect dropdown by String value
	 * 
	 * @param element
	 * @param value
	 */
	public void deselectOption(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	/**
	 * this method is used to deselect dropdown by Visible text
	 * 
	 * @param element
	 * @param value
	 */
	public void deselectOptionByVisibleText(WebElement element, String VisibleText) {
		Select s = new Select(element);
		s.deselectByVisibleText(VisibleText);
	}

	/**
	 * this method is used to deselect all dropdown options from dropdown
	 * 
	 * @param element
	 * @param value
	 */
	public void deselectAllOptions(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	/**
	 * this method is used to check if dropdown is multiselectable or not
	 * 
	 * @param element
	 * @param value
	 */
	public void checkDropdownismultiSelect(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();
	}
	// Mouse Actions handling methods

	/**
	 * this method is to move to a particular WebElement
	 * 
	 * @param drivera
	 * @param element
	 */
	public void movingtowardsElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * this method is to perform rightclick operation
	 * 
	 * @param driver
	 */
	public void rightClickOperation(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * this method is to perform rightClick operation on a particular WebElement
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	/**
	 * this method is for click operation
	 * 
	 * @param driver
	 */
	public void clickOperation(WebDriver driver) {
		Actions act = new Actions(driver);
		act.click().perform();
	}

	/**
	 * this method is for click operation on a particular WebElement
	 * 
	 * @param driver
	 */
	public void clickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}

	/**
	 * this method is for click operation
	 * 
	 * @param driver
	 */
	public void doubleClickOperaion(WebDriver driver) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	/**
	 * this method is for double click operation on a particular WebElement
	 * 
	 * @param driver
	 */
	public void doubleClickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	/**
	 * this method is to perform drag and drop operatopn
	 * 
	 * @param driver
	 * @param scr
	 * @param target
	 */
	public void dragAndDropOperation(WebDriver driver, WebElement src, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}

	/**
	 * this method is to handle sliders
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void dragAndDropSlider(WebDriver driver, WebElement src, int x, int y) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}

	/**
	 * this method is to perform scroll down operation
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollDownOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	// alert popup method
	/**
	 * this method is to accept alert
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * this method is to dismiss alert
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * this method is to fetch alert msg
	 * 
	 * @param driver
	 */
	public void fetchAlertMsg(WebDriver driver) {
		driver.switchTo().alert().getText();

	}

	// frame popup methods

	/**
	 * this method is to switch to frame based on index value
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * this method is to switch to frame based on the name
	 * 
	 * @param driver
	 * @param name
	 */
	public void switchToFrameByName(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * this method is to switch to frame based on the element
	 * 
	 * @param driver
	 * @param name
	 */
	public void switchToFrameByElement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * this method is to switch to frame based on the parent frame
	 * 
	 * @param driver
	 * @param name
	 */
	public void switchToFrameByImmediateParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	/**
	 * this method is to switch to main frame
	 * 
	 * @param driver
	 * @param name
	 */
	public void switchToMainFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// scroll down method

	/**
	 * this method is to perform scroll down operation based on JS
	 * 
	 * @param driver
	 * @param JSvalue
	 */
	public void scrollDownOperation(WebDriver driver, String jsValue) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(jsValue);
	}

	// window popup methods

	/**
	 * this method is to perform switching operations between windows
	 * 
	 * @param driver
	 * @param parentId
	 */
	public void switchToWindow(WebDriver driver, String ParentId) {
		Set<String> childIds = driver.getWindowHandles();
		Iterator<String> itr = childIds.iterator();
		while (itr.hasNext()) {
			String IDS = itr.next();
			String ALLIds = driver.switchTo().window(IDS).getTitle();
			if (ParentId.contains(ALLIds)) {
				break;
			}
		}
	}

	// ScreenShot Method
	/**
	 * this method is to capture screenshot
	 * 
	 * @param driver
	 * @param ScreenShotName
	 * @return
	 * @throws Exception
	 */
	public String screenShotCaptureMethod(WebDriver driver, String screenShotName) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\ScreenShot\\" + screenShotName + ".png";
		File dest = new File(path);
		Files.copy(scr, dest);
		String FinalPath = dest.getAbsolutePath();
		return FinalPath;
	}

	// incase of Element Unavailability Use this CustomizedClick Method
	/**
	 * customize wait to click an element
	 * 
	 * @param element
	 * @param Exception
	 */
	public void customizeClickOnElement(WebElement element) throws Exception {
		int count = 1;
		while (count < 10) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				Thread.sleep(2000);
				count++;
			}
		}
	}
}
