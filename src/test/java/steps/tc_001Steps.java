package steps;

import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("que el usuario abre el navegador y accede a la URL de la aplicación")
    public void abrirNavegadorYAccederURL() {
        page.abrirPaginaInicio();
    }

    @Then("la página de inicio se carga correctamente")
    public void verificarCargaPaginaInicio() {
        assertTrue(page.esPaginaCargada());
    }

    @Then("la barra de navegación principal es visible y funcional")
    public void verificarBarraNavegacion() {
        assertTrue(page.esBarraNavegacionVisible());
    }
}