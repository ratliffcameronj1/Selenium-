
package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignment {
	ChromeDriver driver;

	String url = "https://test.qatechhub.com/";

	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cameron R\\eclipse-workspace\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public void verifyPageTitle() {
		String expectedTitle = "Test QA Tech Hub – Learning By Doing is the best way to learn!";
		String actualTitle = driver.getTitle();

		{
			System.out.printf(actualTitle);

			{
				System.out.print('\n');

			}

			if (actualTitle.equals(expectedTitle)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
	}

	public void navigateCommands() {
		// Navigates to a Particular URL

		driver.navigate().to("https://www.Facebook.com");

		// Navigating back in the browsing history

		driver.navigate().back();

		// Getting the URL of the current web Page

		String urlFromWebpage = driver.getCurrentUrl();

		System.out.println(urlFromWebpage);

		// Navigating forward in the browsing history

		driver.navigate().forward();

		// Reloading the page

		driver.navigate().refresh();

	}

	public void closeBrowser() {
		// .quit() method is used to close all the windows which are opened, here you
		// can also use .close() to close the window
		driver.quit();
	}

	// Executing the code via main method
	public static void main(String[] args) {
		FirstAssignment fa = new FirstAssignment();
		fa.invokeBrowser();
		fa.verifyPageTitle();
		fa.navigateCommands();
		fa.closeBrowser();

	}
}
