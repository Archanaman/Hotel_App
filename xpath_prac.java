package hotel_app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class xpath_prac {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
//		Driver.get("http://www.adactin.com/HotelAppBuild2/");
//		Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("archana1986");
//		Driver.findElement(By.xpath("//input[@class='login_input' and @id='password']")).sendKeys("password");
//		Driver.findElement(By.xpath("//input[@id='login']")).click();
//	Driver.manage().window().maximize();
//	Driver.findElement(By.name("location")).sendKeys("sydney");
//	Driver.findElement(By.name("Submit")).click();
	/*Driver.findElement(By.name("hotels")).sendKeys("Hotel Creek");
	Driver.findElement(By.name("room_type")).sendKeys("Double");
	 Driver.findElement(By.name("room_nos")).sendKeys("1 - One");
	 Driver.findElement(By.name("datepick_in")).clear();
	 Driver.findElement(By.name("datepick_in")).sendKeys("15/08/2021");
	  Driver.findElement(By.name("datepick_out")).clear();;
	  Driver.findElement(By.name("datepick_out")).sendKeys("18/08/2021");
	  Driver.findElement(By.name("adult_room")).sendKeys("1 - One"); Select
	  child_room = new Select(Driver.findElement(By.name("child_room")));
	  child_room.selectByValue("1");
	 
	Driver.findElement(By.name("Submit")).click();*/
	/*Driver.findElement(By.xpath("//input[@value='Hotel Creek']//parent::td//preceding-sibling::td//input[@id='radiobutton_2']")).click();
	  Driver.findElement(By.name("continue")).click();;
	  Driver.findElement(By.name("first_name")).sendKeys("archana");
	  Driver.findElement(By.name("last_name")).sendKeys("krishnan");
	  Driver.findElement(By.name("address")).sendKeys("uinta point lane");
	 Driver.findElement(By.name("cc_num")).sendKeys("1234567891234567"); String
	  text = Driver.findElement(By.id("cc_num_tip")).getText();
	  System.out.println(text); Select cc_type = new
	  Select(Driver.findElement(By.name("cc_type")));
	  cc_type.selectByValue("AMEX");
	  Driver.findElement(By.name("cc_exp_month")).sendKeys("March");
	  Driver.findElement(By.name("cc_exp_year")).sendKeys("2022");
	  Driver.findElement(By.name("cc_cvv")).sendKeys("1234");
	  Driver.findElement(By.name("book_now")).click();
	  Thread.sleep(4000);*/
	 // Driver.findElement(By.xpath("//a[contains(@href,'Booked')])")).click();
	  //Driver.findElement(By.linkText("Booked Itinerary")).click();
	/*JavascriptExecutor js = (JavascriptExecutor) Driver;
	js.executeScript("window.scrollBy(0,600)");*/
	 // js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	  //WebElement element = Driver.findElement(By.xpath("//input[@value='My Itinerary']"));
	 // js.executeScript("arguments[0].scrollIntoView(true);",element);
	 // Thread.sleep(2000);
	 // element.click();
	  //Driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
	 /* Driver.findElement(By.xpath("//input[@value='0AO6RQR252']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
	  Driver.findElement(By.xpath("//input[@value='Cancel Selected']")).click();
	  Driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  System.out.println(Driver.findElement(By.xpath("//label[@class='reg_error']")).isDisplayed());*/
//	 
////////google search with xpath///////
		Driver.get("http://google.com");
		Driver.manage().window().maximize();
		 File scrFile = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(scrFile, new File("C:\\Users\\Laya\\eclipse-workspace-practice\\hotel_app\\src\\hotel_app\\screenshot.png"));
//		Thread.sleep(3000);
		//Driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("automation");
//		List<WebElement>ls=Driver.findElements(By.xpath("//div[@class='aajZCb']//ul//li//descendant::div[@class='wM6W7d WggQGd']"));
//		for (int i=0;i<ls.size();i++) {
//			if( ls.get(i).getText().contains("automation")) {
//				ls.get(i).click();
//				break;
//				
//			}
//		}
		
	}
	
	

}
