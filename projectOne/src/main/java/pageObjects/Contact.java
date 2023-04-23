package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Contact extends BasePage {

	public Contact() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;

	By messageField = By.cssSelector("textarea#message");
	By messageFieldError=By.cssSelector("label");
	By nameField = By.cssSelector("input#name");
	By nameFieldError=By.cssSelector("#contactForm [class='col-sm-6']:nth-of-type(2) label");
	By emailField = By.cssSelector("input#email");
	By emailFieldError=By.cssSelector("#contactForm [class='col-sm-6']:nth-of-type(3) label");
	By subjectField = By.cssSelector("input#subject");
	By subjectFieldError=By.cssSelector("#contactForm [class='col-12']:nth-of-type(4) label");
	By sendBtn = By.cssSelector(".button-contactForm");

	public WebElement getMessageField() throws IOException {
		this.driver=getDriver();
		return driver.findElement(messageField);
	}
	
	public WebElement getMessageFieldError() throws IOException {
		this.driver=getDriver();
		return driver.findElement(messageFieldError);
	}

	public WebElement getNameField() throws IOException {
		this.driver=getDriver();
		return driver.findElement(nameField);
	}
	
	public WebElement getNameFieldError() throws IOException {
		this.driver=getDriver();
		return driver.findElement(nameFieldError);
	}

	public WebElement getEmailField() throws IOException {
		this.driver=getDriver();
		return driver.findElement(emailField);
	}
	
	public WebElement getEmailFieldError() throws IOException {
		this.driver=getDriver();
		return driver.findElement(emailFieldError);
	}

	public WebElement getSubjectField() throws IOException {
		this.driver=getDriver();
		return driver.findElement(subjectField);
	}
	
	public WebElement getSubjectFieldError() throws IOException {
		this.driver=getDriver();
		return driver.findElement(subjectFieldError);
	}

	public WebElement getSendBtn() throws IOException {
		this.driver=getDriver();
		return driver.findElement(sendBtn);
	}
}
