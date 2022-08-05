package test;

import java.awt.Toolkit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.config.Configuration;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.StitchMode;
import com.applitools.eyes.selenium.fluent.Target;

public class WebsiteMonitoring {

	public static void main(String[] args) {
		runTask();
	}

	@Test
	public static void runTask() {
		String url = System.getenv("URL");

		String testName = url;

		EyesRunner runner = null;

		runner = new ClassicRunner();

		Eyes eyes = new Eyes(runner);

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {

			Configuration sconf = eyes.getConfiguration();

			sconf.setApiKey(System.getenv("APPLITOOLS_API_KEY"));

			sconf.setViewportSize(new RectangleSize(1600, 800));

			sconf.setForceFullPageScreenshot(true);
			sconf.setStitchMode(StitchMode.CSS);

			sconf.setAppName(testName);

			sconf.setTestName(testName);

			eyes.setConfiguration(sconf);

			System.out.println("Navigating to " + url);
			driver.get(url);

			handleLazyLoad(driver);

			System.out.println("Open connection to Eyes");
			eyes.open(driver);

			System.out.println("Take screenshot");
			eyes.check(Target.window().fully());

			System.out.println("Close connection to Eyes");
			eyes.closeAsync();

			TestResultsSummary allTestResults = runner.getAllTestResults(false);

			System.out.println(allTestResults);

		} catch (Exception ex) {
			
			System.out.println(ex);

		} finally {

			eyes.abortAsync();
			driver.quit();
			
		}
	}

	private static void handleLazyLoad(WebDriver driver) throws InterruptedException {
		Long height = (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight;");
		for (int i = 0; i < height / 50; i++) {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,50);");
			Thread.sleep(200);
			height = (Long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight;");
		}
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0);");
	}

	private static void sleepy(int seconds) throws InterruptedException {
		Toolkit.getDefaultToolkit().beep();

		System.out.println("sleep " + seconds + " seconds");
		while (seconds-- > 0) {
			System.out.println(seconds);
			Thread.sleep(1000);
		}

	}

}
