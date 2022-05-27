package login.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import login.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.JDBCType;

public class TestErrStepDefinitions {


    @Then("select err res")
    public void err(){
        System.out.println("select err res。。。。。。。。。。");
    }


}
