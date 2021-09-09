package qa.PageLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.util.utils;


public class base_class {
	public static WebDriver Driver;
	public static  Properties prop;
	
	public base_class() {
		try {
		prop= new Properties();
		String FilePath="C:/Users/Laya/eclipse-workspace-practice/POM_hotel/config.properties";
		FileInputStream fl = new FileInputStream(FilePath); 
		prop.load(fl);}
		catch(FileNotFoundException e) {
			e.printStackTrace();}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	    Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(utils.Implicit_TIMEOUT,TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(utils.PageLoad_TIMEOUT, TimeUnit.SECONDS);
		Driver.get(prop.getProperty("URL"));}
	
	
	}

