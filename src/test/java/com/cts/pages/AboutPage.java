package com.cts.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage {
	private static By clickAboutLoc=By.xpath("//div[text()='About']");
	private static By usermanualLoc=By.linkText("Acknowledgments, Licensing and Certification");
	
	public static void clickAboutElement(WebDriver driver) {
		driver.findElement(clickAboutLoc).click();
	}
	public static void usermanualLocElement(WebDriver driver) {
		driver.findElement(usermanualLoc).click();
	}
	public static void clickfield(WebDriver driver) {
		Set<String> tabs = driver.getWindowHandles();
		for(String s1:tabs) {
			driver.switchTo().window(s1);
			if((driver.getTitle()).contains("Acknowledgments"))
				break;
		}
		
		System.out.println(driver.getTitle());
		
	}
}
