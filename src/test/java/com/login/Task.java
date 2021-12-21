package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtseacrh = driver.findElement(By.id("twotabsearchtextbox"));
		txtseacrh.sendKeys("Iphone");
		
		WebElement btnClick = driver.findElement(By.xpath("//input[@type='submit']"));
		btnClick.click();
		
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'iPhone 12 (128GB) - Green')]//ancestor::div[@class='a-section a-spacing-none']//child::span[@class='a-price-whole']"));
		
		System.out.println(element.getText());
		
		WebElement ratingElement = driver.findElement(By.xpath("//span[contains(text(),'iPhone 12 (128GB) - Green')]//ancestor::div[@class='a-section a-spacing-none']//child::i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(ratingElement).perform();
		action.click(ratingElement).perform();
		
		WebElement rate = driver.findElement(By.id("//i[@class='a-icon a-icon-popover']"));
		
		//WebElement rate = driver.findElement(By.xpath("//span[@data-hook='acr-average-stars-rating-text']"));
		
		System.out.println(rate.getText());
			
	}												

}
