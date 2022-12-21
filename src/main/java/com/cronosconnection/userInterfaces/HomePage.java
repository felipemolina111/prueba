package com.cronosconnection.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    
    public static final Target IMG_CRONOS = Target.the("imagen inicial cronos").located(By.xpath("//div[@class='cronos-app-name']"));
    public static final Target BTN_ORDENES_TRABAJO = Target.the("boton ordenes de trabajo").located(By.xpath("//a[@href='#/dashboard/orden/trabajo']"));
    public static final Target BTN_MOVISTAR_MAS = Target.the("boton bandeja de movistar mas").located(By.xpath("//mat-icon[text()=' receipt_long']"));
}
