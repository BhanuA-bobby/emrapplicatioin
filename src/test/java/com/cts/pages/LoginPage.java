package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	private static By usernameloc = By.id("authUser");
	private static By passwordloc = By.id("clearPass");
	private static By languageloc = By.xpath("//select[@name='languageChoice']");
	private static By loginloc = By.xpath("//button[@class='btn btn-default btn-lg']");
	private static By invalidloc=By.xpath("//div[@class='alert alert-danger login-failure m-1']");

	public static void enterUserName(WebDriver driver, String username) {
		driver.findElement(usernameloc).sendKeys(username);
	}

	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(passwordloc).sendKeys(password);
	}

	public static void selectlanguage(WebDriver driver, String language) {

		WebElement languageEle = driver.findElement(languageloc);
		Select selectdropdown = new Select(languageEle);

		selectdropdown.selectByVisibleText(language);
	}

	public static void loginclick(WebDriver driver) {
		driver.findElement(loginloc).click();
	}
	
	/*public static String invalidData(WebDriver driver) {
WebElement invalidele=driver.findElement(invalidloc);
		
		String invaliddata=invalidele.getText();
		return invaliddata;
	}*/
}
