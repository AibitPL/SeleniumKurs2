import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestCompile {

    @Test
    public void openGooglePage(){
        WebDriver ChromeD=new ChromeDriver();
        ChromeD.get("https://www.google.com");
        //WebDriver FirefoxD=new FirefoxDriver();
        //WebDriver IeDri=new InternetExplorerDriver();
    }
}
