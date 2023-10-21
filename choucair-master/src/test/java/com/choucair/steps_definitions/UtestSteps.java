package com.choucair.steps_definitions;

//import com.choucair.actions.ChoucairActions;
//import com.choucair.actions.MangetoActions;
//import com.choucair.models.ChoucairModels;
import com.choucair.actions.UtestActions;
import com.choucair.models.UtestModels;
import com.choucair.pages.UtestPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class UtestSteps {

    @Managed
    WebDriver driver;

    UtestActions utestActions = new UtestActions(driver);



    @Dado("^que estoy en la pagina de utest$")
    public void queEstoyEnLaPaginaDeUtest() {
        utestActions.open();


    }

    @Cuando("^diligencio todo el formulario de registro$")
    public void diligencioTodoElFormularioDeRegistro(List<UtestModels> utesModels) {
        utestActions.irArgistroFormulario();
        utestActions.llenarDatosPersonales(utesModels.get(0));

        utestActions.agregarDireccion(utesModels.get(0));

        utestActions.asignarContrasena(utesModels.get(0));
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^deberia poder ver un mensaje indicando un registro exitoso$")
    public void deberiaPoderVerUnMensajeIndicandoUnRegistroExitoso() {
        utestActions.validarRegistroExitoso();
        // Write code here that turns the phrase above into concrete actions

    }

}
