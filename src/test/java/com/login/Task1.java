package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/");
			
			
			WebElement btnsearch = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
			
			Actions action  = new Actions(driver);
			
			action.moveToElement(btnsearch).perform();
			action.click(btnsearch).perform();
			action.click(btnsearch).perform();
			Thread.sleep(5000);
			
			WebElement vistaraFlight = driver.findElement(By.xpath("//span[text()='Vistara']//ancestor::div[@class='makeFlex simpleow']//child::p[@class='blackText fontSize18 blackFont appendBottom2 makeFlex hrtlCenter'][1]"));
		
			System.out.println(vistaraFlight.getText());
		
		}
			
	}
