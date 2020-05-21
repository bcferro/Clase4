package Edit.EducacionIT;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
public class Laboratorio2 {
	@Ignore
	public void lab2_E0()  {
	//config
	//"chrome"
	System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.get("https://www.selenium.dev/");
	WebElement linkDescarga = driver.findElement(By.linkText("Downloads"));
			linkDescarga.click();
	driver.quit();
}
	@Ignore
	public void lab2_E1()  {
	//config
	//"chrome"
	System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
    
	 WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
         
     WebElement txtNombre = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
     txtNombre.sendKeys("Brenda");
    
     WebElement txtApellido = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("lastname")));
     txtApellido.sendKeys("Ferro");
     
     //WebElement txtApellido = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@class,'inputtext _58mg')])[2]")));
     //txtApellido.sendKeys("Orihuela");
     
     WebElement txtCel = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='reg_email__']")));
     txtCel.sendKeys("13123");
     
     Select mes = new Select(myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("month"))));
     mes.selectByVisibleText("Mar");
     
     Select dia = new Select(myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("day"))));
     dia.selectByIndex(0);
     
     WebElement txtPass = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("reg_passwd__")));
     txtPass.sendKeys("Tiarg1234");
     
     WebElement btnClic = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
     btnClic.click();
     
     driver.quit();
	
	}
	
	@Test
	public void lab2_E2()  {
	//config
	//"chrome"
	System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
    
	 WebDriverWait myWaitVar = new WebDriverWait(driver, 10);
         
     WebElement txtEmail = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("email")));
     txtEmail.sendKeys("bren@ferro.com");
    
     WebElement txtPass = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
     txtPass.sendKeys("123");
     
     WebElement btnClic = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#u_0_4")));
     btnClic.click();
     
     driver.quit();
	
	}

}

