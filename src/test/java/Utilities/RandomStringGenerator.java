package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {
    public String randomString()
    {
        String generatedString= RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }

    public String randomNumber()
    {
        String generatedString=RandomStringUtils.randomNumeric(10);
        return generatedString;
    }

    public String randomAlphaNumeric()
    {
        String str=RandomStringUtils.randomAlphabetic(3);
        String num=RandomStringUtils.randomNumeric(3);

        return (str+"@"+num);
    }
}
