package testTitle;

import basic.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageTitle extends CommonAPI {
    @Test
    public void titleTest(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
    }

}
