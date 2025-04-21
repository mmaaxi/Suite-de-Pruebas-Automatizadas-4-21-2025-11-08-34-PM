package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_001Page {
    private WebDriver driver;
    private String url = "http://tu-aplicacion.com";
    private By barraNavegacion = By.id("barra-navegacion");

    public tc_001Page() {
        System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver");
        driver = new ChromeDriver();
    }

    public void abrirPaginaInicio() {
        driver.get(url);
    }

    public boolean esPaginaCargada() {
        return driver.getTitle() != null;
    }

    public boolean esBarraNavegacionVisible() {
        WebElement barra = driver.findElement(barraNavegacion);
        return barra != null && barra.isDisplayed();
    }

    public void cerrarNavegador() {
        if (driver != null) {
            driver.quit();
        }
    }
}