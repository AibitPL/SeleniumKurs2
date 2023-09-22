import org.openqa.selenium.Dimension;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WybierzPrzegladarkeInWielkoscOkna {
    @Test
    public void OpenBrowser() {
        WebDriver driver = GetDriver("Firefox");
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Dimension size=new Dimension(200,200);
        driver.manage().window().setSize(size);
    }

    public WebDriver GetDriver(String przegladarka){
        if(przegladarka.equals("Chrome")){
            return new ChromeDriver();
        }
        else if (przegladarka.equals("Firefox")){
            return new FirefoxDriver();
        }
        else throw new InvalidArgumentException("Invalid browser name");
    }
}