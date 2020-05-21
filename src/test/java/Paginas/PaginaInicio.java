package Paginas;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class PaginaInicio {
	WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement btnLogin;
	
	public PaginaInicio(WebDriver driver){
	    this.driver = driver;
	    //Inicializa los elementos con una espera implicita
	    PageFactory.initElements(new AjaxElementLocatorFactory (driver,20), this);
	    }
	
	public void clicLogin () {
		 btnLogin.click();
}
}
	
