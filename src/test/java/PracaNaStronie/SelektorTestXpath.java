package PracaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;

public class SelektorTestXpath {

    @Test
    public void SzukaniePoXpath(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement guzik1 = driver.findElement(By.xpath("/html/body/button[1]"));
        guzik1.isDisplayed();

        WebElement shortGuzik1 = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));
        // shortGuzik1.click();

        By allXpath=By.xpath("//*");
        driver.findElement(allXpath);

        By lastInList=By.xpath("//div/ul/li[last()]");
        WebElement lista=driver.findElement(lastInList);
        lista.isDisplayed();

        By startsWith=By.xpath("//*[starts-with(@name,'fnam')]");
        driver.findElement(startsWith);

        By wystepujaPo=By.xpath("//img/following::*"); // elementy wystepujace po zdjeciu na stronie
        driver.findElement(wystepujaPo);

        By dwaWarunki=By.xpath("//input[@name='fname' and @id='fname']");
        driver.findElement(dwaWarunki).isDisplayed();

        WebElement nazwaUsera = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
        nazwaUsera.click();
        nazwaUsera.clear();
        nazwaUsera.sendKeys("Maciej");
        WebElement haslo = driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
        haslo.click();
        haslo.clear();
        haslo.sendKeys("123");
        WebElement Submit=driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
        Submit.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.accept();

    }
    }