package login.stepdefinitions;

import io.cucumber.java.en.And;
import login.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.WikipediaArticle;
/**
 * <p>Title: loginStepDefinitions</p>
 * <p>Description: </p>
 *
 * @author yu.chen
 * @date 2021/6/2 2:22 PM
 * ------------------- History -------------------
 * <date>      <author>       <desc>
 * 2021/6/2   yu.chen    初始创建
 * -----------------------------------------------
 */
public class loginStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("^User is on Home page$")
    public void openHomePage(){
//    Open.browserOn().the(HomePage.class)
        homePage.openApplication();
    }
    @When("^User enters username as Admin")
    public void inputName(){
        homePage.enterUsername();
    }
    @And("^User enters password as admin123$")
    public void inputPwd(){
        homePage.enterPassword();
    }
    @Then("User should be able to login successfully$")
    public void verifyLogin(){
        homePage.clickOnLoginButton();
    }
}
