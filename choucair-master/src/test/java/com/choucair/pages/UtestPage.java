package com.choucair.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.utest.com/")

public class UtestPage extends BasePage{
    public UtestPage(WebDriver driver) {
        super(driver);
    }




    @FindBy(xpath = "//div[@class='container center-text']//a")
    private WebElementFacade btIrAregistroUtest;



    @FindBy(xpath = "//input[@id='firstName']")
    private WebElementFacade txNombre;

    public WebElementFacade getTxCorreo() {
        return txCorreo;
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElementFacade txCorreo;

    public WebElementFacade getTxApellido() {
        return txApellido;
    }

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElementFacade txApellido;



    public WebElementFacade getBtIrAregistroUtest() {
        return btIrAregistroUtest;
    }
    public WebElementFacade getTxNombre() {
        return txNombre;
    }

    public WebElementFacade getTxMes() {
        return txMes;
    }

    @FindBy(xpath = "//select[@id='birthMonth']")
    private WebElementFacade txMes;

    public WebElementFacade getTxMesSeleccionar() {
        return txMesSeleccionar;
    }

    @FindBy(xpath = "//option[contains(text(), 'March')]")
    private WebElementFacade txMesSeleccionar;

    public WebElementFacade getBtDia() {
        return btDia;
    }

    @FindBy(xpath = "//select[@id='birthDay']")
    private WebElementFacade btDia;

    public WebElementFacade getSelDia() {
        return selDia;
    }

    @FindBy(xpath = "//select[@id='birthDay']//child::option[contains(text(), '10')]")
    private WebElementFacade selDia;

    public WebElementFacade getBtAnio() {
        return btAnio;
    }

    @FindBy(xpath = "//select[@id='birthYear']")
    private WebElementFacade btAnio;

    public WebElementFacade getSelAnio() {
        return selAnio;
    }

    @FindBy(xpath = "//select[@id='birthYear']//child::option[contains(text(), '1998')]")
    private WebElementFacade selAnio;

    public WebElementFacade getBtContinuar() {
        return btContinuar;
    }

    @FindBy(xpath = "//i[@class='material-icons']")
    private WebElementFacade btContinuar;

    public WebElementFacade getTxCiudad() {
        return txCiudad;
    }

    @FindBy(xpath = "//input[@id='city']")
    private WebElementFacade txCiudad;

    public WebElementFacade getTxCodigoPostal() {
        return txCodigoPostal;
    }

    @FindBy(xpath = "//input[@id='zip']")
    private WebElementFacade txCodigoPostal;

    public WebElementFacade getBtContinuarDireccion() {
        return btContinuarDireccion;
    }

    @FindBy(xpath = "//a[@class='btn btn-blue pull-right']")
    private WebElementFacade btContinuarDireccion;

    public WebElementFacade getBtDispositivoMovil() {
        return btDispositivoMovil;
    }

    @FindBy(xpath = "//span[contains(text(), 'Select Brand')] ")
    private WebElementFacade btDispositivoMovil;

    public WebElementFacade getSelAlcatel() {
        return selAlcatel;
    }

    @FindBy(xpath = "//div[contains(text(), 'Alcatel')]")
    private WebElementFacade selAlcatel;

    public WebElementFacade getBtModel() {
        return btModel;
    }

    @FindBy(xpath = "//span[contains(text(), 'Select a Model')]")
    private WebElementFacade btModel;

    public WebElementFacade getSelModeloDispositivo() {
        return selModeloDispositivo;
    }

    @FindBy(xpath = "//div[contains(text(), 'OT-C700A')]")
    private WebElementFacade selModeloDispositivo;

    public WebElementFacade getBtSisteraOperativo() {
        return btSisteraOperativo;
    }

    @FindBy(xpath = "(//span[contains(text(), 'Select OS')][last()])[3]")
    private WebElementFacade btSisteraOperativo;

    public WebElementFacade getSelSistemaOperativoAndroid() {
        return selSistemaOperativoAndroid;
    }

    @FindBy(xpath = "//div[contains(text(), 'Android 2.0')]")
    private WebElementFacade selSistemaOperativoAndroid;

    public WebElementFacade getBtContinuarDisposotivos() {
        return btContinuarDisposotivos;
    }

    @FindBy(xpath = "//a[@class='btn btn-blue pull-right']")
    private WebElementFacade btContinuarDisposotivos;

    public WebElementFacade getTxContrasena() {
        return txContrasena;
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade txContrasena;

    public WebElementFacade getTxConfirmarContrasena() {
        return txConfirmarContrasena;
    }

    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElementFacade txConfirmarContrasena;

    public WebElementFacade getCheckMantenermeInformado() {
        return checkMantenermeInformado;
    }

    @FindBy(xpath = "//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']")
    private WebElementFacade checkMantenermeInformado;

    public WebElementFacade getCheckTerminoUso() {
        return checkTerminoUso;
    }

    @FindBy(xpath = "//a[contains(text(), 'uTest Guidelines')]//parent::a//parent::label")
    private WebElementFacade checkTerminoUso;

    public WebElementFacade getCheckAceptoTerminos() {
        return checkAceptoTerminos;
    }

    @FindBy(xpath = "//a[contains(text(), 'Privacy')]//parent::a//parent::label")
    private WebElementFacade checkAceptoTerminos;

    public WebElementFacade getBtContinuarContrasena() {
        return btContinuarContrasena;
    }

    @FindBy(xpath = "//a[@class='btn btn-blue']")
    private WebElementFacade btContinuarContrasena;

    public WebElementFacade getMsgRegistroExitoso() {
        return msgRegistroExitoso;
    }

    @FindBy(xpath = "//div[@class='image-box-header']//child::h1")
    private WebElementFacade msgRegistroExitoso;





















}
