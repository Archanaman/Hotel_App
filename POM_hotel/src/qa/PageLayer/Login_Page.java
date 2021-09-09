package qa.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends base_class {
	
	@FindBy(id= "username")
	WebElement Username;
	@FindBy(id= "password")
	WebElement Password;
	@FindBy(name= "login")
	WebElement Submit;
	
	public Login_Page() {
	PageFactory.initElements(Driver,this);}
	
	public String ValidateLoginPageTitle() {
		return Driver.getTitle();}
	
	public SearchHotel_Page login(String un,String pd ) {
		Username.sendKeys(un);
		Password.sendKeys(pd);
		Submit.click();
		return new SearchHotel_Page();
	}
}
