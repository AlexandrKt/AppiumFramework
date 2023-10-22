package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SamplesListPage;
import utils.Base;
import java.io.IOException;

public class StepDefinitions {
    protected static Base base;
    protected final LoginPage loginPage;
    protected final SamplesListPage samplesListPage;

    public StepDefinitions() {
        this.base = new Base();
        this.loginPage = new LoginPage(this.base);
        this.samplesListPage =new SamplesListPage(this.base);
    }

    @Before
    public void bf(Scenario scenario) throws IOException
    {
        //base.setScenarioName(String.valueOf(scenario));
         //   base.setUp();
    }

    @After
    public static void aft() throws IOException
    {
        base.tearDown();
    }

    @Given("User is load the {string} on Android  phone")
    public void loadApplication(String appName) {
        base.setUp(appName);
    }
    @When("User wait until {string} Page will be loaded")
    public void waitUntil(String pageName){
        this.loginPage.waitUntilPageLoaded(pageName);
    }
    @And("User enter {string} to {string} input")
    public void enterValueToField(String value, String fieldName){
        this.loginPage.enterValueToField(value, fieldName);
    }
    @Then("User press the button {string}")
    public void pressButton(String buttonName){
        this.loginPage.pressTheLogInButton(buttonName);
    }
    @When("User wait until {string} Page will load")
    public void waitUntilSamplesListPageAppear(String pageName){
        this.samplesListPage.waitUntilPageLoaded(pageName);
    }

    @When("User sees Bad Cred error modal window")
    public void badCredModalWindowAppear(){
        this.loginPage.errorModalWindow();
    }

    @Then("User press Ok button on error modal window")
    public void pressOkButton(){
        this.loginPage.pressOkButtonErrorBadCred();
    }
}
