package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FeePage {
	private static By feeLoc=By.xpath("//div[text()='Fees']");
	private static By ediLoc=By.xpath("//div[text()='EDI History']");
	private static By notesLoc=By.id("btn-edinotes");
	private static By fileLoc=By.name("log_select");
	private static By submitLoc=By.id("logshow");
	private static By closeLoc=By.id("logclose");
	public static void clickonfee(WebDriver driver)
	{
	driver.findElement(feeLoc).click();
	}
	public static void clickonedi(WebDriver driver)

	{
	driver.findElement(ediLoc).click();
	}
	public static void clickOnNotes(WebDriver driver)
	{
		driver.findElement(notesLoc).click();
	}
	public static void selectfile(WebDriver driver, String file)
	{
	WebElement fileSelect=driver.findElement(fileLoc);
	Select selectFile=new Select(fileSelect);
	selectFile.selectByVisibleText(file);
	}
	public static void clickonsubmit(WebDriver driver)
	{
	driver.findElement(submitLoc).click();
	}
	public static void  clickonclose(WebDriver driver)
	{
	driver.findElement(closeLoc).click();
	}

}
