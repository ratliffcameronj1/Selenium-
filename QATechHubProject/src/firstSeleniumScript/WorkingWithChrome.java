package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	String url = "https://test.qatechhub.com/";

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cameron R\\eclipse-workspace\\libs\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
	}

	public void closeBrowser() {
		// driver.close(); //To close current active window

		driver.quit(); // To close all windows

	}

	public static void main(String[] args) {

		WorkingWithChrome wc = new WorkingWithChrome();

		wc.invokeBrowser();

		wc.closeBrowser();
	}

}
