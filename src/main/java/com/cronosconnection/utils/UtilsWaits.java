package com.cronosconnection.utils;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class UtilsWaits extends PageObject {

    public static final Logger LOG_EJECUCION = Logger.getLogger("Ejecución");

    public void esperaObjeto(String id) {
        for (int i = 0; i < 20; i++) {
            WebDriverWait wait = new WebDriverWait(getDriver(), 2);
            try {
                if (wait.until(ExpectedConditions.elementToBeClickable(By.id(id))) != null) {
                    i = 20;
                }
            } catch (Exception e) {
                LOG_EJECUCION.log(Level.INFO, () -> "***** TIEMPO DE ESPERA POR EL ELEMENTO AGOTADO **** ");
            }
        }
    }

    public void esperaObjetoXpath(String xpath) {
        for (int i = 0; i < 50; i++) {
            WebDriverWait wait = new WebDriverWait(getDriver(), 1);
            try {
                if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))) != null) {
                    i = 50;
                }
            } catch (Exception e) {
                LOG_EJECUCION.log(Level.INFO, () -> "***** TIEMPO DE ESPERA POR EL ELEMENTO AGOTADO **** ");
            }

        }
    }

    public void waitTargetObject(Target elemento) {
        for (int i = 0; i < 50; i++) {
            try {
                WaitUntil.the(elemento, isVisible()).forNoMoreThan(30).seconds();
            } catch (Exception e) {
                LOG_EJECUCION.log(Level.INFO, () -> "***** TIEMPO DE ESPERA POR EL ELEMENTO, AGOTADO **** ");
                e.printStackTrace();
            }
        }
    }
    public void waiting(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }



    public void uploadFile ( String filePath) { //Metodos clase robot para subir archivos



                try{
                    Robot robot = new Robot();
                    StringSelection ss = new StringSelection(filePath);
                    robot.keyPress(KeyEvent.VK_CONTROL);
                    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);

                }catch(Exception e){

                    System.out.println("Fallo carga archivo");

                }


    }



}
