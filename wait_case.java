package hotel_app;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_case {

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
//		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String ActualTitle = Driver.getTitle();;
////		String ExpectedTitle ="Adactin.com - Search Hotel";
//		
//		
		Driver.findElement(By.name("location")).sendKeys("sydney");
		Driver.findElement(By.name("hotels")).sendKeys("Hotel Creek");
		Driver.findElement(By.name("room_type")).sendKeys("Double");
		Driver.findElement(By.name("room_nos")).sendKeys("3 - Three");
		
		Driver.findElement(By.name("datepick_in")).clear();
		Driver.findElement(By.name("datepick_in")).sendKeys("15/04/2021");
		Driver.findElement(By.name("datepick_out")).clear();;
		Driver.findElement(By.name("datepick_out")).sendKeys("18/04/2021");
			Driver.findElement(By.name("adult_room")).sendKeys("2 - Two");
		Select child_room = new Select(Driver.findElement(By.name("child_room")));
		child_room.selectByValue("2");
		Driver.findElement(By.name("Submit")).click();
		 Driver.findElement(By.id("radiobutton_0")).click();
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
		  Driver.findElement(By.name("cc_exp_year")).sendKeys("2021");
		  Driver.findElement(By.name("cc_cvv")).sendKeys("1234");
		  Driver.findElement(By.name("book_now")).click();
		//  Thread.sleep(3000);
WebDriverWait Wait=new WebDriverWait(Driver,20);
 WebElement element = Wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
 String Order_no = element.getAttribute("value");
System.out.println(Order_no);
//		  JavascriptExecutor js = (JavascriptExecutor)Driver;
//		  WebElement Element =Driver.findElement(By.id("My_Itinerary"));
//			js.executeScript("arguments[0].scrollIntoView();", Element);
//		  String Order_no = Driver.findElement(By.id("order_no")).getAttribute("value");
//		  System.out.println(Order_no);
//		  element.click();
//		  String parentWindowHandle= Driver.getWindowHandle();
//		  System.out.println(parentWindowHandle);
//		  Driver.switchTo().window(parentWindowHandle);
//		  String page_title = Driver.getTitle();
//		  System.out.println(page_title);
Driver.findElement(By.id("my_itinerary")).click();
if(Order_no.equals(Driver.findElement(By.id("order_id_416297")).getAttribute("value")));
		  {
			  Driver.findElement(By.id("btn_id_416297")).click();
			  
		  }
		  
	Driver.switchTo().alert().accept();


	}}


