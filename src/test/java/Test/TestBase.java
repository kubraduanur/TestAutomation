package Test;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class TestBase {
    WebDriver driver;

    @Before
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testinium\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

    }


    public void getPage(String url) {
        driver.get(url);

    }

    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {

            System.out.println(element.getText() + "elemente tıklanmadı");
        }


    }

    public void write(WebElement element, String s) {
        try {
            element.sendKeys(s);
        } catch (Exception e) {

            System.out.println(element.getText() + "Değer gönderilemedi");
        }

    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public void writeEnter(WebElement element, String s) {
        try {
            element.sendKeys(s,Keys.ENTER);
        } catch (Exception e) {

            System.out.println(element.getText() + "Değer gönderilemedi");
        }

    }

    public String getTextElement(WebElement element) {
       return element.getText();

    }

}