package com.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.QA.Utility.TimeOuts;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public TestBaseClass() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("C://Technical//Priya's Workspace//FreeCRM-POM//src//main//java//com//QA//Config//config.properties"));
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//srika//Desktop//chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeOuts.PageLoadTimeOut,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(TimeOuts.ImplicitWait, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
		}
	}

