package com.brvnarealavrdnik;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Header;

@Listeners(resources.Listeners.class)

public class DropdownTest extends Hooks {

	public DropdownTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void dropdownMenuTest() throws InterruptedException, IOException {

		ExtentManager.log("Starting dropDownTest");
		Header headPage = new Header();

		Actions action = new Actions(getDriver());
		WebElement vrdnikBtn = headPage.getVrdnikLink();
		action.moveToElement(vrdnikBtn).moveToElement(headPage.getGeographyLink()).click().perform();
		ExtentManager.pass("Reach the Vrdnik page");
		String headerTitle = headPage.getHeadertitle().getText();

		try {
			Assert.assertEquals(headerTitle, "Vrdnik");
			ExtentManager.pass("Assert is correct");
		} catch (AssertionError e) {
			Assert.fail("Assert is not correct,it is not Vrdnik, it is" + headerTitle);
			ExtentManager.fail("The tittle of the page is incorrect");
		}
	}
}
