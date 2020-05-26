package Proyecto_Basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MercadoSearch {

    public static void main(String[] args) {
        //INICIALIZACION DE SYSTEM.SETPROPERTY()
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
        driver.get("https://www.mercadolibre.com.mx/");
        WebElement searchBox = driver.findElement(By.cssSelector(".nav-search-input"));//se identifica el elemento de busaueda
        WebElement searchButton = driver.findElement(By.cssSelector(".nav-icon-search"));//el elemento lupa se activa
        //el correcto

        //searchBox.clear();
        searchBox.sendKeys("Mustang 2012"); //ingresar el parametro de busqueda
        searchButton.click(); //el robot da clic en la lupa

        WebElement BusquedaMustang = driver.findElement(By.id("MLM775302555"));
        BusquedaMustang.click();

        //dowIds = new ArrayList<String>(driver.getWindowHandles());
        //umber of windows: " + windowIds.size());
        //
        //driver.getWindowHandles()) {
        //.window(windowId);
        //
        //
        //nk = driver.findElement(By.linkText("Download"));
        //

        driver.close();

    }

}


