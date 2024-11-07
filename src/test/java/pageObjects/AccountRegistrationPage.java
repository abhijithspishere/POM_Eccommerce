package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage
{
    public AccountRegistrationPage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement chkboxGender;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement txtLastname;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement txtPassword;

    @FindBy(xpath = "//select[@id='days']")
    WebElement drpDay;

    @FindBy(xpath = "//select[@id='months']")
    WebElement drpMonth;

    @FindBy(xpath = "//select[@id='years']")
    WebElement drpYear;

    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement btnRegister;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElement confirmMsg;

    public void setChkboxGender()
    {
        chkboxGender.click();
    }
    public void setTxtFirstName(String fname)
    {
        txtFirstName.sendKeys(fname);
    }

    public void setTxtLastname(String lname)
    {
        txtLastname.sendKeys(lname);
    }

    public void setTxtPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }

    public void setDrpDay (String Day)
    {
        Select sDay = new Select(drpDay);
        sDay.selectByValue(Day);
    }

    public void setDrpMonth (String Month)
    {
        Select sMon = new Select(drpMonth);
        sMon.selectByValue(Month);
    }

    public void setDrpYear (String Year)
    {
        Select sYear = new Select(drpYear);
        sYear.selectByValue(Year);
    }

    public void clickRegister()
    {
        btnRegister.click();
    }

    public  String get_confirmMessage ()
    {
        try
        {
            return (confirmMsg.getText());
        }
        catch (Exception e)
        {
            return (e.getMessage());
        }
    }
}

