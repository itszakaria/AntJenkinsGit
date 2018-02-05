package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass01 {
	static WebDriver driver;
	
	@Test
	public static void anTTesting(){

		System.setProperty("webdriver.chrome.driver", "C://lib_drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("ant Practice");
	}
}
