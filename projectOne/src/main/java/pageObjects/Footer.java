package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Footer extends BasePage{

	public Footer() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;

	By instagramLink = By.cssSelector(".socail_links .fa-instagram");
	By facebookLink = By.cssSelector(".ti-facebook");
	By srLanguageLink = By.cssSelector("li:nth-of-type(3) > i > a");
	By enLanguageLink = By.cssSelector("li:nth-of-type(4) > i > a");
	By emailLink = By.cssSelector("[class='col-xl-3 col-md-6 col-lg-2'] [href]");
	By logoLink = By.cssSelector(".footer_top > .container img");
	By aboutUsLink = By.cssSelector(".footer_widget > ul > li:nth-of-type(1) > a");
	By reservationsLink = By.cssSelector(".footer_widget > ul > li:nth-of-type(2) > a");
	By additionsLink = By.cssSelector("[class='col-xl-3 offset-xl-1 col-md-6 col-lg-3'] [href='\\.\\/additions\\.html']");
	By vrdnikLink = By.cssSelector(".footer_widget > ul > li:nth-of-type(4) > a");
	By contactLink = By.cssSelector(".footer_widget > ul > li:nth-of-type(5) > a");
	By brvnaraAvaLink=By.linkText("brvnaraAva");

	public WebElement getInstagramLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(instagramLink);
	}

	public WebElement getFacebookLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(facebookLink);
	}

	public WebElement getSrLanguageLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(srLanguageLink);
	}

	public WebElement getEnLanguageLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(enLanguageLink);
	}

	public WebElement getEmailLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(emailLink);
	}

	public WebElement getLogoLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(logoLink);
	}

	public WebElement getAboutUsLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(aboutUsLink);
	}

	public WebElement getReservationsLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(reservationsLink);
	}

	public WebElement getAdditionsLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(additionsLink);
	}

	public WebElement getVrdnikLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(vrdnikLink);
	}

	public WebElement getContactLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(contactLink);
	}
	public WebElement getBrvnaraAvaLink() throws IOException {
		this.driver=getDriver();
		return driver.findElement(brvnaraAvaLink);
	}

}
