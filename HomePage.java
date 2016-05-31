package snippet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//a[text()='Book a flight']")
	WebElement bookFlight_button;
	
	
}
