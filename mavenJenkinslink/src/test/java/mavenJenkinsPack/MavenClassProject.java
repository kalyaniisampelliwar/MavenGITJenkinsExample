package mavenJenkinsPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MavenClassProject {
	RemoteWebDriver rmtDriver;
	@Test
	public void gridMethod() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_WebDriver\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");		
		rmtDriver = new RemoteWebDriver(new URL("http://192.168.0.7:4444/wd/hub"),cap);
		rmtDriver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
	}
	
	@AfterTest
	void tearDown() {
		// make sure to close your WebDriver:
		rmtDriver.quit();
	}
	
}
