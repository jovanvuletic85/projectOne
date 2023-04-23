package com.brvnarealavrdnik;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Header;

@Listeners(resources.Listeners.class)

public class FacebookLinkTest extends Hooks {

	public FacebookLinkTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void facebookTest() throws InterruptedException, IOException {
		// WebDriver driver;
		ExtentManager.log("Starting facebookTest");
		Header headPage = new Header();
		headPage.getFacebookLink().click();

		Thread.sleep(2000);
		ExtentManager.pass("Reach the facebook page");
		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(1));
		Thread.sleep(2000);
		String URL = getDriver().getCurrentUrl();
		Assert.assertTrue(URL.contains("www.facebook.com"));
		getDriver().close();

		getDriver().switchTo().window(tabs2.get(0));
		Thread.sleep(2000);
		String URL1 = getDriver().getCurrentUrl();
		ExtentManager.pass("Reach the brvnare Ala Vrdnik page");

		try {
			Assert.assertTrue(URL1.contains("brvnarealavrdnik"));
			ExtentManager.pass("Assert is correct");
		} catch (AssertionError e) {
			Assert.fail("Assert is not correct,it is not URL of brvnarealavrdnik");
			ExtentManager.fail("The URL is incorrect");
		}
	}
}
