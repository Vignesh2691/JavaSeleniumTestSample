package br.com.afc;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.bonigarcia.wdm.ChromeDriverManager;

@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractTest {

	protected WebDriver driver;

	@BeforeClass
	public static void setupDriver() {
		ChromeDriverManager.getInstance().setup();
	}

	@Before
	public void initWebDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void closeWebDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}
