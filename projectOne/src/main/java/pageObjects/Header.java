package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Header extends BasePage {

	public Header() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By instagramLink = By.cssSelector(".social_media_links .fa-instagram");
	By facebookLink = By.cssSelector(".fa-facebook");
	By srLanguageLink = By.xpath("//a[@href='../index.html']/i[.='  Sr']");
	By enLanguageLink = By.xpath("//a[@href='index.html']/i[.='En']");
	By emailLink = By.cssSelector(".fa-envelope");
	By phoneNumberLink = By.cssSelector(".fa-phone");
	By logoLink = By.cssSelector(".aligncenter img");
	By aboutUsLink = By.cssSelector("ul#navigation  .active");
	By reservationsLink = By.cssSelector("ul#navigation > li:nth-of-type(2) > a");
	By additionsLink = By.cssSelector("ul#navigation > li:nth-of-type(3) > a");
	By vrdnikLink = By.cssSelector("ul#navigation > li:nth-of-type(4) > a");
	By geographyLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-geography']");
	By climateLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-climate']");
	By tourismLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-tourism']");
	By culturalLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-culture']");
	By manifestationsLink = By.cssSelector("#navigation [href='\\.\\/vrdnik\\.html\\#Vrdnik-manifestations']");
	By contactLink = By.cssSelector("ul#navigation > li:nth-of-type(5) > a");
	By bookAccommodationBtn = By.cssSelector("div:nth-of-type(4) .boxed-btn3");
	By headerTitle = By.cssSelector(".bradcam_text h3");

	public WebElement getInstagramLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(instagramLink);
	}

	public WebElement getFacebookLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(facebookLink);
	}

	public WebElement getSrLanguageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(srLanguageLink);
	}

	public WebElement getEnLanguageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(enLanguageLink);
	}

	public WebElement getEmailLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(emailLink);
	}

	public WebElement getPhoneNumberLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(phoneNumberLink);
	}

	public WebElement getLogoLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(logoLink);
	}

	public WebElement getAboutUsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(aboutUsLink);
	}

	public WebElement getReservationsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(reservationsLink);
	}

	public WebElement getAdditionsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(additionsLink);
	}

	public WebElement getVrdnikLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(vrdnikLink);
	}

	public WebElement getGeographyLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(geographyLink);
	}

	public WebElement getClimateLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(climateLink);
	}

	public WebElement getTourismLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(tourismLink);
	}

	public WebElement getCulturalLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(culturalLink);
	}

	public WebElement getManifestationsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(manifestationsLink);
	}

	public WebElement getContactLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contactLink);
	}

	public WebElement getBookAccommodationBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(bookAccommodationBtn);
	}
	
	public WebElement getHeadertitle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(headerTitle);
	}

}
