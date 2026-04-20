package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

        private WebDriver driver;

        public InventoryPage(WebDriver driver){
            this.driver = driver;
        }

        private By botonProducto(String nombreProducto) {
            return By.xpath("//div[text()='" + nombreProducto + "']/ancestor::div[@class='inventory_item']//button");
        }

        public void  añadirProducto(String nombreProducto){
            driver.findElement(botonProducto(nombreProducto)).click();
        }

        public int obtenerCantidadProductosCarrito(){
            try {
                String numero = driver.findElement(By.className("shopping_cart_badge")).getText();
                return Integer.parseInt(numero);
            } catch (Exception e) {
                return 0;
            }
        }

        public String obtenerTextoBoton(String nombreProducto) {
            return driver.findElement(botonProducto(nombreProducto)).getText();
        }

        public void  eliminarProducto(String nombreProducto){
            driver.findElement(botonProducto(nombreProducto)).click();
        }

}
