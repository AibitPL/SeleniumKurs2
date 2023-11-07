package PracaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelektorTest {
    @Test
    public void FindElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        // id="clickOnMe"
        By buttonId = By.id("clickOnMe");
        By buttonName = By.name("fname");
        WebElement clickOnMe = driver.findElement(buttonId);
        WebElement clickOnMeName = driver.findElement(buttonName);

        WebElement findClass = driver.findElement(By.className("topSecret"));

        By inputsLocator=By.tagName("input");
        WebElement input= driver.findElement(inputsLocator);
        input.sendKeys("Pierwszy input"); //wpisuje do pierwszego inputa podana wartosc
        List<WebElement> inputs=driver.findElements(inputsLocator);
        System.out.println(inputs.size()); //wypisuje ile jest inputow na stronie

        By linkTex= By.linkText("Visit W3Schools.com!");
        WebElement findLink=driver.findElement(linkTex);

        By partialText = By.partialLinkText("Visit");
        driver.findElement(partialText);

    }
}