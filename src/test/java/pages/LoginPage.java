package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Clase que representa la págiona de longin es decir este es el Page Object Model
public class LoginPage {
    //El atributo privado que representa el naveador
    private final WebDriver driver;

    //Estos atributos indican los otros elementos de la pagina
    private By userField = By.id("user-name");
    private By passField = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    //constructores
    //este indica al navegador
    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    //Este es para poder escribir el nombre de usuario en el campo que le corresponde
    public void escribirUsuario(String usuario){

        driver.findElement(userField).sendKeys(usuario);
    }

    //Este es para poder escribir la contraseña en el campo que le corresponde
    public void escribirContrasena(String contrasena){

        driver.findElement(passField).sendKeys(contrasena);
    }

    //Para poder hacerle el click en el boton de login
    public void pulsarLogin(){

        driver.findElement(loginBtn).click();
    }

    //Este metodo relaiza que se intriduzaca en el login
    public void login(String usuario, String contrasena){
        escribirUsuario(usuario); //Introduce usuario
        escribirContrasena(contrasena); //Introduce contr
        pulsarLogin();
    }

    //Este metodo devuelve un mensaje de error si cumple la condicion de quye hay un error
    public boolean MensajedeError(){

        return driver.findElement(errorMessage).isDisplayed();
    }
}
