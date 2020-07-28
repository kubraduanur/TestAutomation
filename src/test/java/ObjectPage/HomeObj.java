package ObjectPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeObj{

    @FindBy(how= How.XPATH,using="/html/body/div[3]/div[3]/div/div[4]/div[1]/a/div[2]/div/span[2]")
    public WebElement toLoginPageElement;
    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div[3]/div/div[4]/div[1]/a/div[2]/div/span[2]")
    public  WebElement profileName;
    @FindBy(how = How.XPATH,using = "/html/body/div[2]/header/div[3]/div/div[1]/div/div[2]/div/div[1]/div[2]/input")
    public  WebElement search;
    @FindBy(how = How.CLASS_NAME,using = "search-result-keyword")
    public  WebElement resultSearchText;
    @FindBy(how = How.ID,using = "gg-login-enter")
    public  WebElement loginButton;
    @FindBy(how = How.XPATH,using = "/html/body/div[5]/div[2]/div/div[2]/div[4]/div[2]/ul/li[1]/a/div/div/div[1]/div[2]/div")
    public WebElement searchResultElements;
    @FindBy(how = How.ID,using = "sp-price-lowPrice")
    public WebElement productActualPrice;
    @FindBy(how = How.ID,using = "add-to-basket")
    public WebElement addToBasket;






}