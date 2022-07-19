import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SeleniumTest extends Base{


    @Test
    @Order(1)
    @DisplayName("Beviteli mezők tesztelése (Two input fields)")
    public void TestInput()
    {
        InputFieldsPage input = new InputFieldsPage(driver);
        input.navigate();
        input.input();
        String expected = "10";
        Assertions.assertEquals(expected, input.inputCheck());
    }

    @Test
    @Order(2)
    @DisplayName("Lenyíló lista tesztelése")
    public void SelectDayTest()
    {
        SelectDayPage day = new SelectDayPage(driver);
        day.navigate();
        day.selectDay();
        Assertions.assertEquals(expectedDay, day.selectedDayChecker());
    }

    @Test
    @Order(3)
    @DisplayName("Felugró ablak ellenőrzése")
    public void AlertTest() throws InterruptedException {
        AlertPage alert = new AlertPage(driver);
        alert.navigate();
        alert.alertOpener();
        Thread.sleep(2000);
        String result = alert.getText();
        Thread.sleep(2000);
        alert.closeAlert();
        Assertions.assertEquals(expectedAlert, result);
    }

    @Test
    @Order(4)
    @DisplayName("Névjegykártyák")
    public void NamecardTest()
    {
        NameCardPage card = new NameCardPage(driver);
        card.navigate();
        String[] actual = card.getnames();
        Assertions.assertArrayEquals(expectedNames, actual);
    }

    @Test
    @Order(5)
    @DisplayName("Táblázat sorai")
    public void TableTest()
    {
        TablePage table = new TablePage(driver);
        table.navigate();
        String[] res = table.getNamesOfTable();
        table.writeNamesToFile(res, "names.txt");
        String actual = table.reader("names.txt");
        String expected = table.reader("expectedNames.txt");
       Assertions.assertEquals(expected, actual);
    }
}
