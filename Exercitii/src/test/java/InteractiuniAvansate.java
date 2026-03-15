import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class InteractiuniAvansate {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
    }

    @Test
    public void testSelect(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select oldStyleSelectMenu = new Select(oldSelectMenu);

        oldStyleSelectMenu.selectByVisibleText("Blue");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        oldStyleSelectMenu.selectByValue("3");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        oldStyleSelectMenu.selectByIndex(4);
    }

    @Test
    public void testCheckbox(){
        driver.get("https://demoqa.com/checkbox");

        WebElement checkbox = driver.findElement(By.className("rc-tree-checkbox"));

        boolean selected = checkbox.isSelected();
        System.out.println(selected);

        checkbox.click();

        selected = checkbox.isSelected();
        System.out.println(selected);
    }
}
