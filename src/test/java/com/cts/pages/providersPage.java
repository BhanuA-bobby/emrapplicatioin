package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class providersPage {
	private static By proLoc=By.xpath("(//div[text()='Procedures'])[1]");
	private static By provLoc=By.xpath("//div[text()='Providers']");
	private static By addLoc=By.xpath("(//button[@class='btn btn-default btn-add'])[1]");
	private static By npiLoc=By.id("form_npi");
	private static By protoLoc=By.id("form_protocol");
	private static By saveLoc=By.xpath("(//button[@class='btn btn-default btn-save'])");
	public static void clickonprocedure(WebDriver driver)
	{
	driver.findElement(proLoc).click();
	}
	public static void clickonprovider(WebDriver driver)
	{
	driver.findElement(provLoc).click();
	}
	public static void clickonadd(WebDriver driver)
	{
	driver.findElement(addLoc).click();
	}
	public static void enternpi(WebDriver driver,String npi)
	{
	driver.findElement(npiLoc).sendKeys(npi);

	}
	public static void selectprotocol(WebDriver driver, String protocol)
	{
	WebElement protoSelect=driver.findElement(protoLoc);
	Select selectProto=new Select(protoSelect);
	selectProto.selectByVisibleText(protocol);
	}
	public static void clickonsave(WebDriver driver)
	{
	driver.findElement(saveLoc).click();
	}
}
