import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@ClassName='Button']")
    protected List<WebElement> fileMenu;
    @FindBy(xpath = "")
    private List<WebElement> numbersValue;
    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    private WebElement calcResult;




    public void bla() {
        System.out.println(driver.findElements(By.xpath(".//*[@ClassName='Button']")).size());
    }
}
