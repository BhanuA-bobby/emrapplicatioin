package com.cts.stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.commandhandler.UploadFile;

import com.cts.pages.AboutPage;
import com.cts.pages.AdminPage;
import com.cts.pages.AdministrationPage;
import com.cts.pages.FeePage;
import com.cts.pages.LoginPage;
import com.cts.pages.MessagesPage;
import com.cts.pages.ProcedurePage;
import com.cts.pages.ReportsPage;
import com.cts.pages.SalesPage;
import com.cts.pages.SearchAddressPage;
import com.cts.pages.UploadPage;
import com.cts.pages.UsersPage;
import com.cts.pages.providersPage;
import com.cts.utils.ReadExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;

	@Given(": I have browse with openemrpage")
	public void i_have_browse_with_openemrpage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
	}

	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String fileDetails , String sheetName) 
	throws IOException {
		String str[][] = ReadExcel.getSheetIntoStringArray(fileDetails, sheetName);
		LoginPage.login(driver, str[0][0], str[0][1]);
		
		
		LoginPage.selectlanguage(driver, "English (Indian)");
		LoginPage.loginclick(driver);
	}

	@Then("I should access to the portal with the title as {string}")
	public void i_should_access_to_the_portal_with_the_title_as(String string) {
		driver.close();

	}

	@When("I enter Text message and send to clients with {string} and {string} and {string}")
	public void i_enter_Text_message_and_send_to_clients_with_and_and(String date, String duedate, String text)
			throws InterruptedException {
		// entering user name
		LoginPage.enterUserName(driver, "admin");
		// entering password
		LoginPage.enterPassword(driver, "pass");
		// Choosing language
		LoginPage.selectlanguage(driver, "English (Indian)");
		// click on login
		LoginPage.loginclick(driver);
		MessagesPage.messageElement(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("msg");
		MessagesPage.remindersElement(driver);
		Thread.sleep(5000);
		MessagesPage.datedReminderElement(driver);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("modalframe");
		MessagesPage.selectAllElement(driver);
		MessagesPage.checkBoxElement(driver);
		// MessagesPage.dateClickElement(driver, "2020-03-16");
		MessagesPage.dueDateElement(driver, "1 Day From Now");
		MessagesPage.enterMessageElement(driver, "Welcome");
		MessagesPage.clickSendMessageElement(driver);
		driver.switchTo().alert().accept();
	}

	@Then("I should access to the portal with the title message")
	public void i_should_access_to_the_portal_with_the_title_message() {
		driver.close();

	}

	@When("I should click on the about field and navigate to  usermanual")
	public void i_should_click_on_the_about_field_and_navigate_to_usermanual() throws InterruptedException {

		LoginPage.enterUserName(driver, "admin");
		LoginPage.enterPassword(driver, "pass");
		LoginPage.selectlanguage(driver, "English (Indian)");
		LoginPage.loginclick(driver);
		AboutPage.clickAboutElement(driver);

		driver.switchTo().frame("msc");
		Thread.sleep(5000);
		AboutPage.usermanualLocElement(driver);
		AboutPage.clickfield(driver);
	}

	@Then("I should go to the about field with the title message in parallel tab page")
	public void i_should_go_to_the_about_field_with_the_title_message_in_parallel_tab_page() {
		driver.close();

	}

	@When("I should click on the Fees field and choose the {string} and submit")
	public void i_should_click_on_the_Fees_field_and_choose_the_and_submit(String file) throws InterruptedException {
		// Entering username
		LoginPage.enterUserName(driver, "admin");
		// Entering password
		LoginPage.enterPassword(driver, "pass");
		// Choosing Language
		LoginPage.selectlanguage(driver, "English (Indian)");
		// Click on login
		LoginPage.loginclick(driver);
		// Click on fee icon
		FeePage.clickonfee(driver);
		// Click on edi
		FeePage.clickonedi(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("edi");
		// Click on notes
		FeePage.clickOnNotes(driver);
		// Select the File
		FeePage.selectfile(driver, "edih_log_2020-03-17.txt");
		// Click on submit
		FeePage.clickonsubmit(driver);
		Thread.sleep(5000);
		// Click on close
		FeePage.clickonclose(driver);
	}

	@Then("I should go to the Fees field and close the file")
	public void i_should_go_to_the_Fees_field_and_close_the_file() {
		driver.close();

	}

	@When("I should click on the Upload field and show steps to upload")
	public void i_should_click_on_the_Upload_field_and_show_steps_to_upload() throws InterruptedException {
		// Entering username
		LoginPage.enterUserName(driver, "admin");
		// Entering password
		LoginPage.enterPassword(driver, "pass");
		// Choosing language
		LoginPage.selectlanguage(driver, "English (Indian)");
		// Click on login
		LoginPage.loginclick(driver);
		// Click on patient icon
		UploadPage.clickonpatient(driver);
		// Click on import
		UploadPage.clickonimport(driver);
		// Click on upload
		UploadPage.clickonupload(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("pat");
		String expectedtitle = "Steps for uploading CCR XML";
		String actualTitle = UploadPage.showmessage(driver);
		// Printing upload message
		System.out.println(actualTitle);
	}

	@Then("I should go to the steps to upload")
	public void i_should_go_to_the_steps_to_upload() {
		driver.close();

	}

	@When("I login with valid credentials")
	public void i_login_with_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> data = dataTable.asMaps();
		LoginPage.enterUserName(driver, data.get(0).get("username"));
		LoginPage.enterPassword(driver, data.get(0).get("password"));
		LoginPage.selectlanguage(driver, "English (Indian)");
		LoginPage.loginclick(driver);

	}

	@When("I will click on administration")
	public void i_will_click_on_administration() throws InterruptedException {
		// Entering username
		LoginPage.enterUserName(driver, "admin");
		// Entering password
		LoginPage.enterPassword(driver, "pass");
		// Choosing language
		LoginPage.selectlanguage(driver, "English (Indian)");
		// click on driver
		LoginPage.loginclick(driver);
		// Click on administration
		AdministrationPage.clickonAdministration(driver);
		// Click on address book
		AdministrationPage.clickonaddressbook(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("adm");
		// Click on addnew icon
		AdministrationPage.addnew(driver);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("modalframe");
		// Select type
		AdministrationPage.selectype(driver, "EMR Direct");
		// Select name
		AdministrationPage.selectname(driver, "Mr.");
		AdministrationPage.enterlast(driver, "kumar");
		AdministrationPage.enterfirst(driver, "srinu");
		AdministrationPage.entermobile(driver, "7845567434");
		AdministrationPage.clcikonsave(driver);

	}

	@Then("I should access to add new address")
	public void i_should_access_to_add_new_address() {
		driver.close();

	}

	@When("I will click on configuration")
	public void i_will_click_on_configuration() throws InterruptedException {
		LoginPage.enterUserName(driver, "admin");
		LoginPage.enterPassword(driver, "pass");
		LoginPage.selectlanguage(driver, "English (Indian)");
		LoginPage.loginclick(driver);
		ProcedurePage.clickonprocedure(driver);
		ProcedurePage.clickonconfiguration(driver);
		Thread.sleep(3000);
		driver.switchTo().frame("pat");
		ProcedurePage.clickonToplevel(driver);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("modalframe");
		ProcedurePage.entername(driver, "");
		ProcedurePage.clickonsave(driver);

	}

	@Then("I should configure the orders")
	public void i_should_configure_the_orders() {
		driver.close();

	}

	@When("I will click on administartion button")
	public void i_will_click_on_administartion_button() throws InterruptedException {
		//Entering username
		LoginPage.enterUserName(driver, "admin");
		//Entering password
		LoginPage.enterPassword(driver, "pass");
		//Choosing Language
		LoginPage.selectlanguage(driver, "English (Indian)");
		//Click on login
		LoginPage.loginclick(driver);
		//Click on administration
		SearchAddressPage.clickonAdministration(driver);
		//Click on addressbook
		SearchAddressPage.clickonaddressbook(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("adm");
		//entering first name
		SearchAddressPage.enterfirstname(driver, "srinu");
		//Entering last name
		SearchAddressPage.enterlastname(driver, "kumar");
		//Selecting type
		SearchAddressPage.selectype(driver, "EMR Direct");
		//Click on search
		SearchAddressPage.clickonsearch(driver);

	}

	@Then("I should be able to search the details of patient")
	public void i_should_be_able_to_search_the_details_of_patient() {
	    driver.close();
	}

	@When("I will give patient name")
	public void i_will_give_patient_name() throws InterruptedException {
		//Entering username
		LoginPage.enterUserName(driver, "admin");
		//Entering password
		LoginPage.enterPassword(driver, "pass");
		//Selecting Language
		LoginPage.selectlanguage(driver, "English (Indian)");
		//Click on login
		LoginPage.loginclick(driver);
		//Click on reports
		ReportsPage.clickonreports(driver);
		//Click on client
		ReportsPage.clickonclient(driver);
		//Click on list
		ReportsPage.clickonlist(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("rep");
		//Selecting provider
		ReportsPage.selectprovider(driver, "Billy Smith");
		//Entering from date
		ReportsPage.enterfrom(driver, "2020-03-7");
		//Entering to date
		ReportsPage.entertodate(driver, "2020-03-15");
		//Clicking on submit
		ReportsPage.clickonsubmit(driver);
	}

	@Then("i will get no of patient")
	public void i_will_get_no_of_patient() {
		driver.close();

	}

	@When("I will click on sales and send {string} and {string} and {string}")
	public void i_will_click_on_sales_and_send_and_and(String string, String string2, String string3)
			throws InterruptedException {

		LoginPage.enterUserName(driver, "admin");
		LoginPage.enterPassword(driver, "pass");
		LoginPage.selectlanguage(driver, "English (Indian)");
		LoginPage.loginclick(driver);

		SalesPage.clickReport(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("rep");
		SalesPage.selectSales(driver, "Great Clinic");
		SalesPage.fromSelect(driver, "2020-03-17");
		SalesPage.toSelect(driver, "2020-03-20");
		SalesPage.submitSelect(driver);
	}

	@Then("I will submit the sales dates")
	public void i_will_submit_the_sales_dates() {
		driver.close();

	}

	@When("I will click on providers send {string} and {string}")
	public void i_will_click_on_providers_send_and(String string, String string2) throws InterruptedException {

		LoginPage.enterUserName(driver, "admin");
		LoginPage.enterPassword(driver, "pass");
		LoginPage.selectlanguage(driver, "English (Indian)");
		LoginPage.loginclick(driver);
		providersPage.clickonprocedure(driver);
		providersPage.clickonprovider(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("pat");
		providersPage.clickonadd(driver);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("modalframe");
		providersPage.enternpi(driver, "surya");
		providersPage.selectprotocol(driver, "SFTP");
		providersPage.clickonsave(driver);
	}

	@Then("I will submit the providers dates")
	public void i_will_submit_the_providers_dates() {
		driver.close();

	}

	@When("I will click on userpage send {string} and {string} and {string} and {string} and {string}")
	public void i_will_click_on_userpage_send_and_and_and_and(String string, String string2, String string3,
			String string4, String string5) throws InterruptedException {
		// Entering user name
		LoginPage.enterUserName(driver, "admin");
		// Entering password
		LoginPage.enterPassword(driver, "pass");
		// Choosing language
		LoginPage.selectlanguage(driver, "English (Indian)");
		// Click on login
		LoginPage.loginclick(driver);
		// Click on administrator
		UsersPage.clickonadministration(driver);
		UsersPage.clickonusers(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("adm");
		UsersPage.clickonaddnew(driver);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("modalframe");
		UsersPage.enterusername(driver, "surya");
		UsersPage.enterpassword(driver, "pass");
		UsersPage.enteryourpassword(driver, "pass");
		UsersPage.enterfirstname(driver, "surya");
		UsersPage.enterlastname(driver, "maddirala");
		UsersPage.clickonsave(driver);
	}

	@Then("I will submit the userpage dates")
	public void i_will_submit_the_userpage_dates() {
		driver.close();

	}

	@When("I will click on addfacility")
	public void i_will_click_on_addfacility() throws InterruptedException {
		// Entering username
		LoginPage.enterUserName(driver, "admin");
		// Entering password
		LoginPage.enterPassword(driver, "pass");
		// Choosing language
		LoginPage.selectlanguage(driver, "English (Indian)");
		// Click on login
		LoginPage.loginclick(driver);
		// Click on administration
		AdminPage.clickonadministration(driver);
		// Click on facility
		AdminPage.clickonfacility(driver);
		Thread.sleep(5000);
		driver.switchTo().frame("adm");
		// Click on addfacility
		AdminPage.clickonaddfacility(driver);
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("modalframe");
		// Entering name
		AdminPage.entername(driver, "srinu");
		// Entering colour
		AdminPage.entercolour(driver, "blue");
		// Click on save
		AdminPage.clickonsave(driver);
	}

	@Then("I will be able to add the facility")
	public void i_will_be_able_to_add_the_facility() {
		driver.close();

	}

}
