package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://linkedin.com");
		// to maximize the window
		driver.manage().window().maximize();

		// finding the element using the locator
		driver.findElement(By.name("session_key")).sendKeys("Alphonsa");

	}

}
