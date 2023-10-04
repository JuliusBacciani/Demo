package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException { 
		
		ChromeOptions options = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		options.addArguments("--remote-allow-origins=*");
        options.setCapability("ignore-certificate-errors", true);
        WebDriver d = new ChromeDriver();
        System.out.println(d);
		 
	}

}
