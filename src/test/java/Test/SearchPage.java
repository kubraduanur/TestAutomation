package Test;

import ObjectPage.HomeObj;
import Utils.Stable;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBase {

@Test
public void searchtest() throws InterruptedException {

    HomeObj h= PageFactory.initElements(driver,HomeObj.class);
    Thread.sleep(4000);
    getPage(Stable.mainUrl);
    Thread.sleep(4000);
    click(h.search);
    Thread.sleep(4000);
    writeEnter(h.search,"bilgisayar");
    Assert.assertEquals(Stable.searchtext,getElementText(h.resultSearchText));


}


}
