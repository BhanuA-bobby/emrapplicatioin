package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProcedurePage {
	private static By procedureLoc=By.xpath("//div[text()='Procedures']");
	private static By configLoc=By.xpath("//div[text()='Configuration']");
	private static By topLoc=By.xpath("//button[@class='btn btn-default btn-add']");
	private static By nameLoc=By.xpath("//input[@class='form-control']");
	private static By saveLoc=By.xpath("//button[@class='btn btn-default btn-save']");
	private static By editLoc=By.xpath("//*[@id=\"con0\"]/table/tbody/tr/td[6]/span");
	private static By deleLoc=By.xpath("//button[@class='btn btn-default btn-cancel btn-delete btn-separate-left']");
	private static By refreshLoc=By.xpath("//button[@class='btn btn-default btn-refresh']");
	public static void clickonprocedure(WebDriver driver)
	{
	driver.findElement(procedureLoc).click();
	}
	public static void clickonconfiguration(WebDriver driver)
	{
	driver.findElement(configLoc).click();
	}
	public static void clickonToplevel(WebDriver driver)
	{
	driver.findElement(topLoc).click();
	}
	public static void entername(WebDriver driver, String name)
	{
	driver.findElement(nameLoc).sendKeys(name);
	}
	public static void clickonsave(WebDriver driver)
	{
	driver.findElement(saveLoc).click();
	}
	

}
