package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement btnSignin;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement txtEmail;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement btnCreate;

    public void clickSignin ()
    {
        btnSignin.click();
    }
    public void setEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void clickCreatePwd()
    {
        btnCreate.click();
    }
}
