import org.openqa.selenium.WebDriver;

public class InputFieldsPage extends BasePage{

    WebDriver driver;

    public InputFieldsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(){
        driver.get(inputUrl);
    }

    public void input(){
        driver.findElement(a).sendKeys(aValue);
        driver.findElement(b).sendKeys(bValue);
        driver.findElement(button).click();
    }

    public String inputCheck(){
        String data = driver.findElement(result).getText();
        return data;
    }
}
