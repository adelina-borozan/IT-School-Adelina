import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class InteractiuniAvansate {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 0)
    public void testSelect() {
        driver.get("https://demoqa.com/select-menu");

        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select oldStyleSelectMenu = new Select(oldSelectMenu);

        oldStyleSelectMenu.selectByVisibleText("Blue");


        oldStyleSelectMenu.selectByValue("3");

        oldStyleSelectMenu.selectByIndex(4);
    }

    @Test(priority = 2)
    public void testCheckbox() {
        driver.get("https://practicesoftwaretesting.com/");

        WebElement checkbox = driver.findElement(By.xpath("//*[@data-test='category-01KKRBJYM9S41205MCHEG5AHEN']"));

        boolean selected = checkbox.isSelected();
        System.out.println("Checkbox selected before click: " + selected);

        checkbox.click();

        selected = checkbox.isSelected();
        System.out.println("Checkbox selected after click: " + selected);
    }

    @Test(groups = {"smoke"}, priority = 1)
    public void testUpload() {

        driver.get("https://demoqa.com/upload-download");

        WebElement uploadInput = driver.findElement(By.id("uploadFile"));

        uploadInput.sendKeys("C:\\Users\\adeli\\Desktop\\test.txt");

        WebElement output = driver.findElement(By.id("uploadedFilePath"));

        String text = output.getText();

        Assert.assertFalse(text.isEmpty(), "Textul este gol");
    }

}