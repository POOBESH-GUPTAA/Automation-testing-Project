package org.ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poobe\\eclipse-workspace\\E - Commerce Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		WebElement reg = driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']"));
		reg.click();
	}

}
