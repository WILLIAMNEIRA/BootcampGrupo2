package com.co.qvision.task;

import com.co.qvision.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.*;

public class ValidateField implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("bootcampG2").into(HomePage.TXT_TEXTINPUT),
                Enter.theValue("1234").into(HomePage.TXT_PASSWORD),
                Enter.theValue("Esta es nuestra automatizacion").into(HomePage.TXT_TEXTTAREA),
                //
                //
                SelectFromOptions.byValue("1").from(HomePage.SELECT_DROPDOWN),
                Enter.theValue("Seatle").into(HomePage.DATALIST_DROPDOWN),

                // Click.on(HomePage.FILE_INPUT),
                Click.on(HomePage.CHECKED_CHECKBOX),
                Click.on(HomePage.DEFAULT_CHECKBOX),
                Click.on(HomePage.CHECKED_RADIO),
                Click.on(HomePage.DEFAULT_RADIO),
                DoubleClick.on(HomePage.COLOR_PICKER));
                try {Thread.sleep(2000);} catch (InterruptedException e) {throw new RuntimeException(e);}
                actor.attemptsTo(SelectFromOptions.byValue("#105DD1").from(HomePage.COLOR_PICKER));


    }

    public static ValidateField enterData() {
        return Tasks.instrumented(ValidateField.class);

    }
}

