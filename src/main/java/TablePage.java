import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TablePage extends BasePage{

    WebDriver driver;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate(){
        driver.get(tableUrl);
    }

    public String[] getNamesOfTable() {

        List<WebElement> namesInTable = driver.findElements(nameOfRows);

        String[] namesArray = new String[namesInTable.size()];
        for (int i = 0; i < namesInTable.size(); i++) {

            String name = namesInTable.get(i).getText();
            namesArray[i] = name;
        }

        return namesArray;
    }


    public void writeNamesToFile(String[] text, String fileName) {
        //public void write(String text, String fileName) {

        try {
            FileWriter output = new FileWriter(fileName);
            output.write(Arrays.toString(text));
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public String reader(String filename) {
        String res = "";
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return res;
    }
}
