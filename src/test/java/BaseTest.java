import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    public WebDriver driver = null;
    public WiniumDriverService service;
    Process process;

    @BeforeClass
    public void setup() {
        try {
            process = Runtime.getRuntime().exec("taskkill /F /IM Winium.Desktop.Driver.exe");
            process.waitFor();
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        String notepadApplicationPath = "C:/Program Files/WindowsApps/Microsoft.WindowsCalculator_11.2109.9.0_x64__8wekyb3d8bbwe/CalculatorApp.exe";
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath(notepadApplicationPath);

        WiniumDriverService service = new WiniumDriverService.Builder()
                .usingDriverExecutable(new File("C:/Users/liadt/Desktop/Winium software/Winium.Desktop.Driver.exe"))
                .usingPort(9999)
                .withVerbose(true)
                .withSilent(false)
                .buildDesktopService();

        driver = new WiniumDriver(service, options);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        service.stop();

        try {
            process = Runtime.getRuntime().exec("taskkill /F /IM Winium.Desktop.Driver.exe");
            process.waitFor();
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


}
