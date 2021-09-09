package qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.PageLayer.HotelOption;
import qa.PageLayer.Login_Page;
import qa.PageLayer.SearchHotel_Page;
import qa.PageLayer.base_class;
import qa.util.utils;

public class SearchPageTest extends base_class {
	static SearchHotel_Page SearchHotel;
static HotelOption hotels;static Login_Page Login; static utils Util_obj;

	public SearchPageTest(){ 
		super();
	}
	
	@BeforeMethod
	public void  prep() {
		setup();
		Login = new Login_Page();
		SearchHotel=Login.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test(priority=2)
	public void ClickItineraryTest() throws InterruptedException 
	{
		//Thread.sleep(2000);
		hotels=SearchHotel.ClickItinerary();
	}
	
	@Test(priority=1)
	public void ValidateTitleTest() {
		String Title = SearchHotel.ValidateTitle();
		Assert.assertEquals(Title,"Adactin.com - Search Hotel");
	}
	
	@Test
	public void TakeScreenshot() throws IOException {
		
		Util_obj= new utils();
		Util_obj.screenshot();
	}
	@AfterMethod
	
	public void teardown() {
		Driver.quit();
	}
}
