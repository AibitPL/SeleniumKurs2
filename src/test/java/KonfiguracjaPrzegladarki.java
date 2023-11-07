import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class KonfiguracjaPrzegladarki {

  /*  @Test
    public void openBrowser() {
        WebDriverManager.iedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // ptions.withInitialBrowserUrl("https://www.google.com"); // do Internet Eplorer
        options.setHeadless(false); // robi test bez wlaczania przegladarki
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT); // akceptuje alerty na stronie
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('Helllo')"); // symulacja alertu na stronie
        driver.get("https://www.google.com");
    } */
}
