import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    MainPage mainPage;

    @BeforeMethod
    public void setDrivers() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void test() {
        mainPage.bla();
    }
}
