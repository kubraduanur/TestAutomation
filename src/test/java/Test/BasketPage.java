package Test;

import ObjectPage.HomeObj;
import Utils.Stable;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends TestBase{

@Test
    public void BasketPageTest() throws InterruptedException {

    HomeObj h= PageFactory.initElements(driver,HomeObj.class);
    Thread.sleep(5000);
    getPage(Stable.mainUrl);
    Thread.sleep(5000);
    click(h.search);
    Thread.sleep(5000);
    writeEnter(h.search,"bilgisayar");
    Thread.sleep(5000);
    click(h.searchResultElements);
    Thread.sleep(6000);
    click(h.addToBasket);


}

}
