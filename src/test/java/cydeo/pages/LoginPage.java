package cydeo.pages;

import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class LoginPage {


    // stale Element exception

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement userNameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    public void loginAsRole(String role){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String username = "";
        String password = "";
        switch (role.toLowerCase()) {

            case "hr":
                username = ConfigurationReader.getProperty("library.student.email");
                password = ConfigurationReader.getProperty("library.student.password");
                break;

            case "helpDesk":
                username = ConfigurationReader.getProperty("library.teacher.email");
                password = ConfigurationReader.getProperty("library.teacher.password");
                break;
            case "marketing":
                username = ConfigurationReader.getProperty("library.teacher.");
                password = ConfigurationReader.getProperty("library.teacher.pas");
                break;
        }

        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

}
