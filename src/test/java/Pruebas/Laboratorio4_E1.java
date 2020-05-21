package Pruebas;

import org.testng.Assert;
import org.testng.annotations.Test;

import Paginas.PaginaInicio;
import Paginas.paginaLogin;
import Utilidades.DatosExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;


public class Laboratorio4_E1 {
    WebDriver driver;
    String url = "http://automationpractice.com/index.php";
    String pathDriver = "..\\EducacionIt\\Drivers\\chromedriver.exe";
    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.get(url);
       
    }
    @Test (priority=0)
    public void f() {
        PaginaInicio inicio = new PaginaInicio(driver);
        inicio.clicLogin();
    }
    
    @Test (priority=1, dataProvider="Registro invalido excel")
    public void ingreso(String usuario, String clave) throws IOException {
        paginaLogin login = new paginaLogin(driver);
        login.loginUsuario(usuario, clave);
        
        File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File("..\\EducacionIt\\Evidencias\\Test.png"));
        
        
        Assert.assertEquals("AUTHENTICATION", login.getTituloForm());
        
    }
    
    @DataProvider (name="Registro invalido")
    public Object[][] dp() {
        Object[][] datos = new Object[2][2];
        datos[0][0]="nadia";
        datos[0][1]="contrasda";
        datos[1][0]="pedro";
        datos[1][1]="12311";
        
        return datos;
    }
    
    @DataProvider (name="Registro invalido excel")
    public Object [][] datosPruebaExcel1() throws Exception{
    	Object [][] datos = DatosExcel.leerExcel("C:\\Users\\brend\\eclipse-workspace\\EducacionIT\\Recursos\\Datos.xlsx", "Sheet1");
    			return datos;
    }
    
    @AfterSuite
    public void afterSuite() {
    }
}