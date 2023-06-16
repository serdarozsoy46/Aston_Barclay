package aston.pages;

import aston.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Driver{


    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\'createBtn\']")
    public WebElement createAccountMenuBtn;

    @FindBy(xpath = "//*[@id=\'loginBtn\']")
    public WebElement loginMenuButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement LoginBtn;

    @FindBy(xpath = "//*[@id=\'Username\']")
    public WebElement userNameOrEmailTextbox;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//*[@id='CompanyName']")
    public WebElement companyTradingOrBusinessNameInputbox;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    public WebElement emailAdressInputbox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitApplicationBtn;

    @FindBy(xpath = "//*[@id='contentWrap']//h1")
    public WebElement loginPageText;


    private static class LoginMenuBtn {
    }
}
