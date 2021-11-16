import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    MainPage mainPage;

    @BeforeMethod
    public void setDrivers() {
        mainPage = new MainPage(driver);
    }

    @Test
    public void test() throws InterruptedException {
        mainPage.bla("");
//        Assert.assertEquals(mainPage.bla("Eight"), "Display is 8");
    }
}
