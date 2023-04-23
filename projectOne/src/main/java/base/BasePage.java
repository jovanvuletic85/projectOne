package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {

	private String url;
	private Properties prop;

	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(

				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");

		prop.load(data);
	}

	public WebDriver getDriver() throws IOException {

		return WebDriverInstance.getDriver();
	}

	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;
	}
}
