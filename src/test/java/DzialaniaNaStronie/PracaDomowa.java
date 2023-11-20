package DzialaniaNaStronie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PracaDomowa {

    public boolean PD1(String tekst, WebElement element) {
    Select select=new Select(element);
    List<WebElement> options = select.getOptions();
    for(WebElement option:options){
        if(option.getText().equals(tekst)){
            return true;
        }
    }
    return false;
    }
    }

