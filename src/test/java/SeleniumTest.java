import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeleniumTest extends Base{

    /*
    Tölts be a böngészőbe az alábbi oldalt: https://demo.seleniumeasy.com/basic-first-form-demo.html
    Írj tesztesetet két szám összegének ellenőrzésére a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. Az oldalon, a Two Input Fields” szekcióban két beviteli mezőjét töltsd ki tetszőleges számokkal, majd végezd el a számok összeadásának ellenőrzését kiolvasva az oldalon megjelenő összeget.
    Használj tetszőleges tesztadatot
     */

    @Test
    public void TestInput()
    {
        InputFieldsPage input = new InputFieldsPage(driver);
        input.navigate();
        input.input();
        String expected = "10";
        Assertions.assertEquals(expected, input.inputCheck());
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: zhttps://demo.seleniumeasy.com/basic-select-dropdown-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet a következők szerint: a Select List Demo szekció lenyíló mezőjében válaszd ki a hét utolsó napját és ellenőrizd, hogy az oldalon helyesen jelenik meg a kiválasztott érték
    Tesztadatként használd az hét utolsó napját
     */

    @Test
    public void SelectDayTest()
    {
        SelectDayPage day = new SelectDayPage(driver);
        day.navigate();
        day.selectDay();
        Assertions.assertEquals(expectedDay, day.selectedDayChecker());
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/bootstrap-modal-demo.html#
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A tesztesetben ellenőrizd a modal alert ablak szöveges tartalmát összahasonlítva egy általad definiált elvárt eredménnyel. Nyisd meg a Single Modal ablakot, tárolt el az ablakon megjelenő szöveget egy változóba és zárd be az ablakot a bezárás gombbal
     */

    @Test
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

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/data-list-filter-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A teszteset ellenőrizze a névjegykártyák tartalmát.Olvasd ki a neveket a megjelenő névjegykártyákról és ellenőrzésként hasonlítsd össze egy elvárt eredményként megadott listával.
    Használj relatív útvonalat a névjegykártya név elemeinek kiolvasásához.
     */

    @Test
    public void NamecardTest()
    {
        NameCardPage card = new NameCardPage(driver);
        card.navigate();
        String[] actual = card.getnames();
        Assertions.assertArrayEquals(expectedNames, actual);
    }

    /*
    Töltsd be az alábbi oldalt a böngészőbe: https://demo.seleniumeasy.com/table-data-download-demo.html
    Írj tesztesetet a mellékelt dokumentumban, majd a tesztlépések alapján írj automatizált tesztet. A tesztesetet ellenőrizze a táblázatból a neveket, amelyeket a táblázat első oszlop tartalmaz. Gyűjtsd össze a neveket és tárold le a names.txt fájlba majd a tesztesetben a fájl tartalmát hasonlítsd össze egy elvárt eredménnyel.
     */

    @Test
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
