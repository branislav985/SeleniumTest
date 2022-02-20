package selenium;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
	

	class ChromeTest {

	    

	}
@BeforeClass
public static void setupClass() {
	WebDriverManager.chromedriver().setup();
}

@Test
public void smartTest() {
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.wikipedia.com/");
	driver.quit();
	
}
}
