import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;

public class BasePage {

    protected WiniumDriver driver;
    protected WebDriverWait webDriverWait;
    protected final int timeOutInSeconds = 30;

    public BasePage(WiniumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, timeOutInSeconds);
    }

    protected void click(WebElement el) throws InterruptedException {
        Thread.sleep(5000);
        el.click();
    }

    protected String getAttribute(WebElement el, String value) {
        return el.getAttribute(value);
    }
}