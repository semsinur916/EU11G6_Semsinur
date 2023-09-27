package cydeo.step_definitions;

import cydeo.pages.LoginPage;
import cydeo.pages.WorkGroupPage;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkGroup_Steps {

    LoginPage loginPage = new LoginPage();
    WorkGroupPage workGroupPage = new WorkGroupPage();
    @Given("user is enter  {string} and {string}")
    public void user_is_enter_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(username,password);
    }
    @When("user should see home page")
    public void user_should_see_home_page() {
        String expected = "Portal";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));
    }
    @When("user should click the Workgroups button")
    public void user_should_click_the_workgroups_button() {
        workGroupPage.workGroupBtn.click();
    }
    @When("user click the join button under New Corporate Identity project")
    public void user_click_the_join_button_under_new_corporate_identity_project() {
        workGroupPage.newCorpGrp.click();
    }
    @When("user click the join button under New company web site development")
    public void user_click_the_join_button_under_new_company_web_site_development() {
        workGroupPage.newCompanyGrp.click();
    }

    @When("user click the join button under New product development")
    public void user_click_the_join_button_under_new_product_development() {

        workGroupPage.newProductGrp.click();
    }
    @When("user click the join button under PR and advertising")
    public void user_click_the_join_button_under_pr_and_advertising() {
        workGroupPage.PrAdvGrp.click();
    }

    @When("user click the join button under Sales")
    public void user_click_the_join_button_under_sales() {
        workGroupPage.SalesGrp.click();
    }
    @Then("user click the join button under Technology")
    public void user_click_the_join_button_under_technology() {
        workGroupPage.TeckGrp.click();
    }


    @When("user click the SORT BY dropdown menu")
    public void user_click_the_sort_by_dropdown_menu() {
        workGroupPage.SortGrp.click();
    }
    @When("user click the ABC order")
    public void user_click_the_abc_order() {
        workGroupPage.AbcOrder.click();
    }
    @When("user click the time joined button")
    public void user_click_the_time_joined_button() {
        workGroupPage.TimeOrder.click();
    }
    @When("user click the last viewed")
    public void user_click_the_last_viewed() {
        workGroupPage.LastViewed.click();
    }
    @When("user click the Number of Members")
    public void user_click_the_number_of_members() {
        workGroupPage.NumOfMembers.click();
    }
    @When("user click the last active")
    public void user_click_the_last_active() {
        workGroupPage.LastActive.click();
    }
    @Then("user click the time created")
    public void user_click_the_time_created() {
        workGroupPage.TimeCreated.click();
    }
    @When("user Enter the New Corporate Identity project and click warning button")
    public void user_enter_the_new_corporate_identity_project_and_click_warning_button() {
        workGroupPage.newCorpHead.click();
        workGroupPage.newCorpWarnBtn.click();
    }
    @When("user Enter New company web site development and click warning button")
    public void user_enter_new_company_web_site_development_and_click_warning_button() {
        workGroupPage.newCompanyHead.click();
        workGroupPage.newCompLeaveWarn.click();
    }

}
