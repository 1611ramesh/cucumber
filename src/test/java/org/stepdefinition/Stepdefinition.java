package org.stepdefinition;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {

	WebDriver driver;

	@Given("User is in the adactin url")
	public void user_is_in_the_adactin_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("User should enter {string},{string}")
	public void user_should_enter_and(String user, String pass) {
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(user);
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(pass);

	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		WebElement findElement = driver.findElement(By.id("login"));
		findElement.click();

	}

	@Then("enter datas {string} ,{string},{string}")
	public void enter_datas(String loca, String hotels, String roomt) {
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(loc);
		s.selectByIndex(Integer.parseInt(loca));
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(Integer.parseInt(hotels));
		WebElement room = driver.findElement(By.id("room_type"));
		room.sendKeys(roomt);

	}

	@Then("select datas {string},{string},{string},{string}")
	public void select_datas(String roomn, String datei, String dateo, String adlt) {
		WebElement room = driver.findElement(By.id("room_nos"));
		room.sendKeys(roomn);
		WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		datein.clear();
		datein.sendKeys(datei);
		WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		dateout.clear();
		dateout.sendKeys(dateo);
		WebElement adult = driver.findElement(By.id("adult_room"));
		adult.sendKeys(adlt);
		WebElement sumit = driver.findElement(By.id("Submit"));
		sumit.click();
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
	}

	@When("final page enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void final_page_enter(String firstname, String lastname, String address, String cc, String cct,
			String ccexpiry, String ccy, String ccve) throws InterruptedException {
		WebElement first = driver.findElement(By.id("first_name"));
		first.sendKeys(firstname);
		WebElement last = driver.findElement(By.id("last_name"));
		last.sendKeys(lastname);
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys(address);
		WebElement ccno = driver.findElement(By.id("cc_num"));
		ccno.sendKeys(cc);
		WebElement cctype = driver.findElement(By.id("cc_type"));
		cctype.sendKeys(cct);
		WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
		ccexp.sendKeys(ccexpiry);
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		ccyear.sendKeys(ccy);
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys(ccve);
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		Thread.sleep(8000);
		WebElement orderno = driver.findElement(By.id("order_no"));

		String attribute = orderno.getAttribute("value");
	 
	System.out.println(attribute);
	

	}

	@Then("User should verify login msg")
	public void user_should_verify_login_msg() {
		Assert.assertTrue(true);

	}

}
