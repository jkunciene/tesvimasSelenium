import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
    static WebDriver browser;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "webdrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php");
    }

    public static void close(){
        browser.close();
    }

    public static void addItem(String keyword, String keyword2, String keyword3){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword3);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();

    }
    public static void badItem(String keyword, String keyword2, String keyword3){
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword3);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();

    }
    public static void deleteItem(String keyword){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement deletefield = browser.findElement(By.name("delete"));
        deletefield.click();

    }
    public static void  updateItem(String keyword,String keyword2,String keyword3,String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();

    }
    public static void illegalUpdate(String keyword,String keyword2,String keyword3,String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement producerField = browser.findElement(By.name("rezisierius"));
        producerField.sendKeys(keyword4);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();

    }

    public static void main(String args[]) {
        System.out.println("Algirdo formos testavimas, apsaugok Dieve");
        setup();
        addItem("Frozen","Familie","love");
        badItem("+@@","@</a>@","/@");
        deleteItem("36");
        updateItem("87","Spider","Action","game");
        illegalUpdate("67","!!!!","!!!!!","!!!!!!");
    }
}
