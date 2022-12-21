package com.cronosconnection.questions;

import com.cronosconnection.userInterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogin implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return HomePage.IMG_CRONOS.resolveFor(actor).isVisible();
    }


    public static Question validarLogin(){ return new ValidarLogin(); }


}