package org.ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poobe\\eclipse-workspace\\E - Commerce Testing\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		WebElement h1 = driver.findElement(By.xpath("//h1[text()='The best FREE and open-source eCommerce platform']"));
		String printH1 = h1.getText();
		System.out.println(printH1);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    WebElement scrollDown = driver.findElement(By.xpath("//h2[text()='OpenCart Cloud']"));
	    js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
	    Thread.sleep(5000);
		WebElement getStarted = driver.findElement(By.xpath("(//a[text()='Get Started'])[1]"));
		getStarted.click();
		
		
	}

}
