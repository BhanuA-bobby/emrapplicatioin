package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
	private static By patientLoc=By.xpath("//div[text()='Patient/Client']");
	private static By importLoc=By.xpath("//div[text()='Import']");
	private static By uploadLoc=By.xpath("//div[text()='Upload']");
	private static By showMessageLoc=By.xpath("/html/body/main/div/div/h3");
	public static void clickonpatient(WebDriver driver)
	{
	driver.findElement(patientLoc).click();
	}
	public static void clickonimport(WebDriver driver)
	{
	driver.findElement(importLoc).click();
	}
	public static void clickonupload(WebDriver driver)
	{
	driver.findElement(uploadLoc).click();
	}

	public static String showmessage(WebDriver driver) {
	String message=driver.findElement(showMessageLoc).getText();
	return message;
	}
}
