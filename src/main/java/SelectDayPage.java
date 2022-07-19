import org.openqa.selenium.WebDriver;

public class SelectDayPage extends BasePage{

    WebDriver driver;

    public SelectDayPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(){
        driver.get(selectUrl);
    }

    public void selectDay(){
        driver.findElement(dropDown).click();
        driver.findElement(lastDay).click();
    }

    public String selectedDayChecker(){
        return driver.findElement(selectedDay).getText();
    }


}
