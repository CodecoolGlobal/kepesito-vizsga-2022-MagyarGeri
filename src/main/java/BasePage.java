import org.openqa.selenium.By;

public class BasePage {

    String inputUrl = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    final By a = By.xpath("//*[@id=\"sum1\"]");
    final By b = By.xpath("//*[@id=\"sum2\"]");
    final By button = By.xpath("//*[@id=\"gettotal\"]/button");
    final By result = By.xpath("//*[@id=\"displayvalue\"]");
    String aValue = "5";
    String bValue = "5";

    String selectUrl = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    final By dropDown = By.id("select-demo");
    final By lastDay = By.xpath("//option[@value=\"Saturday\"]");
    final By selectedDay = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]");

    String alertUrl = "https://demo.seleniumeasy.com/bootstrap-modal-demo.html#";
    final By launchModal = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
    final By alertText = By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]");
    final By closeAlert = By.xpath("//*[@id=\"myModal0\"]/div/div/div[1]/button");

    String nameCardUrl = "https://demo.seleniumeasy.com/data-list-filter-demo.html";
    final By cards = By.xpath("//*[@class=\"info-block block-info clearfix\"]//h4");

    String tableUrl = "https://demo.seleniumeasy.com/table-data-download-demo.html";
    final By nameOfRows = By.xpath("//tr[@role=\"row\"]//td[1]");








}
