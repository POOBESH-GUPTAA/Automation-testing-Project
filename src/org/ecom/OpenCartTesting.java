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
		WebElement h1 = driver.findElement(By.xpath("//h1[text()='The best FREE and open-source eCommerce platform']"));
		String printH1 = h1.getText();
		System.out.println(printH1);
		WebElement reg = driver.findElement(By.xpath("(//a[text()='Login'])[2]"));
		reg.click();
	}

}
