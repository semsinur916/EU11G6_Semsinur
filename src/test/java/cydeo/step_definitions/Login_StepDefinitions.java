package cydeo.step_definitions;

import cydeo.pages.LoginPage;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("user go to the login page")
    public void user_go_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enter hr username and password and click login")
    public void user_enter_hr_username_and_password_and_click_login() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr.username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("hr.password"));
        loginPage.loginBtn.click();
    }

    @When("User enter helpdesk username and password and click login")
    public void user_enter_helpdesk_username_and_password_and_click_login() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("helpdesk.password"));
        loginPage.loginBtn.click();
    }
    @When("User enter marketing username and password and click login")
    public void user_enter_marketing_username_and_password_and_click_login() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("marketing.username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("marketing.password"));
        loginPage.loginBtn.click();
    }
    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        System.out.println("user should be able to login");
        String expected = "Portal";
        Assert.assertTrue( Driver.getDriver().getTitle().contains(expected));
    }





}
