package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{


	public Homepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver;

	By imageOne = By.cssSelector("a[alt='brvnareAlaVrdnik14'] > .single-gallery-image");
	By imageTwo = By.cssSelector("a[alt='brvnareAlaVrdnik15'] > .single-gallery-image");
	By imageThree = By.cssSelector("a[alt='brvnareAlaVrdnik14'] > .single-gallery-image");
	By imageFour = By.cssSelector("a[alt='brvnareAlaVrdnik12'] > .single-gallery-image");
	By imageFive = By.cssSelector("a[alt='brvnareAlaVrdnik13'] > .single-gallery-image");
	By imageSix = By.cssSelector("a[alt='brvnareAlaVrdnik1'] > .single-gallery-image");
	By imageSeven = By.cssSelector("a[alt='brvnareAlaVrdnik4'] > .single-gallery-image");
	By imageEight = By.cssSelector("a[alt='brvnareAlaVrdnik8'] > .single-gallery-image");
	By arrowRightBtn = By.cssSelector(".mfp-arrow-right");
	By arrowLeftBtn = By.cssSelector(".mfp-arrow-left");
	By counter = By.cssSelector(".mfp-counter");
	By closeBtn = By.cssSelector(".mfp-close");
	By contactBtn = By.linkText("Contact Us");


	public WebElement getImageOne() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageOne);
	}

	public WebElement getImageTwo() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageTwo);
	}

	public WebElement getImageThree() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageThree);
	}

	public WebElement getImageFour() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageFour);
	}

	public WebElement getImageFive() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageFive);
	}

	public WebElement getImageSix() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageSix);
	}

	public WebElement getImageSeven() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageSeven);
	}

	public WebElement getImageEight() throws IOException {
		this.driver=getDriver();
		return driver.findElement(imageEight);
	}

	public WebElement getArrowRightBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(arrowRightBtn);
	}

	public WebElement getArrowLeftBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(arrowLeftBtn);
	}

	public WebElement getCounter() throws IOException {
		this.driver=getDriver();
		return driver.findElement(counter);
	}

	public WebElement getCloseBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(closeBtn);
	}

	public WebElement getContactBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(contactBtn);
	}

}
