package com.co.qvision.stepdefinitions;

import com.co.qvision.task.Scrip;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class HomeStepDefinition {
    @Managed
    WebDriver isBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("BootcampGrupo2");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(isBrowser));

    }

    @Given("^he use is on the page$")
    public void heUseIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://bonigarcia.dev/selenium-webdriver-java/web-form.html"));

    }


    @When("^user knows all fields$")
    public void userKnowsAllFields() {
    OnStage.theActorInTheSpotlight().attemptsTo(Scrip.enterData());
    }

    @Then("^user validate pages$")
    public void userValidatePages() {

    }


}
