import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Nav {

    WebDriver driver;

    @Test
    public void ext1(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://example.com");
//        driver.close();


        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tabs);
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            System.out.println(window);
            if (driver.getTitle().contains("demosite")) {
                break;
            }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.get("https://example.com");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();

    }
}
