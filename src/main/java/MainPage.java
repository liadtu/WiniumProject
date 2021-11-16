import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.winium.WiniumDriver;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WiniumDriver driver) {
        super(driver);
    }

    @FindBy(name = "Seven")
    private WebElement button7;
    @FindBy(xpath = "//Custom/Group/Group[5]")
    private List<WebElement> numberPadButtons;
    @FindBy(xpath = "")
    private List<WebElement> numbersValue;
    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    private WebElement calcResult;


    public void bla(String number) throws InterruptedException {
        System.out.println(numberPadButtons.size());
//        for (WebElement el : numberPadButtons) {
//
//            System.out.println(getAttribute(el, "Name"));
////            if (getAttribute(el, "Name").contains(number)) {
////                click(el);
////                break;
////            }
//        }
////        click(button7);
//        Thread.sleep(2000);
//        return getAttribute(calcResult, "Name");

    }
}
