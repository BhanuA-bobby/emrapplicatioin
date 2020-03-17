package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MessagesPage {
private static By messageLoc=By.xpath("(//div[@class='menuLabel'])[4]");
private static By remindersLoc=By.linkText("Reminders");
private static By datedReminderLoc=By.xpath("//span[text()='Create A Dated Reminder']");
private static By selectAllLoc=By.xpath("//span[text()='Select all']");
private static By checkBoxLoc=By.id("sendSeperately");
private static By dateClickLoc=By.id("dueDate");
private static By duedateLoc=By.id("timeSpan");
private static By enterMessageLoc=By.id("message");
private static By sendMessageLoc=By.id("sendButton");

public static void messageElement(WebDriver driver) {
	driver.findElement(messageLoc).click();
}

public static void remindersElement(WebDriver driver) {
	driver.findElement(remindersLoc).click();
}
public static void datedReminderElement(WebDriver driver) {
	driver.findElement(datedReminderLoc).click();
}

public static void selectAllElement(WebDriver driver) {
	driver.findElement(selectAllLoc).click();
}
public static void checkBoxElement(WebDriver driver) {
	driver.findElement(checkBoxLoc).click();
}
public static void dateClickElement(WebDriver driver ,String date) {
	driver.findElement(dateClickLoc).sendKeys(date);;
}
public static void dueDateElement(WebDriver driver ,String duedate) {
	WebElement dueDateEle = driver.findElement(duedateLoc);
	Select selectdropdown = new Select(dueDateEle);

	selectdropdown.selectByVisibleText(duedate);
}
public static void enterMessageElement(WebDriver driver ,String text) {
	driver.findElement(enterMessageLoc).sendKeys(text);
}
public static void clickSendMessageElement(WebDriver driver) {
	driver.findElement(sendMessageLoc).click();
}


}
