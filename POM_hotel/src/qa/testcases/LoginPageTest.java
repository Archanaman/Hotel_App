package qa.testcases;

import static org.testng.Assert.assertTrue;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.PageLayer.Login_Page;
import qa.PageLayer.SearchHotel_Page;
import qa.PageLayer.base_class;

public class LoginPageTest extends base_class {
	
	
	public static Login_Page Login;
	public static SearchHotel_Page SearchHotel;
	public LoginPageTest(){ 
		super();
	}
@BeforeMethod
public void  prep() {
	setup();
	 Login = new Login_Page();
}
@Test
public void TitleTest() {
	String Title = Login.ValidateLoginPageTitle();
	Assert.assertEquals(Title,"Adactin Group: Hotel Reservation System");
	
}
@Test
public void LoginApplicationTest() {
	SearchHotel=Login.login(prop.getProperty("username"), prop.getProperty("password"));
	System.out.println("user is successfully logged in");
	
}


@AfterMethod
public void teardown() {
	Driver.quit();
}
}
