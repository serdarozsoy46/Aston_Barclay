package aston.step_definitions;

import aston.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStepDef {

    DashboardPage dashboardPage = new DashboardPage();

    @Given("user tries go the dashboard page")
    public void user_tries_go_the_dashboard_page() {
    // it's take from Hook before class
    }


    @Given("user cliks login function")
    public void userCliksLoginFunction() {
       dashboardPage.loginMenuButton.click();
    }

    @Then("user should see login page")
    public void userShouldSeeLoginPage() {
        Assert.assertEquals("LOGIN TO YOUR ACCOUNT",dashboardPage.loginPageText.getText());
    }

    @And("user type username or email input box")
    public void userTypeUsernameOrEmailInputBox() {
        dashboardPage.userNameOrEmailTextbox.sendKeys("serdar_ozsoy@msn.com");
    }

    @And("user type password input box")
    public void userTypePasswordInputBox() {
        dashboardPage.passwordTextbox.sendKeys("Test123456!");
    }

    @When("user cliks login button")
    public void userCliksLoginButton() {
        dashboardPage.LoginBtn.click();
    }

    @Then("user should login successfully")
    public void userShouldLoginSuccessfully() {
    }
}
