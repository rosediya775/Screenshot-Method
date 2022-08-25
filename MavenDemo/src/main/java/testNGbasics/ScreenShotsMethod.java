package testNGbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsMethod {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();	
	    driver = new ChromeDriver();// instantiating driver
		
		driver.get("https://www.saucedemo.com/");// get String method
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		getScreenShot();
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().fullscreen();
		getScreenShot();
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		driver.manage().window().fullscreen();
		getScreenShot();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.manage().window().fullscreen();
		getScreenShot();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.manage().window().fullscreen();
		getScreenShot();
		driver.quit();		

	}

	public static String getScreenShot() {
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String path = System.getProperty("user.dir")+ "/Screenshot/" + System.currentTimeMillis()+".png";
	
	File destination = new File (path);
	try {
		FileUtils.copyFile(src, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return path;	
			
			
			
			
			
	
			
	}		
			
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	