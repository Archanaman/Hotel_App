package qa.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import qa.PageLayer.base_class;

public class utils extends base_class {
	
	public static long Implicit_TIMEOUT=20;
	public static long PageLoad_TIMEOUT=20;
	
	public void screenshot() throws IOException {
		File scrFile = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(scrFile, new File("C:\\Users\\Laya\\eclipse-workspace-practice\\POM_hotel\\src\\qa\\util\\screenshot.png"));
	}
	
}
