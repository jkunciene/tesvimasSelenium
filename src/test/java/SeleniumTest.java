import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup(){
        Selenium.setup();
    }
    @Test
        public void pridetiaddItem(){
        Selenium.addItem("Frozen","Familie","love");
    }
    @Test
        public void badItemTest(){
        Selenium.badItem("+@@","@</a>@","/@");
    }
    @Test
    public void deleteItemTest(){
        Selenium.deleteItem("36");
    }
    @Test
    public void  updateItemTest(){
        Selenium. updateItem("87","Spider","Action","game");
    }
    @Test
    public void illegalUpdateTest(){
        Selenium.illegalUpdate("67","!!!!","!!!!!","!!!!!!");
    }
//    @AfterTest
//    public void close(){
//        Selenium.close();
//    }
}
