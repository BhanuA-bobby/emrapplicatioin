package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SalesPage {
	
	private static By reportLoc = By.xpath("//div[text()='Sales']");
	private static By facilityLoc = By.xpath("//select[@class='form-control'][1]");
	private static By fromLoc= By.id("form_from_date");
	private static By toLoc = By.id("form_to_date");
	private static By submitLoc = By.xpath("//a[@class='btn btn-default btn-save']");
	
	public static void clickReport(WebDriver driver)
	{
		WebElement reportEle=driver.findElement(reportLoc);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",reportEle );
	}
	
	public static void selectSales(WebDriver driver, String name)
	{
	WebElement nameSelect=driver.findElement(facilityLoc);
	Select selectname=new Select(nameSelect);
	selectname.selectByVisibleText(name);
	}
	
	public static void fromSelect(WebDriver driver, String from)
	{
		driver.findElement(fromLoc).sendKeys(from);
	}
	
	public static void toSelect(WebDriver driver,String to)
	{
		driver.findElement(toLoc).sendKeys(to);
	}
	public static void submitSelect(WebDriver driver)
	{
		driver.findElement(submitLoc).click();
	}
}