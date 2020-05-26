package Proyecto_Basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginCorrecto {

    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {

        navegarUrl("https://www.mercadolibre.com.mx/");
        verificarHomePage();
        loginCorrecto("cybsarynet@gmail.com", "tribilin");

    }

    private static void navegarUrl(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        wait = new WebDriverWait(driver, 15);
    }

    private static void verificarHomePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Ingresa")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".nav-logo")));
    }

    private static void loginCorrecto(String user, String pas) {
        WebElement loginLink = driver.findElement(By.linkText("Ingresa"));
        loginLink.click();
        WebElement userField = driver.findElement(By.id("user_id"));//localiza el elemento etiqueta
        //WebElement userField1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("#user_id")));
        userField.sendKeys(user);//captura los datos del usuario
        //userField.click();
        //WebElement BottonContinue = driver.findElement(By.cssSelector("andes-button__content"));
       WebElement boton= driver.findElement(By.cssSelector(".andes-button__content"));//encuentra el boton continuar
        boton.click();//da click en boton Continuar

        WebElement claveField = driver.findElement(By.id("password"));
        //WebElement claveField = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#password")));
        claveField.sendKeys(pas);//ingresa el password
        WebElement botonfin= driver.findElement(By.cssSelector(".andes-button__content"));//selecciona el boton ingresar
        botonfin.click(); //da click en boton ingresar

        //WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[value='Ingresar']")));
        //loginButton.click();
        //userCorrect.sendKeys("cybsarynet");
        //claveField.sendKeys("tribilin");

        //WebElement loggedInMessage = driver.findElement(By.id("flash"));
        //if (loggedInMessage.getText().equals("You are now logged in as Luis"))
          //  System.out.println("Test Passed");
        //else
          //  System.out.println("Test Failed");

        driver.close();
          }


}
