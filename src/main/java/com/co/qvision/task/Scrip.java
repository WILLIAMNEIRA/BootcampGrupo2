package com.co.qvision.task;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Scrip implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Enter.theValue("bootcampG2").into(HomePage.TXT_TEXTINPUT),
                    Enter.theValue("1234").into(HomePage.TXT_PASSWORD),
                    Enter.theValue("Esta es nuestra automatizacion").into(HomePage.TXT_TEXTTAREA),
                    SelectFromOptions.byValue("1").from(HomePage.SELECT_DROPDOWN),
                    SelectFromOptions.byValue("San Francisco").from(HomePage.DATALIST_DROPDOWN),
                    Click.on(HomePage.CHECKED_CHECKBOX));





    }
        public static Scrip enterData() {
            return Tasks.instrumented(Scrip.class);

        }
    }

