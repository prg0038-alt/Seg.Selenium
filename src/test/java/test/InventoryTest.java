package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.InventoryPage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        inventoryPage = new InventoryPage(driver);
    }
    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void anadirUnProductoAlCarrito(){

        inventoryPage.añadirProducto("Sauce Labs Backpack");

        assertEquals(1, inventoryPage.obtenerCantidadProductosCarrito());
    }
    @Test
    void anadirDosProductosAlCarrito(){

        inventoryPage.añadirProducto("Sauce Labs Backpack");
        inventoryPage.añadirProducto("Sauce Labs Bike Light");

        assertEquals(2, inventoryPage.obtenerCantidadProductosCarrito());
    }
    @Test
    void botonCambiaTrasAnadirProducto(){

        inventoryPage.añadirProducto("Sauce Labs Backpack");

        assertEquals("Remove", inventoryPage.obtenerTextoBoton("Sauce Labs Backpack"));
    }
    @Test
    void eliminarProductoDelCarrito(){

        inventoryPage.añadirProducto("Sauce Labs Backpack");
        inventoryPage.eliminarProducto("Sauce Labs Backpack");

        assertEquals(0, inventoryPage.obtenerCantidadProductosCarrito());
    }
}
