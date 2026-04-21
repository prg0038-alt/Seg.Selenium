package test;

//Todas la importaciones necesarias
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest {
    //Atributos que necesitamos
    //Este repersenta el navegador
    private WebDriver driver;
    //Este es para utilizar el LoginPage
    private LoginPage loginPage;

    //Este metodo se realiza antes de cada test
    @BeforeEach
    void setUp() {
        //Configura automaticamente el drive de Chrome
        WebDriverManager.chromedriver().setup();

        //Inicializa el navegador de Chrome
        driver = new ChromeDriver();

        //Maximiza la ventana del navegador
        driver.manage().window().maximize();

        //Abre la página web a testear
        driver.get("https://www.saucedemo.com/");

        //Inializa la página de login
        loginPage = new LoginPage(driver);
    }

    //Este metodo se ejecutara Desoues de cada test
    @AfterEach
    void tearDown() {
        //Cierra el navegador si este existe para cerralo todo
        if (driver != null) {
            driver.quit();
        }
    }

    //Test para login correcto
    @Test
    void loginCorrecto(){
        //Ejecuta el login con las credenciales que son validadas
        loginPage.login("standard_user", "secret_sauce");

        //Verifica que la URL contiene inventori
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    //Test pata login incorrecto
    @Test
    void loginIncorrecto(){
        //Ejecuta el login con las credenciales que NO son validadas
        loginPage.login("Usuario_estandar", "contraseña_incorrecta");

        //Verifica que aparece el mensaje de error
        assertTrue(loginPage.MensajedeError(),
                "La contraseña no es correcta");
    }
}
