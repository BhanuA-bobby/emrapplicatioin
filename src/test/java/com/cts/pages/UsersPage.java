package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {
	private static By adminLoc=By.xpath("//div[text()='Administration']");
	private static By userLoc=By.xpath("//div[text()='Users']");
	private static By addLoc=By.xpath("//a[@class='medium_modal btn btn-default btn-add']");
	private static By adduserLoc=By.xpath("//*[@id=\"new_user\"]/table/tbody/tr[1]/td[2]/input");
	private static By passLoc=By.xpath("(//input[@class='form-control'])[2]");
	private static By yourpassLoc=By.xpath("(//input[@class='form-control'])[3]");
	private static By firstnameLoc=By.xpath("(//input[@class='form-control'])[4]");
	private static By lastnameLoc=By.xpath("(//input[@class='form-control'])[6]");
	private static By saveLoc=By.xpath("//a[@class='btn btn-default btn-save']");
	public static void clickonadministration(WebDriver driver)
	{
	driver.findElement(adminLoc).click();
	}
	public static void clickonusers(WebDriver driver)
	{
	driver.findElement(userLoc).click();
	}
	public static void clickonaddnew(WebDriver driver)
	{
	driver.findElement(addLoc).click();
	}
	public static void enterusername(WebDriver driver, String username)
	{
	driver.findElement(adduserLoc).sendKeys(username);
	}
	public static void enterpassword(WebDriver driver, String pass)
	{
	driver.findElement(passLoc).sendKeys(pass);
	}
	public static void enteryourpassword(WebDriver driver, String password)
	{
	driver.findElement(yourpassLoc).sendKeys(password);
	}
	public static void enterfirstname(WebDriver driver, String firstname)
	{
	driver.findElement(firstnameLoc).sendKeys(firstname);
	}
	public static void enterlastname(WebDriver driver, String lastname)
	{
	driver.findElement(lastnameLoc).sendKeys(lastname);
	}
	public static void clickonsave(WebDriver driver)
	{
	driver.findElement(saveLoc).click();
	}
}
