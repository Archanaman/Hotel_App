package hotel_app;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class book_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		Driver.get("http://www.adactin.com/HotelAppBuild2/");
		Driver.findElement(By.id("username")).sendKeys("archana1986");
		Driver.findElement(By.id("password")).sendKeys("password");
		Driver.findElement(By.id("login")).click();
		Driver.manage().window().maximize();
		//Driver.findElement(By.linkText("Logout")).click();
		//Thread.sleep(2000);
		//Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * String ActualTitle = Driver.getTitle(); String ExpectedTitle
		 * ="Adactin.com - Search Hotel";
		 * 
		 * if (ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
		 * System.out.println("Title is correct"); } else {
		 * System.out.println("title is wrong"); }
		 */
		 
		Driver.findElement(By.name("location")).sendKeys("sydney");
		Driver.findElement(By.name("Submit")).click();
		String location = Driver.findElement(By.id("location_1")).getAttribute("value");
		 System.out.println(location);
//		if(location.equals("Sydney"))
//		{System.out.println("location is correct");}
//		else
//		{System.out.println("location is wrong");*/
		//System.out.println(location);
		
		/*
		 * Driver.findElement(By.name("hotels")).sendKeys("Hotel Creek");
		 * Driver.findElement(By.name("room_type")).sendKeys("Double");
		 * Driver.findElement(By.name("room_nos")).sendKeys("1 - One");
		 * Driver.findElement(By.name("datepick_in")).clear();
		 * Driver.findElement(By.name("datepick_in")).sendKeys("15/04/2021");
		 * Driver.findElement(By.name("datepick_out")).clear();;
		 * Driver.findElement(By.name("datepick_out")).sendKeys("18/04/2021");
		 * Driver.findElement(By.name("adult_room")).sendKeys("1 - One"); Select
		 * child_room = new Select(Driver.findElement(By.name("child_room")));
		 * child_room.selectByValue("1");
		 */
//			Driver.findElement(By.name("Submit")).click();
//			String errortext = Driver.findElement(By.id("location_span")).getText();
//			System.out.println(errortext);
//			String Value = Driver.findElement(By.id("username_show")).getAttribute("value");
//			System.out.println(Value);
		/*
		 * Driver.findElement(By.id("radiobutton_0")).click();
		 * Driver.findElement(By.name("continue")).click();;
		 * Driver.findElement(By.name("first_name")).sendKeys("archana");
		 * Driver.findElement(By.name("last_name")).sendKeys("krishnan");
		 * Driver.findElement(By.name("address")).sendKeys("uinta point lane");
		 * Driver.findElement(By.name("cc_num")).sendKeys("1234567891234567"); String
		 * text = Driver.findElement(By.id("cc_num_tip")).getText();
		 * System.out.println(text); Select cc_type = new
		 * Select(Driver.findElement(By.name("cc_type")));
		 * cc_type.selectByValue("AMEX");
		 * Driver.findElement(By.name("cc_exp_month")).sendKeys("March");
		 * Driver.findElement(By.name("cc_exp_year")).sendKeys("2021");
		 * Driver.findElement(By.name("cc_cvv")).sendKeys("1234");
		 * Driver.findElement(By.name("book_now")).click();
		 */
		 
		/*
		 * String Alert_text = Driver.switchTo().alert().getText();
		 * System.out.println(Alert_text); Driver.switchTo().alert().accept();
		 */
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) Driver; WebElement Element =
		 * Driver.findElement(By.id("My_Itinerary"));
		 * js.executeScript("arguments[0].scrollIntoView();", Element);
		 * 
		 * Element.click();
		 */
	}

	}
