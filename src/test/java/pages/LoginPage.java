package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    private By userField = By.id("user-name");
    private By passField = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    //constructor
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void escribirUsuario(String usuario){
        driver.findElement(userField).sendKeys(usuario);
    }

    public void escribirContraseña(String contraseña){
        driver.findElement(passField).sendKeys(contraseña);
    }

    public void pulsarLogin(){
        driver.findElement(loginBtn).click();
    }

    public void login(String usuario, String contraseña){
        escribirUsuario(usuario);
        escribirContraseña(contraseña);
        pulsarLogin();
    }

    public boolean MensajedeError(){
        return driver.findElement(errorMessage).isDisplayed();
    }
}
