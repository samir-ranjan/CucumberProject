package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep 
{

	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() 
	{
	
		System.out.println("Step1 = user is on LoginPage");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
	
		System.out.println("step2 = user enters un & pw");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	}

	@And("click on  login button")
	public void click_on_login_button() 
	{
	
		System.out.println("step3 = clicking login btn");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() 
	{
	
		System.out.println("user is on home page");
		driver.close();
	}

	
}
