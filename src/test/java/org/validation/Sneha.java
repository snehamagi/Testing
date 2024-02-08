package org.validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sneha { 
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://www.meesho.com/");
		 driver.manage().window().maximize();
		 
		 driver.navigate().refresh();
		 // Thread.sleep(2000);
		 driver.navigate().back();	
		 //Thread.sleep(2000);
		 driver.navigate().forward();
		 
		 String current=driver.getCurrentUrl();
		 System.out.print(current);
		 
		 String sne=driver.getTitle();
		 System.out.println(sne);
		 
		 
		
	}

}
