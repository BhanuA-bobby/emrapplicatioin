package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReportsPage {
	private static By reportLoc= By.xpath("//div[text()='Reports']");
	private static By clientLoc=By.xpath("//div[text()='Clients']");
	private static By listLoc=By.xpath("//div[text()='List']");
	private static By proLoc=By.name("form_provider");
	private static By fromLoc=By.xpath("(//input[@class='datepicker form-control'])[1]");
	private static By toLoc=By.xpath("(//input[@class='datepicker form-control'])[2]");
	private static By submitLoc=By.xpath("//a[@class='btn btn-default btn-save']");
	public static void clickonreports(WebDriver driver)
	{
	driver.findElement(reportLoc).click();
	}
	public static void clickonclient(WebDriver driver)
	{
	driver.findElement(clientLoc).click();
	}
	public static void clickonlist(WebDriver driver)
	{
	driver.findElement(listLoc).click();
	}
	public static void selectprovider(WebDriver driver, String provider)
	{
	WebElement proSelect=driver.findElement(proLoc);
	Select selectPro=new Select(proSelect);
	selectPro.selectByVisibleText(provider);
	}
	public static void enterfrom(WebDriver driver,String date)
	{
	driver.findElement(fromLoc).sendKeys(date);
	}
	public static void entertodate(WebDriver driver, String toDate)
	{
	driver.findElement(toLoc).sendKeys(toDate);
	}
	public static void clickonsubmit(WebDriver driver)
	{
	driver.findElement(submitLoc).click();
	}
}
