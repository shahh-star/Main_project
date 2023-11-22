package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LisetenersImplementation implements ITestListener {
	ExtentTest test;
	ExtentReports Reports;

	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.INFO, methodname + "Execution Starts");
	}

	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname + "Execution Pass");
	}

	public void onTestFailure(ITestResult result) {
		Webdriverutility WUTIL = new Webdriverutility();
		JavaUtility JUTIL = new JavaUtility();
		String methodname = result.getMethod().getMethodName() + JUTIL.getDateUsingCalendar();
		test.log(Status.FAIL, methodname + "Is failed");
		test.log(Status.FAIL, result.getThrowable());

		try {
			WUTIL.screenShotCaptureMethod(BaseClass.driver, methodname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname + "Is Skipped");
		test.log(Status.SKIP, result.getThrowable());

		// this get throwable will give you exact status
	}

	public void onStart(ITestContext context) {
		// basic configuartions
		ExtentSparkReporter htmlreport = new ExtentSparkReporter(
				".\\ExtentReport-" + new JavaUtility().getDateUsingCalendar() + ".html");
		htmlreport.config().setDocumentTitle("V tiger Report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("Extent Report");

		// generate report
		Reports = new ExtentReports();
		Reports.attachReporter(htmlreport);
		Reports.setSystemInfo("browser", "chrome");
		Reports.setSystemInfo("Author Name", "Shoeb");
		Reports.setSystemInfo("Platform", "Windows");
		Reports.setSystemInfo("Url", "http://localhost:8888/");
		Reports.setSystemInfo("Environment Name", "Testing");
	}

	public void onFinish(ITestContext Context) {
		Reports.flush();
	}

}
