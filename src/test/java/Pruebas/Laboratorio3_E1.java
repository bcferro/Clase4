package Pruebas;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.*;
import org.junit.Ignore;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Laboratorio3_E1 {
	WebDriver driver;
	
	@BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "..\\EducacionIt\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
	@BeforeTest
    public void irUrl() {
		 driver.get("https://www.facebook.com/");
    }
	
	@BeforeClass 
    public void maxVentana() {
        driver.manage().window().maximize();
    }
	
	@Test (description="Registro inválido de usuario")
  public void registroUsuario() {
	    
		 WebDriverWait myWaitVar = new WebDriverWait(driver, 15);
	         
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
	     
	     Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
	     
		}
  @AfterClass 
  public void finPrueba() {
      System.out.println("Fin de prueba");
           
  }
  @AfterTest 
  public void cierre() {
      driver.quit();
  }
  
  @AfterSuite
  public void finSuite() {
      System.out.println("Fin Suite");
  }

}
