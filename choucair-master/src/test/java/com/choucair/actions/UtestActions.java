package com.choucair.actions;

import com.choucair.models.UtestModels;
import com.choucair.pages.UtestPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.apache.xerces.impl.xpath.regex.Match;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtestActions extends UtestPage {
    public UtestActions(WebDriver driver) {
        super(driver);
    }
    public  void irArgistroFormulario(){
        getBtIrAregistroUtest().waitUntilClickable();
        getBtIrAregistroUtest().click();
    }

    public void llenarDatosPersonales(UtestModels utestModels){
        getTxNombre().waitUntilEnabled();
        enter(utestModels.getNombre()).into(getTxNombre());

        getTxApellido().waitUntilEnabled();
        enter(utestModels.getApellido()).into(getTxApellido());

        getTxCorreo().waitUntilEnabled();
        enter(utestModels.getCorreo()).into(getTxCorreo());

        getTxMes().waitUntilEnabled();
        getTxMes().click();

        getTxMesSeleccionar().waitUntilClickable();
        getTxMesSeleccionar().click();

        getBtDia().waitUntilClickable();
        getBtDia().click();

        getSelDia().waitUntilClickable();
        getSelDia().click();

        getBtAnio().waitUntilClickable();
        getBtAnio().click();

        getSelAnio().waitUntilClickable();
        getSelAnio().click();

        getBtContinuar().waitUntilClickable();
        getBtContinuar().click();





    }

    public  void agregarDireccion(UtestModels model){
        getTxCiudad().waitUntilClickable();
        getTxCiudad().clear();
        enter(model.getCiudad()).into(getTxCiudad());
        getTxCiudad().sendKeys(Keys.TAB);


        getTxCodigoPostal().waitUntilClickable();
        enter(model.getCodigoPostal()).into(getTxCodigoPostal());

       getBtContinuarDireccion().waitUntilClickable();
       getBtContinuarDireccion().click();

       getBtDispositivoMovil().waitUntilClickable();
       getBtDispositivoMovil().click();

       getSelAlcatel().waitUntilClickable();
       getSelAlcatel().click();

       getBtModel().waitUntilClickable();
       getBtModel().click();

       getSelModeloDispositivo().waitUntilClickable();
       getSelModeloDispositivo().click();

       getBtSisteraOperativo().waitUntilClickable();
       getBtSisteraOperativo().click();

       getSelSistemaOperativoAndroid().waitUntilClickable();
       getSelSistemaOperativoAndroid().click();

       getBtContinuarDisposotivos().waitUntilClickable();
       getBtContinuarDisposotivos().click();
    }

    public void asignarContrasena(UtestModels models){

        getTxContrasena().waitUntilClickable();
        enter(models.getContrasena()).into(getTxContrasena());

        getTxConfirmarContrasena().waitUntilClickable();
        enter(models.getContrasena()).into(getTxConfirmarContrasena());

        getCheckMantenermeInformado().waitUntilClickable();
        getCheckMantenermeInformado().click();

        getCheckTerminoUso().waitUntilClickable();
        getCheckTerminoUso().click();

        getCheckAceptoTerminos().waitUntilClickable();
        getCheckAceptoTerminos().click();

        getBtContinuarContrasena().waitUntilClickable();
        getBtContinuarContrasena().click();

    }

    public void validarRegistroExitoso(){
        getMsgRegistroExitoso().waitUntilVisible();
        System.out.println(getMsgRegistroExitoso().getText()+"222222222222222222222222222222222");
        MatcherAssert.assertThat("Se espera mensaje de bienvendia", getMsgRegistroExitoso().getText(), Matchers.is("Welcome to the world's largest community of freelance software testers!"));
    }
















}
