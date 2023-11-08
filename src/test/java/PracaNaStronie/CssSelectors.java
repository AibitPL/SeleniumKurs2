package PracaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    @Test
    public void FindElements(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        By cssID=By.cssSelector("#clickOnMe");
        driver.findElement(cssID);

        By cssClass=By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        By cssTagName=By.cssSelector("input");
        driver.findElement(cssTagName).sendKeys("Maciej");

        By cssName=By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By cssClass2=By.cssSelector("[class='topSecret']"); //inny sposob zapisu wyszukiwania klas
        driver.findElement(cssClass2);

        By cssAll=By.cssSelector("*");
        driver.findElement(cssAll);

        By ulInsideDiv=By.cssSelector("div ul");
        driver.findElement(ulInsideDiv);

        By trInTable=By.cssSelector("table tr");
        By trInTbody=By.cssSelector("tbody tr");
        By firstDiv=By.cssSelector("div > ul");

        By firstFormAfterLabel=By.cssSelector("label + form"); //wskazuje pierwszy form po labelu
        By allFormsAfterLabel=By.cssSelector("label ~ form");
        driver.findElement(firstFormAfterLabel);
        driver.findElement(allFormsAfterLabel);

        By includeZnak=By.cssSelector("[name*='nam'"); // wskazuje element zawierajacy ciag znakow nam
        By startsZnak=By.cssSelector("[name^='f'");
        By endsZnak=By.cssSelector("[name$='name'");

        By firstChildFromList=By.cssSelector("li:first-child");  //wskazuje pierwszy element w liscie
        By lastChildFromList=By.cssSelector("li:last-child");
        By nChildFromList=By.cssSelector("li:nth-child(3)");

    }
}
