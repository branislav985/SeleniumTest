package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	

@BeforeClass
public static void setupClass() {
	WebDriverManager.chromedriver().setup();
}

@Test
public void smartTest() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.wikipedia.com/");
		Thread.sleep(3000);
	driver.quit();


}
}
