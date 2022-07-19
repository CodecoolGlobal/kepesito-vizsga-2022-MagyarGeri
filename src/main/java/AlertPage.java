import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage{

    WebDriver driver;


    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(){
        driver.get(alertUrl);
    }

    public void alertOpener(){
        driver.findElement(launchModal).click();
    }

    public String getText(){
       String data = driver.findElement(alertText).getText();
       return data;
    }

    public void closeAlert(){
        driver.findElement(closeAlert).click();
    }
}
