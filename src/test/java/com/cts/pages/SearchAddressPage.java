package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchAddressPage {
	private static By adminLocator = By.xpath("//div[text()='Administration']");
	private static By bookLocator = By.xpath("//div[text()='Addr Book']");

	private static By firstnameLoc = By.name("form_fname");
	private static By lastnameLoc = By.name("form_lname");
	private static By typeLoc = By.name("form_abook_type");
	private static By searchLoc = By.xpath("(//input[@class='btn btn-primary'])[2]");
	//private static By nameLoc=By.name("/html/body/div/div[2]/table/tbody/tr[5]/td[2]");

	public static void clickonAdministration(WebDriver driver) {
	driver.findElement(adminLocator).click();
	}

	public static void clickonaddressbook(WebDriver driver) {
	driver.findElement(bookLocator).click();
	}

	public static void enterfirstname(WebDriver driver, String first) {
	driver.findElement(firstnameLoc).sendKeys(first);
	}

	public static void enterlastname(WebDriver driver, String last) {
	driver.findElement(lastnameLoc).sendKeys(last);
	}

	public static void selectype(WebDriver driver, String type) {
	WebElement typeSelect = driver.findElement(typeLoc);
	Select selecttype = new Select(typeSelect);
	selecttype.selectByVisibleText(type);
	}

	public static void clickonsearch(WebDriver driver) {
	driver.findElement(searchLoc).click();
	}
	// public static void comparename(WebDriver driver, String name1)
	// {
	// WebElement actualText= driver.findElement(nameLoc);
	// String finalresult=actualText.getText();
	// Assert.assertEquals(name1, finalresult);


	}



