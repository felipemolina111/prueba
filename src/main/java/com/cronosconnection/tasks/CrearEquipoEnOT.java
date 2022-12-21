package com.cronosconnection.tasks;

import com.cronosconnection.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.cronosconnection.userInterfaces.LoginPage.*;

public class CrearEquipoEnOT implements Task {

    Datos datos = new Datos();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try { actor.attemptsTo(
                Enter.theValue(datos.leerDatosExcel("DatosCronos.xlsx","GENERAL",2,1)).into(TXT_USUARIO),
                Enter.theValue(datos.leerDatosExcel("DatosCronos.xlsx","GENERAL",3,1)).into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );
        }
        catch (IOException e){

        }



    }
}
