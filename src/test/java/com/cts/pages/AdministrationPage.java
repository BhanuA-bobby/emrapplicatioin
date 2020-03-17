package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdministrationPage {
	private static By adminLoc = By.xpath("//div[text()='Administration']");
	private static By bookLoc = By.xpath("//div[text()='Addr Book']");
	private static By addLoc=By.xpath("(//input[@class='btn btn-primary'])[1]");
	private static By typeLoc=By.name("form_abook_type");
	private static By nameLoc=By.id("form_title");
	private static By lastLoc=By.name("form_lname");
	private static By firstLoc=By.name("form_fname");
	private static By mobiLoc=By.name("form_phonecell");
	private static By saveLoc=By.name("form_save");

	public static void clickonAdministration(WebDriver driver) {
	driver.findElement(adminLoc).click();
	}

	public static void clickonaddressbook(WebDriver driver) {
	driver.findElement(bookLoc).click();
	}
	public static void addnew(WebDriver driver)
	{
	driver.findElement(addLoc).click();
	}
	public static void selectype(WebDriver driver, String type)
	{
	WebElement typeSelect=driver.findElement(typeLoc);
	Select selecttype=new Select(typeSelect);
	selecttype.selectByVisibleText(type);
	}
	public static void selectname(WebDriver driver, String name)
	{
	WebElement nameSelect=driver.findElement(nameLoc);
	Select selectname=new Select(nameSelect);
	selectname.selectByVisibleText(name);
	}
	public static void enterlast(WebDriver driver, String last)
	{
	driver.findElement(lastLoc).sendKeys(last);
	}
	public static void enterfirst(WebDriver driver, String first)
	{
	driver.findElement(firstLoc).sendKeys(first);
	}
	public static void entermobile(WebDriver driver, String mobile)
	{
	driver.findElement(mobiLoc).sendKeys(mobile);
	}
	public static void clcikonsave(WebDriver driver)
	{
	driver.findElement(saveLoc).click();
	}

	}

