import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public WiniumDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
//        options.setApplicationPath("C:\\Users\\liadt\\AppData\\Local\\WhatsApp\\WhatsApp.exe");

        driver = new WiniumDriver(new URL("http://localhost:9999"),options);
    }

}
