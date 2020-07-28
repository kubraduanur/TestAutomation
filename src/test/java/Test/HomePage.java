package Test;

import ObjectPage.HomeObj;
import ObjectPage.LoginObj;
import Utils.Stable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @Test
    public void Test() throws InterruptedException {

        HomeObj h= PageFactory.initElements(driver,HomeObj.class);
        LoginObj l= PageFactory.initElements(driver,LoginObj.class);
        getPage(Stable.mainUrl);
        Thread.sleep(3000);
        click(h.toLoginPageElement);
        Thread.sleep(5000);
        write(l.inputUserName,"kubraduanur898@gmail.com");
        write(l.inputPassword, "kbrmsl1841");
        Thread.sleep(5000);
        click(l.loginButton);
        Thread.sleep(5000);
        Assert.assertEquals(getElementText(h.profileName), Stable.expectedAccountName);




    }




}
