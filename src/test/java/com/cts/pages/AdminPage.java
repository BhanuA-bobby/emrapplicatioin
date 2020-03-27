package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdminPage {
	private static By adminLoc=By.xpath("//div[text()='Administration']");
	private static By facLoc=By.xpath("//div[text()='Facilities']");
	private static By addLoc=By.xpath("//span[text()='Add Facility']");
	private static By nameLoc=By.xpath("//input[@type='entry']");
	private static By colorLoc=By.xpath("(//input[@type='entry'])[14]");
	private static By saveLoc=By.xpath("//span[text()='Save']");
	public static void clickonadministration(WebDriver driver)
	{
		driver.findElement(adminLoc).click();
	}
	public static void clickonfacility(WebDriver driver)
	{
		driver.findElement(facLoc).click();
	}
	public static void clickonaddfacility(WebDriver driver)
	{
		driver.findElement(addLoc).click();
	}
	public static void entername(WebDriver driver, String name)
	{
		driver.findElement(nameLoc).sendKeys(name);
	}
	public static void entercolour(WebDriver driver, String color)
	{
		driver.findElement(colorLoc).sendKeys(color);
	}
	public static void clickonsave(WebDriver driver)
	
	{
		driver.findElement(saveLoc).click();
	}
	        }
