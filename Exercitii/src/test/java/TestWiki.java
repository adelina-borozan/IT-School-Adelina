import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.junit.Assert.assertEquals;

public class TestWiki {

    @Test
    public static void searchWikipedia() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org/");

        driver.findElement(By.id("searchInput")).sendKeys("selenium (software)");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium (software)";

        //HARD Assert
//        assertEquals(actualTitle, expectedTitle, "Verify the page title.");

        //SOFT Assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle, "Verify the page title.");
        System.out.println("Testul este passed!");

        softAssert.assertAll();
        driver.close();
    }
}
