package login.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.HomePage;
import lombok.Builder;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("select title")
    public void openHomePage(){
        //WebDriver webDriver = new ChromeDriver();
        //webDriver.findElement(By.id("xxx"));
        System.out.println("select title....");
    }
    @When("select body")
    public void inputName(){
        System.out.println("select body....");

    }



    @Then("select ok res")
    public void res2(){
        System.out.println("select title....");
        Assert.assertTrue(true);
    }


    @Then("select fail res")
    public void fail()throws Exception{

        System.out.println("select title....");
        Assert.assertTrue(false);
    }
}
