package Edit.EducacionIT;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Laboratorio1 {
@Test
	public void lab1_E1()  {
	//config
	//"chrome"
	System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.dev/");
	driver.quit();
}
@Ignore
	public void lab1_E2()  {
	//config
	//"Firefox"
	System.setProperty("webdriver.gecko.driver","..\\EducacionIt\\Drivers\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.quit();
}
@Test
	public void lab1_E3() {
	System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://selenium.dev/");
	driver.manage().window().maximize();
	
	WebElement txtBusqueda= driver.findElement(By.id("gsc-i-id1"));
	txtBusqueda.sendKeys("maven project");
	txtBusqueda.sendKeys(Keys.ENTER);
	//driver.quit();
}
	
}
