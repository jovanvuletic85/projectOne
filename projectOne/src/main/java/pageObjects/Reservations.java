package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Reservations extends BasePage {

	public Reservations() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By bookingLink = By.cssSelector("div:nth-of-type(3) a[target='_blank'] > b");
	By emailLink = By.cssSelector("div:nth-of-type(4) a");
	By leftBtn = By.cssSelector(".ti-angle-left");
	By rightBtn = By.cssSelector(".owl-next");
	By bookAccommodationBtn = By.linkText("Book Accommodation");

	public WebElement getBookingLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(bookingLink);
	}

	public WebElement getEmailLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(emailLink);
	}

	public WebElement getLeftBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(leftBtn);
	}

	public WebElement getRightBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(rightBtn);
	}

	public WebElement getBookAccommodationBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(bookAccommodationBtn);
	}
}
