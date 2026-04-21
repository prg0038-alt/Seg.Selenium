package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Page Object que representa la página de inventario de productos
public class InventoryPage {

        //El atributo privado que representa el naveador
        private WebDriver driver;

        // Constructores
        //este indica al navegador
        public InventoryPage(WebDriver driver){
            this.driver = driver;
        }

        //Este metodo es privado y sirve para construir un xpath para un producto en concreto
        private By botonProducto(String nombreProducto) {
            return By.xpath("//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item']//button");
        }

        // Añade un producto al carrito haciendo clic en su botón
        public void  anadirProducto(String nombreProducto){
            driver.findElement(botonProducto(nombreProducto)).click();
        }

        //Obtiene la cantidad de productos en el carrito
        public int obtenerCantidadProductosCarrito(){
            try {
                // Lee el número que aparece en el icono del carrito
                String numero = driver.findElement(By.className("shopping_cart_badge")).getText();
                // Convierte el texto a número entero
                return Integer.parseInt(numero);
            } catch (Exception e) {
                // Si no hay badge (carrito vacío), devuelve 0
                return 0;
            }
        }

        // Obtiene el texto del botón de un producto
        public String obtenerTextoBoton(String nombreProducto) {
            return driver.findElement(botonProducto(nombreProducto)).getText();
        }

        // Elimina un producto del carrito haciendo clic en el mismo botón
        public void  eliminarProducto(String nombreProducto){
            driver.findElement(botonProducto(nombreProducto)).click();
        }

}
