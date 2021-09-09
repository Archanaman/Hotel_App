package qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_Page extends base_class {
	
	
		@FindBy(name="location")
		WebElement location;
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		WebElement Itinerary;
		
		public SearchHotel_Page() {
			PageFactory.initElements(Driver,this);}
		
		public HotelOption ClickItinerary() {
			Itinerary.click();
			return new HotelOption();}
			
			public String ValidateTitle() {
				return Driver.getTitle();
			}
		}
			
		
	
	


