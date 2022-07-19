import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NameCardPage extends BasePage{

    WebDriver driver;


    public NameCardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(){
        driver.get(nameCardUrl);
    }

    public String[] getnames() {

        List<WebElement> namesOnCards = driver.findElements(cards);

        String[] namesArray = new String[namesOnCards.size()];
        for (int i = 0; i < namesOnCards.size(); i++) {

            String name = namesOnCards.get(i).getText();
            name = name.replace("Name: ", "");
            namesArray[i] = name;
        }
        return namesArray;
    }




}
