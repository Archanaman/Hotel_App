package hotel_app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mywebdrivertest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		Driver.get("http://www.adactin.com/HotelApp/");
		Driver.findElement(By.id("username")).sendKeys("archana1986");
		Driver.findElement(By.id("password")).sendKeys("password");
		Driver.findElement(By.id("login")).click();
		Driver.manage().window().maximize();
		//Thread.sleep(2000);
		//Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String ActualTitle = Driver.getTitle();;
		//String ExpectedTitle ="Adactin.com - Search Hotel";
		
		
		//Driver.findElement(By.name("location")).sendKeys("sydney");
		//Driver.findElement(By.name("hotels")).sendKeys("Hotel Creek");
		//Driver.findElement(By.name("room_type")).sendKeys("Double");
		//Driver.findElement(By.name("room_nos")).sendKeys("3 - Three");
		//Driver.findElement(By.name("datepick_in")).clear();
		//Driver.findElement(By.name("datepick_in")).sendKeys("15/04/2021");
		//Driver.findElement(By.name("datepick_out")).clear();;
		//Driver.findElement(By.name("datepick_out")).sendKeys("18/04/2021");
		//Driver.findElement(By.name("adult_room")).sendKeys("2 - Two");
		//Select child_room = new Select(Driver.findElement(By.name("child_room")));
				//child_room.selectByValue("2");
		//Driver.findElement(By.name("Submit")).click();
		
	}

}
