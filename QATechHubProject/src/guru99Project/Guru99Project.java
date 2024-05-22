package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

	ChromeDriver driver;

	String url = "https://demo.guru99.com/v4/";

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Cameron R\\eclipse-workspace\\libs\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get(url);

	}

	public void login(String username, String password)

	{
		WebElement usernameElement = driver.findElement(By.name("uid"));

		usernameElement.sendKeys("mngr571021");

		driver.findElement(By.name("password")).sendKeys("edugEja");

		driver.findElement(By.name("btnLogin")).click();

	}

	public void addCustomer() {

		driver.findElement(By.linkText("New Customer")).click();

		driver.findElement(By.name("name")).sendKeys("Cheese Burger");

		driver.findElement(By.xpath("//input[@value='f']")).click();

		driver.findElement(By.name("dob")).sendKeys("06/21/2002");

		driver.findElement(By.name("addr")).sendKeys("94234 Gurgaon");

		driver.findElement(By.name("city")).sendKeys("Guragaon");

		driver.findElement(By.name("state")).sendKeys("Harayana");

		driver.findElement(By.name("pinno")).sendKeys("122001");

		driver.findElement(By.name("telephoneno")).sendKeys("1234445454");

		String emailId = ("Test" + System.currentTimeMillis() + "@abc.com");

		System.out.println(emailId);

		driver.findElement(By.name("emailid")).sendKeys(emailId);

		driver.findElement(By.name("password")).sendKeys("Pro@123");

		driver.findElement(By.name("sub")).click();

	}

	public String getCustomerId() {

		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();

	}

}
