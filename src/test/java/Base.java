import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Base {

    protected WebDriver driver;



    //TESZTADATOK
    String expectedDay = "Day selected :- Saturday";
    String expectedAlert = "This is the place where the content for the modal dialog displays";
    String[] expectedNames = {"Tyreese Burn",
            "Brenda Tree",
            "Glenn Pho shizzle",
            "Brian Hoyies",
            "Glenn Pho shizzle",
            "Arman Cheyia"};

    @BeforeEach
    public void Setup() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-extensions");
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("start-maximized", "--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

   @AfterEach
    public void Dispose(){
        driver.quit();
    }
}
