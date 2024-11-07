package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import Utilities.RandomStringGenerator;

public class TC_001_AccountRegistration extends BaseClass
    {
    RandomStringGenerator rndmGen = new RandomStringGenerator();

    @Test
    public void homePageNavigation() {
        HomePage hp = new HomePage(driver);
        hp.clickSignin();
        hp.setEmail(rndmGen.randomString() + "@gmail.com");
        hp.clickCreatePwd();
    }

    @Test
    public void Registration(){
    AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
    regPage.setChkboxGender();
    regPage.setTxtFirstName(rndmGen.randomString());
    regPage.setTxtLastname(rndmGen.randomString());
    regPage.setTxtPassword(rndmGen.randomAlphaNumeric());
    regPage.setDrpDay("10");
    regPage.setDrpMonth("4");
    regPage.setDrpYear("2002");
    regPage.clickRegister();

    String generatedMessage = regPage.get_confirmMessage();
    Assert.assertEquals(generatedMessage,"Your account has been created.");
}
}
