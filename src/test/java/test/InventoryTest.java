package test;

//Todas la importaciones necesarias
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
    //Atributos que necesitamos
    //Este repersenta el navegador
    private WebDriver driver;
    //Este es para utilizar el LoginPage
    private LoginPage loginPage;
    //Este es para utilizar el InventoryPage
    private InventoryPage inventoryPage;

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

        // Hace login antes de cada test sino todos fallaran
        loginPage.login("standard_user", "secret_sauce");

        //Inializa la página de inventory
        inventoryPage = new InventoryPage(driver);
    }

    // Se ejecuta después de cada test
    @AfterEach
    void tearDown() {

        // Cierra el navegador
        if (driver != null) {
            driver.quit();
        }
    }

    //Test para añadir un producto al carrito
    @Test
    void anadirUnProductoAlCarrito(){
        // Añade un producto específico
        inventoryPage.anadirProducto("Sauce Labs Backpack");

        // Verifica que el carrito tiene 1 producto porque es lo hemos añadido en el test
        assertEquals(1, inventoryPage.obtenerCantidadProductosCarrito());
    }

    //Test para añadir dos productos al carrito
    @Test
    void anadirDosProductosAlCarrito(){
        // Añade dos producto específico
        inventoryPage.anadirProducto("Sauce Labs Backpack");
        inventoryPage.anadirProducto("Sauce Labs Bike Light");

        // Verifica que el carrito tiene 2 producto porque es lo hemos añadido en el test
        assertEquals(2, inventoryPage.obtenerCantidadProductosCarrito());
    }

    //Test para verificar que el botón cambia al añadir producto
    @Test
    void botonCambiaTrasAnadirProducto(){
        // Añade un producto específico
        inventoryPage.anadirProducto("Sauce Labs Backpack");

        // Verifica que el botón cambia a "Remove"
        assertEquals("Remove", inventoryPage.obtenerTextoBoton("Sauce Labs Backpack"));
    }

    //Test para eliminar producto del carrito
    @Test
    void eliminarProductoDelCarrito(){
        // Añade un producto específico
        inventoryPage.anadirProducto("Sauce Labs Backpack");

        // Elimina un producto específico
        inventoryPage.eliminarProducto("Sauce Labs Backpack");

        // Verifica que el carrito queda vacío
        assertEquals(0, inventoryPage.obtenerCantidadProductosCarrito());
    }
}
