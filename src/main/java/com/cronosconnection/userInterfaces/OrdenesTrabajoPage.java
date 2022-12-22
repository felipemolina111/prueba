package com.cronosconnection.userInterfaces;

import com.cronosconnection.utils.Datos;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;

public class OrdenesTrabajoPage extends PageObject {
    Datos datos = new Datos();

    String ot = datos.leerDatosExcel("DatosCronos.xlsx","SinAutoticket",6,1);
    String otAutoticket = datos.leerDatosExcel("DatosCronos.xlsx","ConAutoticket",6,1);
    String marca = datos.leerDatosExcel("DatosCronos.xlsx","SinAutoticket",7,1);
    String marcaAutoticket = datos.leerDatosExcel("DatosCronos.xlsx","ConAutoticket",7,1);
    String horaInicio = datos.leerDatosExcel("DatosCronos.xlsx","ConAutoticket",19,1);
    String horaFin = datos.leerDatosExcel("DatosCronos.xlsx","ConAutoticket",20,1);

    String id = datos.leerDatosExcel("DatosCronos.xlsx","DescubrimientoInterfaces",5,1);
    String posicion = datos.leerDatosExcel("DatosCronos.xlsx","DescubrimientoInterfaces",6,1);


    public static final Target BTN_SELECCIONAR_OT = Target.the("boton seleccionar ot").located(By.xpath("//span[text()=' \"+ot+\" ']"));


    
    public OrdenesTrabajoPage() throws IOException {
    }
}
