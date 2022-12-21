package com.cronosconnection.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://10.203.201.21:443/orders/#/login")

public class LoginPage extends PageObject {


    public static final Target TXT_USUARIO = Target.the("usuario").located(By.xpath("//input[@id='mat-input-0']"));
    public static final Target TXT_CLAVE = Target.the("contraseña").located(By.xpath("//input[@id='mat-input-1']"));
    public static final Target BTN_INGRESAR = Target.the("boton ingresar").located(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']"));
}
