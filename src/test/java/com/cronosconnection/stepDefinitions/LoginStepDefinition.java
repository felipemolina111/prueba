package com.cronosconnection.stepDefinitions;


import com.cronosconnection.questions.ValidarLogin;
import com.cronosconnection.tasks.Login;
import com.cronosconnection.userInterfaces.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");




    private LoginPage loginPage = new LoginPage();

    @Before
    public void configuracion (){
        juan.can(BrowseTheWeb.with(navegador)); }


    @Given("^el usuario se encuentra en la pagina de inicio$")
    public void elUsuarioSeEncuentraEnLaPaginaDeInicio() {
        juan.wasAbleTo(Open.browserOn(loginPage));
    }

    @When("^el usuario ingrese el usuario, contraseña y de click en el botón ingresar$")
    public void elUsuarioIngreseElUsuarioContraseñaYDeClickEnElBotónIngresar() {
        juan.attemptsTo(Login.login());
    }

    @Then("^el usuario visualiza la pantalla inicial de cronos connection$")
    public void elUsuarioVisualizaLaPantallaInicialDeCronosConnection() {
        juan.should(seeThat("El usuario valida que el mensaje se muestra", ValidarLogin.validarLogin(), Matchers.equalTo(true)));
    }

}
