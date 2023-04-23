package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Additions extends BasePage{

	public Additions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By pubLink = By.cssSelector("a:nth-of-type(1) > b");
	By restaurantLink = By.cssSelector("a:nth-of-type(2) > b");


	public WebElement getPubLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(pubLink);
	}

	public WebElement getRestaurantLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(restaurantLink);
	}

}
