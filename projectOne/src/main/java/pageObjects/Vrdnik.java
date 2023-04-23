package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Vrdnik extends BasePage{

	public Vrdnik() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By weatherBtn = By.linkText("Vremenska Prognoza");
	By vrdnikBtn = By.cssSelector("div:nth-of-type(5) .boxed-btn3-green-2");

	public WebElement getWeatherBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(weatherBtn);
	}

	public WebElement getVrdnikBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(vrdnikBtn);
	}

}
